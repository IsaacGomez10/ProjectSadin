/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloSolicitudDAO;

import ModeloSolicitudVO.SolicitudVO;
import Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author isaac
 */
public class SolicitudDAO extends Conexion {

    //1. Declarar variables y objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String NumeroDocumento;

    public SolicitudDAO() {
    }

    public SolicitudDAO(SolicitudVO solVO) {
        super();

        try {

            //3. Conectarse
            conexion = this.obtenerConexion();
            //4. Traer al DAO los datos del VO para hacer las operaciones
            NumeroDocumento = solVO.getNumeroDocumento();

        } catch (Exception e) {
            Logger.getLogger(SolicitudDAO.class.getName()).log(Level.SEVERE, null, e);

        }
    }
    
    
    public SolicitudVO SolicitarCertificado(String numeroDocumento) {

        SolicitudVO solVO = null;

        try {
            conexion = this.obtenerConexion();
            sql = "select e.IdEmpleado from contrato c\n"
                    + "inner join empleado e on c.IdEmpleado = e.IdEmpleado\n"
                    + "where e.NumeroDocumento = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, numeroDocumento);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                solVO = new SolicitudVO(mensajero.getString(1));
            }

        } catch (Exception e) {
            Logger.getLogger(SolicitudDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(SolicitudDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return solVO;
    }

}
