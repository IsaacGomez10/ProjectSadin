/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.CargoVO;
import ModeloVO.DependenciaVO;
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
 * @author isaac
 */
public class DependenciaDAO extends Conexion implements Crud {

    //1. Declarar variables y objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String IdDependencia = "", Dependencia = "";

    public DependenciaDAO() {
    }

    //2. Metodo principal para recibir los datos del VO
    public DependenciaDAO(DependenciaVO depenVO) {
        super();

        try {
            //3. Conectarse
            conexion = this.obtenerConexion();
            //4. Traer al DAO los datos del VO para hacer las operaciones
            IdDependencia = depenVO.getIdDependencia();
            Dependencia = depenVO.getDependencia();

        } catch (Exception e) {
            Logger.getLogger(CargoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean agregarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<DependenciaVO> Listar(){
        ArrayList<DependenciaVO> listaDependencia = new ArrayList<>();
        
        try {
            conexion = this.obtenerConexion();
            sql= "select * from dependenciacargos";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
        while(mensajero.next()){
            
           DependenciaVO depenVO = new  DependenciaVO(mensajero.getString(1),mensajero.getString(2));
            
           listaDependencia.add(depenVO);
        }
            
           
        } catch (SQLException e) {
            Logger.getLogger(DependenciaDAO.class.getName()).log(Level.SEVERE,null,e);
        }finally{
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(DependenciaDAO.class.getName()).log(Level.SEVERE,null,e); 
            }
        }
    
        return listaDependencia;
    }
}
