/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.ContratoVO;
import ModeloVO.EmpleadoVO;
import Util.Conexion;
import Util.Crud;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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
    private String lastIdEmpleado;

    private String NumeroDocumento = "", IdContrato = "", FechaContratacion = "", FechaFinalizacion = "", Salario = "", IdHorario = "", IdCargo = "", IdDependencia = "", IdTipoContrato = "", IdEmpleado = "", IdJornada = "";

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
            IdEmpleado = conVO.getIdEmpleado();
            FechaContratacion = conVO.getFechaContratacion();
            FechaFinalizacion = conVO.getFechaFinalizacion();
            Salario = conVO.getSalario();
            IdCargo = conVO.getIdCargo();
            IdDependencia = conVO.getIdDependencia();
            IdTipoContrato = conVO.getIdTipoContrato();
            IdJornada = conVO.getIdJornada();
            IdHorario = conVO.getIdHorario();

        } catch (Exception e) {
            Logger.getLogger(ContratoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean agregarRegistro() {

        try {

            sql = "insert into contrato(IdEmpleado, FechaContratacion, FechaFinalizacion, Salario, IdCargo,IdDependencia, "
                    + "IdTipoContrato, IdJornada, IdHorario) values(?,?,?,?,?,?,?,?,?)";
            puente = conexion.prepareStatement(sql);

            puente.setString(1, IdEmpleado);
            puente.setString(2, FechaContratacion);
            puente.setString(3, FechaFinalizacion);
            puente.setString(4, Salario);
            puente.setString(5, IdCargo);
            puente.setString(6, IdDependencia);
            puente.setString(7, IdTipoContrato);
            puente.setString(8, IdJornada);
            puente.setString(9, IdHorario);
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
        try {
            sql = "update contrato set FechaFinalizacion= ?, Salario=?, IdCargo=?, IdDependencia=?, IdTipoContrato=?, IdJornada=?, IdHorario=? where idempleado = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, FechaFinalizacion);
            puente.setString(2, Salario);
            puente.setString(3, IdCargo);
            puente.setString(4, IdDependencia);
            puente.setString(5, IdTipoContrato);
            puente.setString(6, IdJornada);
            puente.setString(7, IdHorario);
            puente.setString(8, IdEmpleado);
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

    public ContratoVO consultarContratos(String id) {

        ContratoVO conVO = null;

        try {
            conexion = this.obtenerConexion();
            sql = "select * from contrato c inner join empleado e on c.IdEmpleado = e.IdEmpleado where e.NumeroDocumento =?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, id);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                conVO = new ContratoVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9), mensajero.getString(10));
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

        return conVO;
    }

    public ContratoVO actualizarDatos(String id) {

        ContratoVO conVO = null;

        try {
            conexion = this.obtenerConexion();
            sql = "select c.FechaFinalizacion,c.Salario,cg.NombreCargo,dc.Dependencia,tc.Contrato,j.Jornada,h.HorarioLaboral from contrato c inner join cargo cg on c.IdCargo = cg.IdCargo inner join dependenciacargos dc on c.IdDependencia = dc.IdDependencia inner join tipocontrato tc on c.IdTipoContrato = tc.IdTipoContrato inner join jornada j on c.IdJornada = j.IdJornada inner join horario h on c.IdHorario = h.IdHorario inner join empleado e on c.IdEmpleado = e.IdEmpleado where e.NumeroDocumento = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, id);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                conVO = new ContratoVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3),
                        mensajero.getString("c.FechaFinalizacion"), mensajero.getString("c.Salario"),
                        mensajero.getString("cg.NombreCargo"), mensajero.getString("dc.Dependencia"),
                        mensajero.getString("tc.Contrato"), mensajero.getString("j.Jornada"),
                        mensajero.getString("h.HorarioLaboral"));
            }

        } catch (SQLException e) {
            Logger.getLogger(ContratoDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return conVO;
    }

    public boolean cargarContrato(String rutaAbsoluta) throws SQLException, IOException {

        try {
            sql = "insert into contrato(IdEmpleado, FechaContratacion, FechaFinalizacion, Salario, IdCargo,IdDependencia, "
                    + "IdTipoContrato, IdJornada, IdHorario) values(?,?,?,?,?,?,?,?,?)";
            conexion = obtenerConexion();
            FileInputStream file = new FileInputStream(new File(rutaAbsoluta));

            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
            DataFormatter dataFormater = new DataFormatter();
            int numFilas = sheet.getLastRowNum();

            //SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
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
                puente.setString(9, dataFormater.formatCellValue(fila.getCell(8)));

                puente.execute();
            }
            File buscarArchivo = new File(rutaAbsoluta);
            buscarArchivo.delete();
            operacion = true;
            conexion = cerrarConexion();
        } catch (Exception e) {
            Logger.getLogger(ContratoDAO.class.getName()).log(Level.SEVERE, null, e);

        }

        return operacion;
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
