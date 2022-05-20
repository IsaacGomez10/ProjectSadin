package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloSolicitudVO.SolicitudVO;

public final class CertificadoSolicitud_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/./EliminarCache/EliminarCache.jsp");
    _jspx_dependants.add("/nav.jsp");
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

    response.setHeader("Cache-control", "no-cache");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);

      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Certificación</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css\">\n");
      out.write("        <meta http-equiv=\"Expires\" content=\"0\">\n");
      out.write("        <meta http-equiv=\"Last-Modified\" content=\"0\">\n");
      out.write("        <meta http-equiv=\"Cache-Control\" content=\"no-cache, mustrevalidate\">\n");
      out.write("        <meta http-equiv=\"Pragma\" content=\"no-cache\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<nav>\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"CertificadoSolicitud.jsp\">Solicitar certificado</a></li>\n");
      out.write("        <li><a href=\"registrarFuncionario.jsp\">Registrare</a></li>\n");
      out.write("        <li><a href=\"index.jsp\">Login</a></li>\n");
      out.write("    </ul>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form method=\"post\" action=\"Certificacion\">\n");
      out.write("            <div id=\"limpiar\">\n");
      out.write("                <span>Número de Documento</span><br>\n");
      out.write("                <input type=\"text\" name=\"txtNumeroDocumento\" placeholder=\"Ingrese documento\">\n");
      out.write("            </div>\n");
      out.write("            <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("            <br><br>\n");
      out.write("\n");
      out.write("            <!--Captcha-->\n");
      out.write("            <div class=\"captcha-container\">\n");
      out.write("                <div class=\"header\">Verificar Captcha</div>\n");
      out.write("                <div class=\"securityCode\">\n");
      out.write("                    <p id=\"code\"></p>\n");
      out.write("                    <div class=\"icons\">\n");
      out.write("                        <span class=\"readText\">\n");
      out.write("                            <i class=\"fas fa-headphones\"></i>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"changeText\">\n");
      out.write("                            <i class=\"fas fa-sync-alt\"></i>\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"userInput\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Ingrese captcha\" ><br>\n");
      out.write("                    <button>Confirmar</button>\n");
      out.write("                    <input type=\"hidden\" value=\"1\" class=\"btn\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </form><br>\n");
      out.write("        ");
      out.write("<div>\n");
      out.write("    ");

    if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        alert('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("    ");
 }
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://code.responsivevoice.org/responsivevoice.js\"></script>\n");
      out.write("        <script src=\"./JavaScript/ReCaptcha.js\"></script>\n");
      out.write("\n");
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
