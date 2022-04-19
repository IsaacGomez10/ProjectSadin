
package Reporte;

import Util.Conexion;
import java.io.IOException;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class Reporte {

    public static void main(String[] args) throws IOException, JRException {
        JasperReport archivo = JasperCompileManager.compileReport("Certificado1.jrxml");    
        //Map<String,Object> map = new HashMap<String, Object>();
        Conexion con = new Conexion();
        //JRDataSource data = new JREmptyDataSource();
        JasperPrint prin = JasperFillManager.fillReport(archivo,null,con.obtenerConexion());
        JasperExportManager.exportReportToPdfFile(prin,"Certificado.pdf");
    }
    
}
