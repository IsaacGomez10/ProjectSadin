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

    private String IdContrato = "", FechaContratacion = "", FechaFinalizacion = "", Salario = "", IdHorario = "", IdCargo = "", IdDependencia = "", IdTipoContrato = "", IdEmpleado = "", IdJornada = "";

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
    public boolean actualizarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
