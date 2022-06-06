package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import ModeloVO.EmpleadoVO;
import ModeloDAO.EmpleadoDAO;
import java.util.ArrayList;

public final class ConsultarEmpleado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/navFuncionario.jsp");
    _jspx_dependants.add("/./ErrorDatosJava/ErrorDatosJava.jsp");
  }

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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Actualizar Empleado</title>\n");
      out.write("        <script src=\"JavaScript/Buscador.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("<nav>\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"cambiarContraseña.jsp\">Cambiar contraseña</a></li>\n");
      out.write("        <li><a href=\"RegistrarEmpleado.jsp\">Registrar empleado</a></li>\n");
      out.write("        <li><a href=\"RegistrarCargo.jsp\">Registrar cargo</a></li>\n");
      out.write("        <li><a href=\"RegistrarHorario.jsp\">Registrar horario</a></li>\n");
      out.write("        <li><a href=\"ConsultarEmpleado.jsp?pagina=0\">Consultar empleado</a></li>\n");
      out.write("        <li><a href=\"cargarDatos.jsp\">Cargar datos</a></li>\n");
      out.write("    </ul>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("        <h1>Actualizar Empleado</h1>\n");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"Empleado\">\n");
      out.write("            <section>\n");
      out.write("                <label>Buscar empleado</label>\n");
      out.write("                <input id=\"buscarDocumento\" type=\"text\" onKeypress=\"if (event.keyCode < 45 || event.keyCode > 57)\n");
      out.write("                            event.returnValue = false;\" maxlength=\"14\" onkeyup=\"doSearch()\" placeholder=\"Ingrese documento\"/>\n");
      out.write("            </section>\n");
      out.write("            <br>\n");
      out.write("            <table border=\"1\" id=\"datos\" number-per-page=\"10\" current-page=\"\">\n");
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
      out.write("\n");
      out.write("                ");

                    EmpleadoDAO empDAO = new EmpleadoDAO();
                    ArrayList<EmpleadoVO> listaEmpleados = empDAO.obtenerEmpleados();
                    for (EmpleadoVO empVO : listaEmpleados) {

                
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(empVO.getNombres());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(empVO.getApellidos());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(empVO.getIdTipoDocumento());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(empVO.getNumeroDocumento());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(empVO.getTelefono());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(empVO.getEmail());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(empVO.getIdLugarExpedicion());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(empVO.getEstado());
      out.write("</td>\n");
      out.write("\n");
      out.write("                <input name=\"txtNumeroDocumento\" value=\"");
      out.print(empVO.getNumeroDocumento());
      out.write("\" type=\"hidden\">\n");
      out.write("                <td><button>Editar</button></td>\n");
      out.write("                <input type=\"hidden\" value=\"3\" name=\"opcion\">\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <div style=\"color:red;\">\n");
      out.write("            ");

                if (request.getAttribute("MensajeError") != null) {
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            ");
 } else {
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("<div>\n");
      out.write("    ");

    if (request.getAttribute("MensajeError") != null) {
      out.write("\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        alert('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\n");
      out.write("    </script>\n");
      out.write("    ");
 }
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"JavaScript/Paginacion.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("                                $(function () {\n");
      out.write("                                    $(\"#datos\").pagination();\n");
      out.write("                                });\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("            var _gaq = _gaq || [];\n");
      out.write("            _gaq.push(['_setAccount', 'UA-36251023-1']);\n");
      out.write("            _gaq.push(['_setDomainName', 'jqueryscript.net']);\n");
      out.write("            _gaq.push(['_trackPageview']);\n");
      out.write("\n");
      out.write("            (function () {\n");
      out.write("                var ga = document.createElement('script');\n");
      out.write("                ga.type = 'text/javascript';\n");
      out.write("                ga.async = true;\n");
      out.write("                ga.src = ('https:' === document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n");
      out.write("                var s = document.getElementsByTagName('script')[0];\n");
      out.write("                s.parentNode.insertBefore(ga, s);\n");
      out.write("            })();\n");
      out.write("\n");
      out.write("        </script>  \n");
      out.write("    </body>\n");
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
