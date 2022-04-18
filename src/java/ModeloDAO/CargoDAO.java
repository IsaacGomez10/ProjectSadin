/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.CargoVO;
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
 * @author Sena
 */
public class CargoDAO extends Conexion implements Crud{
    
     //1. Declarar variables y objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String IdCargo = "", NombreCargo = "", DescripcionCargo = "", Dependencia ="";

    public CargoDAO() {
    }
    
    //2. Metodo principal para recibir los datos del VO
    public CargoDAO(CargoVO carVO) {
        super();

        try {

            //3. Conectarse
            conexion = this.obtenerConexion();
            //4. Traer al DAO los datos del VO para hacer las operaciones
            IdCargo = carVO.getIdCargo();
            NombreCargo = carVO.getNombreCargo();
            DescripcionCargo = carVO.getDescripcionCargo();
            Dependencia = carVO.getDependencia();

        } catch (Exception e) {
            Logger.getLogger(CargoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean agregarRegistro() {
        
        try {
            sql = "insert into cargo(NombreCargo,DescripcionCargo,Dependencia) values(?,?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, NombreCargo);
            puente.setString(2, DescripcionCargo);
            puente.setString(3, Dependencia);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(CargoDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(CargoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        
        try {

            sql = "update cargo set NombreCargo,Descripcioncargo,Dependencia where IdCargo=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, NombreCargo);
            puente.setString(2, DescripcionCargo);
            puente.setString(3, Dependencia);
            puente.setString(4, IdCargo);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(CargoDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(CargoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;
        
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<CargoVO> Listar(){
        ArrayList<CargoVO> listaCargo = new ArrayList<>();
        
        try {
            conexion = this.obtenerConexion();
            sql= "select * from cargo";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            
        while(mensajero.next()){
            
           CargoVO carVO = new  CargoVO(mensajero.getString(1),mensajero.getString(2));
            
           listaCargo.add(carVO);
        }
            
           
        } catch (SQLException e) {
            Logger.getLogger(CargoDAO.class.getName()).log(Level.SEVERE,null,e);
        }finally{
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(CargoDAO.class.getName()).log(Level.SEVERE,null,e); 
            }
        }
    
        return listaCargo;
    }
    
}
