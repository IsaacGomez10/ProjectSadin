/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.HorarioVO;
import ModeloVO.JornadaVO;
import Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author isaac
 */
public class JornadaDAO extends Conexion{
    
     //1. Declarar variables
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    
    private boolean operacion = false;
    private String sql;
    
    private String IdJornada = "", Jornada = "";
    
    public JornadaDAO(){
        
    }
    
    public ArrayList<JornadaVO>Listar(){
        ArrayList<JornadaVO> listaJornada = new ArrayList<>();
        try{
            conexion = this.obtenerConexion();
            sql = "select * from jornada";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
            while(mensajero.next()) {    
                JornadaVO jornadaVO = new JornadaVO(mensajero.getString(1), mensajero.getString(2));
                listaJornada.add(jornadaVO);
                
            }
        }catch(SQLException e){
            Logger.getLogger(JornadaDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try{
                this.cerrarConexion();
            }catch(SQLException e){
                Logger.getLogger(JornadaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaJornada;
    }
}
