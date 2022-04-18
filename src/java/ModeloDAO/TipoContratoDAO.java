/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.TipoContratoVO;
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
public class TipoContratoDAO extends Conexion{
    
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    
    private String sql;
    
    public ArrayList<TipoContratoVO> Listar(){
        ArrayList<TipoContratoVO> listaTipoContrato = new ArrayList<>();
        
        try {
            conexion = this.obtenerConexion();
            sql= "select * from tipocontrato";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
        while(mensajero.next()){
            
           TipoContratoVO tipoConVO = new  TipoContratoVO(mensajero.getString(1), mensajero.getString(2));
            
           listaTipoContrato.add(tipoConVO);
        }
            
           
        } catch (SQLException e) {
            Logger.getLogger(TipoContratoDAO.class.getName()).log(Level.SEVERE,null,e);
        }finally{
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(TipoContratoDAO.class.getName()).log(Level.SEVERE,null,e); 
            }
        }
    
        return listaTipoContrato;
    }
}
