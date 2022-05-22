/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.EmpleadoVO;
import Util.Conexion;
import Util.Crud;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Damian
 */
public class EmpleadoDAO extends Conexion implements Crud {

    //1. Declaramos la variables
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String IdEmpleado = "", Nombres = "", Apellidos = "", IdTipoDocumento = "", NumeroDocumento = "", Telefono = "", Email = "", IdLugarExpedicion = "";

    public EmpleadoDAO() {
    }

    //Recibimos los datos del VO 
    public EmpleadoDAO(EmpleadoVO EmpVO) {
        super();

        try {
            conexion = this.obtenerConexion();

            IdEmpleado = EmpVO.getIdEmpleado();
            Nombres = EmpVO.getNombres();
            Apellidos = EmpVO.getApellidos();
            IdTipoDocumento = EmpVO.getIdTipoDocumento();
            NumeroDocumento = EmpVO.getNumeroDocumento();
            Telefono = EmpVO.getTelefono();
            Email = EmpVO.getEmail();
            IdLugarExpedicion = EmpVO.getIdLugarExpedicion();

        } catch (Exception e) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);

        }
    }

    @Override
    public boolean agregarRegistro() {
        try {
            sql = "insert into empleado (Nombres, Apellidos, IdTipoDocumento, NumeroDocumento, "
                    + "Telefono, Email, IdLugarExpedicion) values (?,?,?,?,?,?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Nombres);
            puente.setString(2, Apellidos);
            puente.setString(3, IdTipoDocumento);
            puente.setString(4, NumeroDocumento);
            puente.setString(5, Telefono);
            puente.setString(6, Email);
            puente.setString(7, IdLugarExpedicion);
            puente.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);

            }
        }
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            sql = "update Empleado set  Nombres =?, Apellidos=?, IdTipoDocumento=?, NumeroDocumento=?, Telefono=?, Email=?, IdLugarexpedicion=? where NumeroDocumento=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Nombres);
            puente.setString(2, Apellidos);
            puente.setString(3, IdTipoDocumento);
            puente.setString(4, NumeroDocumento);
            puente.setString(5, Telefono);
            puente.setString(6, Email);
            puente.setString(7, IdLugarExpedicion);
            puente.setString(8, NumeroDocumento);
            puente.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);

            }
        }
        return operacion;
    }

    @Override
    public boolean eliminarRegistro() {

        try {
            sql = "delete from empleado where empleado.idempleado = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, IdEmpleado);
            puente.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);

            }
        }
        return operacion;
    }

    public EmpleadoVO consultarEmpleados(String numDocumento) {

        EmpleadoVO empVO = null;

        try {
            conexion = this.obtenerConexion();
            sql = "select * from empleado where NumeroDocumento=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, numDocumento);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                empVO = new EmpleadoVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8));
            }

        } catch (SQLException e) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return empVO;
    }

    //Validaciones de dato ya existentes en la base de dato
    public int documentoExistente(String documento) {

        try {
            //La sentencia sql permite bucar si el dato que se ingreso ya lo tiene un id
            sql = "select count(idempleado) from empleado where NumeroDocumento = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, documento);
            mensajero = puente.executeQuery();

            if (mensajero.next()) {
                //Si ese dato fue encontrado y pertenece a un id, el dato no podra ser registrado
                return mensajero.getInt(1);
            }

            //Finalmente se retorna que el dato se encuentra en un id
            return 1;

        } catch (Exception e) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);
            return 1;

        }
    }

    public int telefonoExistente(String telefono) {

        try {
            //La sentencia sql permite bucar si el dato que se ingreso ya lo tiene un id
            sql = "select count(idempleado) from empleado where Telefono = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, telefono);
            mensajero = puente.executeQuery();

            if (mensajero.next()) {
                //Si ese dato fue encontrado y pertenece a un id, el dato no podra ser registrado
                return mensajero.getInt(1);
            }
            //Finalmente se retorna que el dato se encuentra en un id
            return 1;

        } catch (Exception e) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);
            return 1;

        }
    }

    public int emailExistente(String email) {

        try {
            //La sentencia sql permite bucar si el dato que se ingreso ya lo tiene un id
            sql = "select count(idempleado) from empleado where Email = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, email);
            mensajero = puente.executeQuery();

            if (mensajero.next()) {
                //Si ese dato fue encontrado y pertenece a un id, el dato no podra ser registrado
                return mensajero.getInt(1);
            }
            //Finalmente se retorna que el dato se encuentra en un id
            return 1;

        } catch (Exception e) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);
            return 1;

        }
    }

}
