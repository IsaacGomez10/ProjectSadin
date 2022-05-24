/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.FuncionarioVO;
import Util.Conexion;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    private String IdFuncionario = "", Usuario = "", Password = "", IdEmpleado = "";

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
            puente.setString(2, Password);
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
            puente.setString(1, Password);
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
            puente.setString(2, clave);
            mensajero = puente.executeQuery();

            if (mensajero.next()) {
                
                funVO = new FuncionarioVO(mensajero.getString(1),mensajero.getString(2),mensajero.getString(3),mensajero.getString(4));
 
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
        String[] Minus = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] Numeros = new String[]{"1","2","3","4","5","6","7","8","9","0"};
        String[] CaracteresEsp = new String[]{"+","-","*","/","=","%","&","#","!","?","°","|",":",";",",","."};
        
        StringBuilder Caracteres = new StringBuilder();
        Caracteres.append(Mayus);
        Caracteres.append(Minus);
        Caracteres.append(Numeros);
        Caracteres.append(CaracteresEsp);
        
        StringBuilder Password = new StringBuilder();
        for (int i = 0; i <= 10; i++){
            int Cantidad = Caracteres.length();
            int NumeroRandom = (int)(Math.random()*Cantidad);
            
            Password.append((Caracteres.toString()).charAt(NumeroRandom));
        }
        
        return Password.toString();
    }
}
