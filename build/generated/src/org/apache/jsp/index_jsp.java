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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/64d58efce2.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Css/styleLogin.css\" />\r\n");
      out.write("        <!-- icon  -->\r\n");
      out.write("        <link rel=\"icon\" href=\"Css/recursos/Logo sadin.svg\">\r\n");
      out.write("        <title>Iniciar Sesión</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"forms-container\">\r\n");
      out.write("                <div class=\"signin-signup\">\r\n");
      out.write("                    <form method=\"post\" action=\"Funcionario\" class=\"sign-in-form\">\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <img src=\"Css/recursos/LogoHeader.svg\" class=\"logo\" alt=\"SADIN\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <h2 class=\"title\">Iniciar Sesión</h2>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"form\">\r\n");
      out.write("                            <div class=\"form__group\">\r\n");
      out.write("                                <input type=\"text\" name=\"txtUsuario\" class=\"form__input\" id=\"user\" placeholder=\" \" autocomplete=\"off\"><br>\r\n");
      out.write("                                <label for=\"user\" class=\"form__label\">Usuario</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form__group\">\r\n");
      out.write("                                <input type=\"password\" name=\"txtPassword\" id=\"password\" class=\"form__input\" placeholder=\" \">\r\n");
      out.write("                                <label for=\"password\" class=\"form__label\">Contraseña</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <button class=\"btn solid\" type=\"submit\"> Ingresar <i class=\"fas fa-angle-double-right\"></i></button>\r\n");
      out.write("                        <input type=\"hidden\" value=\"3\" name=\"opcion\">\r\n");
      out.write("                        <a class=\"only__link\" href=\"olvidarContraseña.jsp\">¿Ha olvidado tu contraseña?</a>\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                    <form method=\"post\" action=\"Funcionario\" class=\"sign-up-form\">\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <img src=\"Css/recursos/LogoHeader.svg\" class=\"logo\" alt=\"SADIN\"></a>\r\n");
      out.write("                        <h2 class=\"title\">Registrate como funcionario</h2>\r\n");
      out.write("                        <div class=\"form\">\r\n");
      out.write("                            <div class=\"form__group\">\r\n");
      out.write("                                <input type=\"text\" name=\"txtUsuario\" id=\"doc\" class=\"form__input\" placeholder=\" \" autocomplete=\"off\">\r\n");
      out.write("                                <label for=\"doc\" class=\"form__label\">Número de Documento</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <button class=\"btn solid\" type=\"submit\"> Registrarse <i class=\"fas fa-angle-double-right\"></i></button>\r\n");
      out.write("                        <input type=\"hidden\" value=\"1\" name=\"opcion\">\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"panels-container\">\r\n");
      out.write("                <div class=\"panel left-panel\">\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <h3>¿Eres nuevo aquí?</h3>\r\n");
      out.write("                        <p>\r\n");
      out.write("\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <button class=\"btn transparent\" id=\"sign-up-btn\">\r\n");
      out.write("                            Registrate\r\n");
      out.write("                        </button>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <img src=\"Css/recursos/log.svg\" class=\"image\" alt=\"\" />\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"panel right-panel\">\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <h3>¿Ya tienes cuenta?</h3>\r\n");
      out.write("                        <p>\r\n");
      out.write("\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <button class=\"btn transparent\" id=\"sign-in-btn\">\r\n");
      out.write("                            Iniciar Sesión\r\n");
      out.write("                        </button>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <img src=\"Css/recursos/register.svg\" class=\"image\" alt=\"\" />\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<div>\r\n");
      out.write("    <script>\r\n");
      out.write("\r\n");
      out.write("        ");

            if (request.getAttribute("MensajeError") != null) {
      out.write("\r\n");
      out.write("\r\n");
      out.write("        alert('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("\r\n");
      out.write("        ");
 } else {
      out.write("\r\n");
      out.write("        alert('Bienvenido!!');\r\n");
      out.write("        ");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"Css/js/appLogin.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
