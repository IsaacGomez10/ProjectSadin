/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.TipoDocumentoVO;
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
 * @author casti
 */
public class TipoDocumentoDAO extends Conexion{
    
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    
    private String sql;
    
    public ArrayList<TipoDocumentoVO> Listar(){
        ArrayList<TipoDocumentoVO> listaTipoDocumento = new ArrayList<>();
        
        try{
            conexion = this.obtenerConexion();
            sql = "select * from tipodocumento";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
            while (mensajero.next()) {                
                TipoDocumentoVO tipoDocVO = new TipoDocumentoVO(mensajero.getString(1), mensajero.getString(2));
                
                listaTipoDocumento.add(tipoDocVO);
            }
            
        }catch(SQLException e){
            Logger.getLogger(TipoDocumentoDAO.class.getName()).log(Level.SEVERE,null,e);
        }finally{
            try{
                this.cerrarConexion();
            }catch(SQLException e){
                Logger.getLogger(TipoDocumentoDAO.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        
        return listaTipoDocumento;
    }
}
