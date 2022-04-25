/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.ContratoVO;
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
public class ContratoDAO extends Conexion implements Crud {
    
    //1. Declarar variables y objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String IdContrato = "", FechaContratacion = "", FechaFinalizacion = "", Salario = "", IdHorario = "", IdCargo = "", IdTipoContrato = "", IdEmpleado = "", IdJornada = "",IdDependencia = "";

    public ContratoDAO() {
    }

    //2. Metodo principal para recibir los datos del VO
    public ContratoDAO(ContratoVO conVO) {
        super();

        try {

            //3. Conectarse
            conexion = this.obtenerConexion();
            //4. Traer al DAO los datos del VO para hacer las operaciones
            IdContrato = conVO.getIdContrato();
            FechaContratacion = conVO.getFechaContratacion();
            FechaFinalizacion = conVO.getFechaFinalizacion();
            Salario = conVO.getSalario();
            IdHorario = conVO.getIdHorario();
            IdCargo = conVO.getIdCargo();
            IdTipoContrato = conVO.getIdTipoContrato();
            IdEmpleado = conVO.getIdEmpleado();
            IdJornada = conVO.getIdJornada();
            IdDependencia = conVO.getIdDependencia();

        } catch (Exception e) {
            Logger.getLogger(ContratoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    @Override
    public boolean agregarRegistro() {
        
        try {

            sql = "insert into contrato(FechaContratacion, FechaFinalizacion, Salario, IdHorario, IdCargo, IdTipoContrato, IdEmpleado, IdJornada,IdDependencia) values(?,?,?,?,?,?,?,?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, FechaContratacion);
            puente.setString(2, FechaFinalizacion);
            puente.setString(3, Salario);
            puente.setString(4, IdHorario);
            puente.setString(5, IdCargo);
            puente.setString(6, IdTipoContrato);
            puente.setString(7, IdEmpleado);
            puente.setString(8, IdJornada);
            puente.setString(9, IdDependencia);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(ContratoDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(ContratoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
