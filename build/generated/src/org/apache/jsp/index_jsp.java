package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/nav.jsp");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Iniciar Sesion</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("<nav>\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"CertificadoSolicitud.jsp\">Solicitar certificado</a></li>\n");
      out.write("        <li><a href=\"registrarFuncionario.jsp\">Registrare</a></li>\n");
      out.write("        <li><a href=\"index.jsp\">Login</a></li>\n");
      out.write("    </ul>\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <h1>Iniciar Sesión</h1>\r\n");
      out.write("        <form method=\"post\" action=\"Funcionario\">\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    Usuario<br>\r\n");
      out.write("                <input type=\"text\" name=\"txtUsuario\"><br>\r\n");
      out.write("                Contraseña<br>\r\n");
      out.write("                <input type=\"password\" name=\"txtPassword\"><br>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table><br>\r\n");
      out.write("            <button>Iniciar Sesión</button>\r\n");
      out.write("            <input type=\"hidden\" value=\"3\" name=\"opcion\">\r\n");
      out.write("        </form>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div>¿No tienes una cuenta aún?<a href=\"registrarFuncionario.jsp\"> Crea una cuenta</a></div>\r\n");
      out.write("        <a href=\"olvidarContraseña.jsp\">¿Olvidaste tu contraseña?</a></div>\r\n");
      out.write("\r\n");
      out.write("        <div style=\"color:red;\">\r\n");
      out.write("            ");

                if (request.getAttribute("mensajeError") != null) {
      out.write("\r\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("            ");
 } else {
      out.write("\r\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
