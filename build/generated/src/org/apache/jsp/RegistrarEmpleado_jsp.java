package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.TipoDocumentoVO;
import ModeloDAO.TipoDocumentoDAO;
import ModeloVO.LugarExpedicionVO;
import ModeloDAO.LugarExpedicionDAO;

public final class RegistrarEmpleado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/./ErrorDatosJava/validacionDatos.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registrar Empleado</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Registrar Empleados</h1>\n");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"Empleado\" id=\"formulario\">\n");
      out.write("\n");
      out.write("            <span>Nombres</span><br>\n");
      out.write("            <input required type=\"text\" name=\"txtNombres\" placeholder=\"Ingrese Nombres\"><br> \n");
      out.write("\n");
      out.write("            <span>Apellidos</span><br>\n");
      out.write("            <input required type=\"text\" name=\"txtApellidos\" placeholder=\"Ingrese Apellidos\"><br>  \n");
      out.write("\n");
      out.write("            <span>Tipo de documento</span><br>\n");
      out.write("            <select aria-required=\"true\" name=\"txtIdTipoDocumento\">\n");
      out.write("                <option selected disabled>Seleccione...</option>\n");
      out.write("                ");
  TipoDocumentoDAO tipoDocDAO = new TipoDocumentoDAO();
                    for (TipoDocumentoVO tipoDocVO : tipoDocDAO.Listar()) {
                
      out.write("\n");
      out.write("                <option value=\"");
      out.print(tipoDocVO.getIdTipoDocumento());
      out.write('"');
      out.write('>');
      out.print(tipoDocVO.getTipoDocumento());
      out.write("</option>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </select><br>\n");
      out.write("\n");
      out.write("            <span>Número de documento</span><br>\n");
      out.write("            <input required type=\"text\" name=\"txtNumeroDocumento\" placeholder=\"Ingrese Documento\"><br>   \n");
      out.write("\n");
      out.write("            <span>Teléfono</span><br>\n");
      out.write("            <input required type=\"text\" name=\"txtTelefono\" placeholder=\"Ingrese Télefono\"><br>   \n");
      out.write("\n");
      out.write("            <span>Email</span><br>\n");
      out.write("            <input required type=\"text\" name=\"txtEmail\" placeholder=\"Ingrese Email\"><br>  \n");
      out.write("\n");
      out.write("            <span>Lugar Expedición</span><br>\n");
      out.write("            <select aria-required=\"true\" name=\"txtIdLugarExpedicion\">\n");
      out.write("                <option selected disabled>Seleccione...</option>\n");
      out.write("                ");

                    LugarExpedicionDAO lugarDAO = new LugarExpedicionDAO();
                    for (LugarExpedicionVO lugarVO : lugarDAO.Listar()) {

                
      out.write("\n");
      out.write("                <option value=\"");
      out.print(lugarVO.getIdLugarExpedicion());
      out.write('"');
      out.write('>');
      out.print(lugarVO.getCiudad());
      out.write("</option>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </select><br>   \n");
      out.write("\n");
      out.write("            <button onclick=\"validar\">Continuar</button>\n");
      out.write("            <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");
      out.write("<div>\n");
      out.write("    ");

    if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("    <script>\n");
      out.write("        alert('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\n");
      out.write("    </script>\n");
      out.write("    ");
 } else {
      out.write("\n");
      out.write("    <script>\n");
      out.write("        alert('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\n");
      out.write("    </script>\n");
      out.write("    ");
}
      out.write("\n");
      out.write("</div>");
      out.write("\n");
      out.write("        <script src=\"JavaScript/validar.js\"></script>\n");
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
