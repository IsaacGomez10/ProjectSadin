/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.LugarExpedicionVO;
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
 * @author Sena
 */
public class LugarExpedicionDAO extends Conexion{
    
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    
    private String sql;
    
    public ArrayList<LugarExpedicionVO> Listar(){
        ArrayList<LugarExpedicionVO> listaLugarExpedicion = new ArrayList<>();
        
        try {
            conexion = this.obtenerConexion();
            sql = "select * from lugarexpedicion";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
            while (mensajero.next()) {                
                LugarExpedicionVO lugarVO = new LugarExpedicionVO(mensajero.getString(1), mensajero.getString(2));
                
                listaLugarExpedicion.add(lugarVO);
            }
            
        } catch (SQLException e) {
            Logger.getLogger(LugarExpedicionDAO.class.getName()).log(Level.SEVERE,null,e);
        }finally{
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(LugarExpedicionDAO.class.getName()).log(Level.SEVERE,null,e); 
            }
        }
        
        return listaLugarExpedicion;
    }
    
}
