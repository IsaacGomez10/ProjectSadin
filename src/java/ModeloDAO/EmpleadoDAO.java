/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.EmpleadoVO;
import Util.Conexion;
import Util.Crud;
import java.awt.event.KeyEvent;
import org.apache.poi.ss.usermodel.Row;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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

    private String idEmpleado = "", nombres = "", apellidos = "", idTipoDocumento = "", numeroDocumento = "", telefono = "", email = "", idLugarExpedicion = "", estado = "";

    public EmpleadoDAO() {
    }

    //Recibimos los datos del VO 
    public EmpleadoDAO(EmpleadoVO empVO) {
        super();

        try {
            conexion = this.obtenerConexion();

            idEmpleado = empVO.getIdEmpleado();
            nombres = empVO.getNombres();
            apellidos = empVO.getApellidos();
            idTipoDocumento = empVO.getIdTipoDocumento();
            numeroDocumento = empVO.getNumeroDocumento();
            telefono = empVO.getTelefono();
            email = empVO.getEmail();
            idLugarExpedicion = empVO.getIdLugarExpedicion();
            estado = empVO.getEstado();

        } catch (Exception e) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);

        }
    }

    @Override
    public boolean agregarRegistro() {
        try {
            sql = "insert into empleado (Nombres, Apellidos, IdTipoDocumento, NumeroDocumento, "
                    + "Telefono, Email, IdLugarExpedicion, estado) values (?,?,?,?,?,?,?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, nombres);
            puente.setString(2, apellidos);
            puente.setString(3, idTipoDocumento);
            puente.setString(4, numeroDocumento);
            puente.setString(5, telefono);
            puente.setString(6, email);
            puente.setString(7, idLugarExpedicion);
            puente.setString(8, estado);
            puente.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, e);

        }

        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            sql = "update Empleado set  Nombres =?, Apellidos=?, IdTipoDocumento=?, NumeroDocumento=?, Telefono=?, Email=?, IdLugarexpedicion=?, estado=? where NumeroDocumento=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, nombres);
            puente.setString(2, apellidos);
            puente.setString(3, idTipoDocumento);
            puente.setString(4, numeroDocumento);
            puente.setString(5, telefono);
            puente.setString(6, email);
            puente.setString(7, idLugarExpedicion);
            puente.setString(8, estado);
            puente.setString(9, numeroDocumento);
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
            puente.setString(1, idEmpleado);
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

    public EmpleadoVO consultarEmpleados(String documento) {

        EmpleadoVO empVO = null;

        try {
            conexion = this.obtenerConexion();
            sql = "select * from empleado where NumeroDocumento=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, documento);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                empVO = new EmpleadoVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9));
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

    //lógica de carga masiva
    public boolean cargarUsuarios(String rutaAbsoluta) throws SQLException, IOException {

        try {
            sql = "insert into empleado (Nombres, Apellidos, IdTipoDocumento, NumeroDocumento, Telefono, Email, IdLugarExpedicion, Estado) values (?,?,?,?,?,?,?,?)";
            conexion = obtenerConexion();
            FileInputStream file = new FileInputStream(new File(rutaAbsoluta));

            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
            DataFormatter dataFormater = new DataFormatter();
            int numFilas = sheet.getLastRowNum();

            for (int a = 1; a <= numFilas; a++) {
                Row fila = sheet.getRow(a);

                puente = conexion.prepareStatement(sql);
                puente.setString(1, dataFormater.formatCellValue(fila.getCell(0)));
                puente.setString(2, dataFormater.formatCellValue(fila.getCell(1)));
                puente.setString(3, dataFormater.formatCellValue(fila.getCell(2)));
                puente.setString(4, dataFormater.formatCellValue(fila.getCell(3)));
                puente.setString(5, dataFormater.formatCellValue(fila.getCell(4)));
                puente.setString(6, dataFormater.formatCellValue(fila.getCell(5)));
                puente.setString(7, dataFormater.formatCellValue(fila.getCell(6)));
                puente.setString(8, dataFormater.formatCellValue(fila.getCell(7)));
                puente.execute();
            }
            File buscarArchivo = new File(rutaAbsoluta);
            buscarArchivo.delete();
            operacion = true;
            conexion = cerrarConexion();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return operacion;
    }

    //Listar empleados con sus datos
    public ArrayList<EmpleadoVO> obtenerEmpleados() {
        ArrayList<EmpleadoVO> listaEmpleados = new ArrayList<>();

        try {
            conexion = this.obtenerConexion();
            sql = "select nombres, apellidos, tipodocumento, numeroDocumento, telefono,email,lugarexpedicion,estado from empleado,tipodocumento,lugarexpedicion where empleado.IdTipoDocumento = tipodocumento.IdTipoDocumento and empleado.IdLugarExpedicion = lugarexpedicion.IdLugarExpedicion order by empleado.idempleado asc";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            listaEmpleados = new ArrayList<EmpleadoVO>();

            while (mensajero.next()) {
                EmpleadoVO empVO = new EmpleadoVO();
                
                empVO.setNombres(mensajero.getString("nombres"));
                empVO.setApellidos(mensajero.getString("apellidos"));
                empVO.setIdTipoDocumento(mensajero.getString("tipodocumento"));
                empVO.setNumeroDocumento(mensajero.getString("numeroDocumento"));
                empVO.setTelefono(mensajero.getString("telefono"));
                empVO.setEmail(mensajero.getString("email"));
                empVO.setIdLugarExpedicion(mensajero.getString("lugarExpedicion"));
                empVO.setEstado(mensajero.getString("estado"));

                listaEmpleados.add(empVO);
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
        return listaEmpleados;
    }

}
