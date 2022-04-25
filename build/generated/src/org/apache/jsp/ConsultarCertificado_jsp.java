package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloSolicitudVO.SolicitudVO;

public final class ConsultarCertificado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Certificación</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <h1>No esperes más para solicitar tu certificado!</h1>\n");
      out.write("\n");
      out.write("        ");

            SolicitudVO solVO = (SolicitudVO) request.getAttribute("ValidarCertificado");
            if (solVO != null) {

        
      out.write("\n");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"Certificacion\">\n");
      out.write("\n");
      out.write("            <div class=\"radio\">\n");
      out.write("                <input type=\"radio\" name=\"txtCer1\" value=\"2\">\n");
      out.write("                <label>Certificado 1</label>\n");
      out.write("\n");
      out.write("                <input type=\"radio\" name=\"txtCer2\" value=\"3\">\n");
      out.write("                <label>Certificado 2</label>\n");
      out.write("\n");
      out.write("                <input type=\"radio\" name=\"txtCer3\" value=\"4\">\n");
      out.write("                <label>Certificado 3</label>\n");
      out.write("                \n");
      out.write("                <input type=\"radio\" name=\"txtCer4\" value=\"5\">\n");
      out.write("                <label>Certificado 4</label>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <input type=\"hidden\" name=\"opcion\">\n");
      out.write("            <button>Solicitar</button><br>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
 } else {
                request.getRequestDispatcher("consultarVehiculo.jsp").forward(request, response);
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <script src=\"./CSS/Opciones.css\"></script>\n");
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
