package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.SimpleDateFormat;

public final class SolicitarCertificado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"https://www.google.com/recaptcha/api.js\"></script>\n");
      out.write("        <title>Solicitar</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <!-- Font Awesome CDN Link for Icons -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Solicite su Certificado</h1>\n");
      out.write("        <form method=\"post\" action=\"Certificado\" class=\"input-area\">\n");
      out.write("\n");
      out.write("            ");

                Date FechaActual = new Date();
                SimpleDateFormat fechaActual = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String fecha = fechaActual.format(FechaActual);
            
      out.write("\n");
      out.write("            <input type=\"hidden\" name=\"txtFechaSolicitud\" value=\"");
      out.print(fecha);
      out.write("\">\n");
      out.write("\n");
      out.write("            <span>Ingrese Número de Empleado</span><br>\n");
      out.write("            <input required type=\"text\" name=\"txtIdEmpleado\" placeholder=\"Número de empleado\"><br>\n");
      out.write("\n");
      out.write("            <span>Destinatario</span><br>\n");
      out.write("            <input required type=\"text\" name=\"txtDestinatario\" placeholder=\"Destinatario\"><br>\n");
      out.write("\n");
      out.write("            <!--Captcha-->\n");
      out.write("            <div class=\"captcha-area\">\n");
      out.write("                <div class=\"captcha-img\">\n");
      out.write("                    <img src=\"captcha-bg.png\" alt=\"Captch Background\">\n");
      out.write("                    <span class=\"captcha\"></span>\n");
      out.write("                </div>\n");
      out.write("                <button class=\"reload-btn\">Generar Código</button>\n");
      out.write("            </div>\n");
      out.write("            <form action=\"#\" class=\"input-area\">\n");
      out.write("                <input type=\"text\" placeholder=\"Ingresa Captcha\" maxlength=\"6\" spellcheck=\"false\" required>\n");
      out.write("                <button class=\"check-btn\">Confirmar</button>\n");
      out.write("            </form>\n");
      out.write("            <div class=\"status-text\"></div>\n");
      out.write("            <!--Captcha-->\n");
      out.write("\n");
      out.write("            <button>Siguiente</button>\n");
      out.write("            <input type=\"hidden\" name=\"opcion\" value=\"1\">\n");
      out.write("        </form><br>\n");
      out.write("\n");
      out.write("        <a href=\"Index.jsp\">Inicio</a>\n");
      out.write("\n");
      out.write("        <div class=\"error\">\n");
      out.write("            ");
if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            ");
 } else {
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script src=\"JavaScript/ReCaptcha.js\"></script>\n");
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
