/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.HorarioVO;
import Util.Conexion;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author casti
 */
public class HorarioDAO extends Conexion implements Crud{
    
    //1. Declarar variables
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    
    private boolean operacion = false;
    private String sql;
    
    private String idHorario="", horarioLaboral="";
    
    public HorarioDAO(){
    }
    
    public HorarioDAO(HorarioVO horarioVO){
        super();
        
        try{
            //3. Conectarse
            conexion = this.obtenerConexion();
            idHorario = horarioVO.getIdHorario();
            horarioLaboral = horarioVO.getHorarioLaboral();
        }catch(Exception e){
            Logger.getLogger(HorarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean agregarRegistro() {
        try{
            sql="insert into horario (idHorario, horarioLaboral) values(?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idHorario);
            puente.setString(2, horarioLaboral);
            puente.executeUpdate();
            operacion = true;
            
        }catch(SQLException e){
            Logger.getLogger(HorarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{
                this.cerrarConexion();
            }catch(SQLException e){
                Logger.getLogger(HorarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try{
            sql = "update horario set horarioLaboral=? where idHorario=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, horarioLaboral);
            puente.setString(2, idHorario);
            puente.executeUpdate();
            operacion = true;
        }catch(SQLException e){
            Logger.getLogger(HorarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{
                this.cerrarConexion();
            }catch(SQLException e){
                Logger.getLogger(HorarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        
        return operacion;
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<HorarioVO>Listar(){
        ArrayList<HorarioVO> listaHorario = new ArrayList<>();
        
        try{
            conexion = this.obtenerConexion();
            sql = "select * from horario";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
            while(mensajero.next()) {    
                HorarioVO horarioVO = new HorarioVO(mensajero.getString(1), mensajero.getString(2));
                listaHorario.add(horarioVO);
                
            }
        }catch(SQLException e){
            Logger.getLogger(HorarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{
                this.cerrarConexion();
            }catch(SQLException e){
                Logger.getLogger(HorarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        
        return listaHorario;
    }
    
}
