package ModeloDAO;

import ModeloVO.SolicitudVO;
import Util.CertificadoCrud;
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
 * @author isaac
 */
public class SolicitudDAO extends Conexion implements Crud, CertificadoCrud {

    //1. Declarar variables y objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String IdSolicitud = "", FechaSolicitud = "", Destinatario = "", IdEmpleado = "";

    public SolicitudDAO() {
    }

    public SolicitudDAO(SolicitudVO solVO) {
        super();

        try {

            //3. Conectarse
            conexion = this.obtenerConexion();
            //4. Traer al DAO los datos del VO para hacer las operaciones
            IdSolicitud = solVO.getIdSolicitud();
            FechaSolicitud = solVO.getFechaSolicitud();
            Destinatario = solVO.getDestinatario();
            IdEmpleado = solVO.getIdEmpleado();

        } catch (Exception e) {
            Logger.getLogger(SolicitudDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
   
    @Override
    public boolean agregarRegistro() {
        try {

            sql = "insert into solicitud(FechaSolicitud, Destinatario, IdFirma, IdEmpleado, IdContrato, IdTipoCertificado) values (?,?,1,?,null,null)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, FechaSolicitud);
            puente.setString(2, Destinatario);
            puente.setString(3, IdEmpleado);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(SolicitudDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(SolicitudDAO.class.getName()).log(Level.SEVERE, null, e);
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

    
    //Solicitar Certificado seleccionado
    @Override
    public boolean Certificado1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Certificado2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Certificado3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Certificado4() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
