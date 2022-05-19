/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.CorreoVO;
import Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author USUARIO
 */
public class CorreoDAO{

    private boolean operacion = false;

    private String CorreoEnvia = "",Password = "",Destino = "", Asunto = "", Mensaje = "";

    public CorreoDAO() {
    }

    public CorreoDAO(CorreoVO corVO) {
        super();

        try {

            //3. Conectarse
            //conexion = this.obtenerConexion();
            //4. Traer al DAO los datos del VO para hacer las operaciones
            CorreoEnvia = corVO.getCorreoEnvia();
            Password = corVO.getPassword();
            Destino = corVO.getDestino();
            Asunto = corVO.getAsunto();
            Mensaje = corVO.getMensaje();

        } catch (Exception e) {
            Logger.getLogger(CorreoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public boolean EnviarCorreo() {
        

        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth", "true");

        //mbbhrvzudznyzuiu
        Session sesion = Session.getDefaultInstance(propiedad);

        CorreoEnvia = "sadincertificados@gmail.com";
        Password = "alkqzoenutvmmirs";

        MimeMessage mensaje = new MimeMessage(sesion);
        try {

            mensaje.setFrom(new InternetAddress(CorreoEnvia));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(Destino));
            mensaje.setSubject(Asunto);
            mensaje.setText(Mensaje);

            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(CorreoEnvia, Password);
            transporte.sendMessage(mensaje, mensaje.getRecipients(Message.RecipientType.TO));
            transporte.close();

            operacion = true;

        } catch (AddressException e) {
            Logger.getLogger(CorreoDAO.class.getName()).log(Level.SEVERE, null, e);
        } catch (MessagingException e) {
            Logger.getLogger(CorreoDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return operacion;
    }

}
