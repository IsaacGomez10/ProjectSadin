package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.EmpleadoVO;
import java.sql.*;
import java.io.*;
import java.util.*;

public final class PruebaConsultaDatos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>paginacion en JSP</title>\n");
      out.write("    <body bgcolor=\"#FFFFFF\">\n");
      out.write("        <form method=\"post\" action=\"Empleado\">\n");
      out.write("            ");

                int registros = 10;
                int registroActual = 1;

                // Cargamos el Driver de MySQL
                Class.forName("com.mysql.jdbc.Driver");
                // Creamos una conección a MySQL, Sintaxis:
                // jdbc:mysql://[servidor]:[puerto]/[base de datos], usuario, contraseña
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/sadin", "root", "");
                // Creamos un Statement
                Statement puente = conexion.createStatement();

                String direccion = request.getParameter("direccion");
                if (direccion == null) {
                    direccion = "";
                }
                if (direccion.equals("")) {
                    registroActual = 1;
                }
            
      out.write("\n");
      out.write("            <p>\n");
      out.write("                ");

                    // LOS PARAMETROS DE SIG. O ANT. Y EL REGISTRO ACTUAL
                    String empezar = request.getParameter("actual");
                    if (empezar == null) {
                        empezar = "";
                    }
                    //VARIABLE PARA EL REGISTRO ACTUAL DONDE SE ENCUENTRA
                    // SI SE LE HA PASADO PARAMETRO DE BUSQUEDA SE LE PONE AL RegistroActual
                    if (!(empezar.equals(""))) {
                        if (Integer.parseInt(empezar) <= 0) {
                            registroActual = 1;
                        } else {
                            registroActual = Integer.parseInt(empezar);
                        }
                    }
                    // **
                    // SACA EL NUMERO DE REGISTROS DE LA TABLA
                    // *****************************************
                    int intTotalReg = 1;
                    Statement s1 = conexion.createStatement();
                    ResultSet totalRegistros = s1.executeQuery("select count(idempleado) as totalRegistros FROM empleado ");
                    if (totalRegistros != null) {
                        totalRegistros.next();
                        intTotalReg = totalRegistros.getInt("totalRegistros");
                    }
                    totalRegistros.close();
                    s1.close();
                    // FIN DEL NUMERO DE REGISTRO DE LA TABLA
                    //***************************************
                    Statement puentes = conexion.createStatement();
                    String sql = " select nombres, apellidos, tipodocumento, numeroDocumento, telefono,email,lugarexpedicion,estado from empleado,tipodocumento,lugarexpedicion where empleado.IdTipoDocumento = tipodocumento.IdTipoDocumento and empleado.IdLugarExpedicion = lugarexpedicion.IdLugarExpedicion order by empleado.idempleado asc";
                    ResultSet mensajero = puentes.executeQuery(sql);
                    if (intTotalReg > 0 && (mensajero.next() || registroActual >= 1)) {
                        mensajero.absolute(registroActual);
                        if (!mensajero.isFirst()) {
                            mensajero.previous();
                        }
                        int contador = 1;
                
      out.write("\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Nombres</th>\n");
      out.write("                        <th>Apellidos</th>\n");
      out.write("                        <th>Tipo de documento</th>\n");
      out.write("                        <th>Número de documento</th>\n");
      out.write("                        <th>Teléfono</th>\n");
      out.write("                        <th>Correo electrónico</th>\n");
      out.write("                        <th>Lugar expedición</th>\n");
      out.write("                        <th>Estado actual</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                ");

                    int i = 1;
                    do {
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(mensajero.getString("nombres"));
      out.write("</td>\n");
      out.write("                    <td> ");
      out.print(mensajero.getString("apellidos"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(mensajero.getString("tipodocumento"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(mensajero.getString("numerodocumento"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(mensajero.getString("telefono"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(mensajero.getString("email"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(mensajero.getString("lugarexpedicion"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(mensajero.getString("estado"));
      out.write("</td>\n");
      out.write("\n");
      out.write("                <input name=\"txtNumeroDocumento\" value=\"");
      out.print(mensajero.getString("numerodocumento"));
      out.write("\" type=\"hidden\">\n");
      out.write("                <td><button>Editar</button></td>\n");
      out.write("                <input type=\"hidden\" value=\"3\" name=\"opcion\">\n");
      out.write("                </tr>\n");
      out.write("                ");

                        if (mensajero.isLast()) {
                            break;
                        }
                        i++;
                        contador++;
                    } while (i <= registros && mensajero.next());
                    if (contador == registros) {
                        registroActual = mensajero.getRow();
                    } else {
                        registroActual = mensajero.getRow() + (registros - contador);
                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            ");
 if (registroActual <= registros) { 
      out.write("\n");
      out.write("            ");
 } else {
      out.write("\n");
      out.write("            <a href=\"?direccion=ANT&actual=");
      out.print(registroActual - 1);
      out.write("\">&lt;-- Anterior</a>\n");
      out.write("\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            ");
 if (registroActual >= intTotalReg) {
      out.write("\n");
      out.write("            ");
 } else {
        if (contador >= registros) {
      out.write("\n");
      out.write("\n");
      out.write("            <a href=\"?direccion=SIG&actual=");
      out.print(registroActual + 1);
      out.write("\">Siguiente --&gt;</a>\n");
      out.write("\n");
      out.write("            ");
}
        } 
      out.write("\n");
      out.write("        </table\n");
      out.write("        ");
} else
                out.println("<CENTER>No hay datos en la consulta</CENTER> ");
        
      out.write(" </td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<br>\n");

    mensajero.close();
    conexion.close();

      out.write("\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
