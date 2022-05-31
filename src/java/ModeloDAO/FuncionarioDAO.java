/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.FuncionarioVO;
import Util.Conexion;
import Util.Crud;
import com.sun.org.apache.xml.internal.security.utils.Base64;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Sena
 */
public class FuncionarioDAO extends Conexion implements Crud {

    //1. Declarar variables y objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String IdFuncionario = "", Usuario = "", Password = "", IdEmpleado = "", Destino = "", Asunto = "", Mensaje = "";
    private String Llave = "SadinCertificados";

    public FuncionarioDAO() {
    }

    //2. Metodo principal para recibir los datos del VO
    public FuncionarioDAO(FuncionarioVO funVO) {
        super();

        try {

            //3. Conectarse
            conexion = this.obtenerConexion();
            //4. Traer al DAO los datos del VO para hacer las operaciones
            IdFuncionario = funVO.getIdFuncionario();
            Usuario = funVO.getUsuario();
            Password = funVO.getPassword();
            IdEmpleado = funVO.getIdEmpleado();
            Destino = funVO.getDestino();
            Asunto = funVO.getAsunto();
            Mensaje = funVO.getMensaje();

        } catch (Exception e) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean agregarRegistro() {

        try {

            sql = "insert into funcionario (Usuario,Password,IdEmpleado) values(?,?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Usuario);
            puente.setString(2, Encriptar(Password));
            puente.setString(3, IdEmpleado);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;

    }

    @Override
    public boolean actualizarRegistro() {

        try {

            sql = "update funcionario set PASSWORD=? where USUARIO=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Encriptar(Password));
            puente.setString(2, Usuario);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;

    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public FuncionarioVO iniciarSesion(String usuario, String clave) {

        FuncionarioVO funVO = null;

        try {
            conexion = this.obtenerConexion();
            sql = "select * from funcionario where USUARIO=? and PASSWORD=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, usuario);
            puente.setString(2, Encriptar(clave));
            mensajero = puente.executeQuery();

            if (mensajero.next()) {

                funVO = new FuncionarioVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4));

            }

        } catch (SQLException e) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return funVO;
    }

    public String GenerarContraseña() {

        String[] Mayus = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] Minus = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] Numeros = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String[] CaracteresEsp = new String[]{"+", "-", "*", "/", "=", "%", "&", "#", "!", "?", "°", "|", ":", ";", ",", "."};

        StringBuilder Caracteres = new StringBuilder();
        Caracteres.append(Mayus);
        Caracteres.append(Minus);
        Caracteres.append(Numeros);
        Caracteres.append(CaracteresEsp);

        StringBuilder Password = new StringBuilder();
        for (int i = 0; i <= 10; i++) {
            int Cantidad = Caracteres.length();
            int NumeroRandom = (int) (Math.random() * Cantidad);

            Password.append((Caracteres.toString()).charAt(NumeroRandom));
        }

        return Password.toString();
    }

    public boolean EnviarCorreo() {

        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth", "true");

        Session sesion = Session.getDefaultInstance(propiedad);

        String CorreoEnvia = "sadincertificados@gmail.com";
        String PasswordCorreo = "mcdxbnofhnowxxth";

        MimeMessage mensaje = new MimeMessage(sesion);
        try {

            mensaje.setFrom(new InternetAddress(CorreoEnvia));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(Destino));
            mensaje.setSubject(Asunto);
            mensaje.setText(Mensaje);

            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(CorreoEnvia, PasswordCorreo);
            transporte.sendMessage(mensaje, mensaje.getRecipients(Message.RecipientType.TO));
            transporte.close();

            operacion = true;

        } catch (AddressException e) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } catch (MessagingException e) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return operacion;
    }

    public SecretKeySpec CrearClave(String llave) {

        try {
            byte[] cadena = llave.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            cadena = md.digest(cadena);
            cadena = Arrays.copyOf(cadena, 16);
            SecretKeySpec secretKeyspec = new SecretKeySpec(cadena, "AES");
            return secretKeyspec;

        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public String Encriptar(String encriptar) {

        try {
            SecretKeySpec secrecKeySpec = CrearClave(Llave);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secrecKeySpec);

            byte[] cadena = encriptar.getBytes("UTF-8");
            byte[] encriptada = cipher.doFinal(cadena);
            String cadenaEncriptada = Base64.encode(encriptada);
            return cadenaEncriptada;
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, e);
            return "";
        }
    }

    //validación para verificar si el empleado esta activo
    public int estadoEmpleado(String Usuario) {

        try {
            //La sentencia sql permite bucar si el dato que se ingreso ya lo tiene un id
            sql = "select estado from empleado where numerodocumento = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Usuario);
            mensajero = puente.executeQuery();

            if (mensajero.next()) {
                //Si ese dato fue encontrado y pertenece a un id, el dato no podra ser registrado
                return mensajero.getInt(1);
            }
            //Finalmente se retorna que el dato se encuentra en un id
            return 1;

        } catch (Exception e) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);
            return 1;

        }
    }
}
