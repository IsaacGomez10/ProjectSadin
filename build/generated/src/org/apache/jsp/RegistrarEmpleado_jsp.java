package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.TipoDocumentoVO;
import ModeloDAO.TipoDocumentoDAO;
import ModeloVO.LugarExpedicionVO;
import ModeloDAO.LugarExpedicionDAO;
import ModeloVO.EmpleadoVO;
import ModeloVO.FuncionarioVO;

public final class RegistrarEmpleado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/sesiones.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
    response.setDateHeader("Expires", 0);

      out.write('\n');
      out.write('\n');

     HttpSession buscarSesion = (HttpSession)request.getSession();
    String IdEmpleado ="",Usuario ="",NombreUsuario ="", IdFuncionario="";
    if (buscarSesion.getAttribute("datosFuncionario") == null){
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }else{
        EmpleadoVO empVO = (EmpleadoVO)buscarSesion.getAttribute("datosEmpleado");
        EmpleadoVO empReVO = (EmpleadoVO)buscarSesion.getAttribute("datosEmpleadoRegistrado");
        FuncionarioVO funVO = (FuncionarioVO)buscarSesion.getAttribute("datosFuncionario");
        IdEmpleado = empReVO.getIdEmpleado();
        Usuario = funVO.getUsuario();
        NombreUsuario = (empVO.getNombres()+ " " +empVO.getApellidos());
        IdFuncionario = funVO.getIdFuncionario();
        
    }


      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"float: right\">\n");
      out.write("            <h1 style=\"color: red\">\n");
      out.write("                Bienvenido: ");
      out.print(NombreUsuario);
      out.write("\n");
      out.write("            </h1>\n");
      out.write("            <form method=\"post\" action=\"Sesiones\">\n");
      out.write("                <input style=\"float: right\" type=\"submit\" value=\"Cerrar Sesion\">\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </div><br><br>\n");
      out.write("        <div></div><br><br>\n");
      out.write("        <div></div><br><br>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registrar Empleado</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/estilosForms.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<nav>\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"cambiarContraseña.jsp\">Cambiar contraseña</a></li>\n");
      out.write("        <li><a href=\"RegistrarEmpleado.jsp\">Registrar empleado</a></li>\n");
      out.write("        <li><a href=\"RegistrarCargo.jsp\">Registrar cargo</a></li>\n");
      out.write("        <li><a href=\"RegistrarHorario.jsp\">Registrar horario</a></li>\n");
      out.write("        <li><a href=\"ConsultarEmpleado.jsp\">Consultar empleado</a></li>\n");
      out.write("    </ul>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("        <h1>Registrar Empleados</h1>\n");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"Empleado\" id=\"formulario\">\n");
      out.write("            \n");
      out.write("            <div class=\"formulario__grupo\" id=\"grupo__nombre\">\n");
      out.write("                <label for=\"nombre\" class=\"formulario__label\">Nombres</label>\n");
      out.write("                <div class=\"formulario__grupo-input\">\n");
      out.write("                    <input required=\"\" type=\"text\" class=\"formulario__input\" name=\"txtNombres\" id=\"nombre\" placeholder=\"Ingrese Nombres\">\n");
      out.write("                    <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                </div>\n");
      out.write("                <p class=\"formulario__input-error\">Los Nombres no pueden tener caracteres epeciales.</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"formulario__grupo\" id=\"grupo__apellido\">\n");
      out.write("                <label for=\"apellido\" class=\"formulario__label\">Apellidos</label>\n");
      out.write("                <div class=\"formulario__grupo-input\">\n");
      out.write("                    <input required=\"\" type=\"text\" class=\"formulario__input\" name=\"txtApellidos\" id=\"apellido\" placeholder=\"Ingrese Apellidos\">\n");
      out.write("                    <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                </div>\n");
      out.write("                <p class=\"formulario__input-error\">Los Apellidos no pueden tener caracteres epeciales.</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <span>Tipo de documento</span><br>\n");
      out.write("            <select required=\"\" name=\"txtIdTipoDocumento\">\n");
      out.write("                <option selected disabled>Seleccione tipo de documento</option>\n");
      out.write("                ");
  TipoDocumentoDAO tipoDocDAO = new TipoDocumentoDAO();
                    for (TipoDocumentoVO tipoDocVO : tipoDocDAO.Listar()) {
                
      out.write("\n");
      out.write("                <option required=\"\" value=\"");
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
      out.write("\n");
      out.write("            <div class=\"formulario__grupo\" id=\"grupo__numeroDocumento\">\n");
      out.write("                <label for=\"numeroDocumento\" class=\"formulario__label\">Número de Documento</label>\n");
      out.write("                <div class=\"formulario__grupo-input\">\n");
      out.write("                    <input required=\"\" onKeypress=\"if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;\" maxlength=\"14\" type=\"text\" class=\"formulario__input\" name=\"txtNumeroDocumento\" id=\"numeroDocumento\" placeholder=\"Ingrese Documento\">\n");
      out.write("                    <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                </div>\n");
      out.write("                <p class=\"formulario__input-error\">Ingrese un número de documento valido.</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"formulario__grupo\" id=\"grupo__telefono\">\n");
      out.write("                <label for=\"telefono \" class=\"formulario__label\">Teléfono</label>\n");
      out.write("                <div class=\"formulario__grupo-input\">\n");
      out.write("                    <input required=\"\" onKeypress=\"if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;\" maxlength=\"10\" type=\"text\" class=\"formulario__input\" name=\"txtTelefono\" id=\"telefono\" placeholder=\"3XXXXXXXXX\">\n");
      out.write("                    <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                </div>\n");
      out.write("                <p class=\"formulario__input-error\">Ingrese un número de telefono valido, maximo 10 dígitos.</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"formulario__grupo\" id=\"grupo__email\">\n");
      out.write("                <label for=\"email\" class=\"formulario__label\">Correo Electrónico</label>\n");
      out.write("                <div class=\"formulario__grupo-input\">\n");
      out.write("                    <input required=\"\"  type=\"email\" class=\"formulario__input\" name=\"txtEmail\" id=\"email\" placeholder=\"correo@correo.com\">\n");
      out.write("                    <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                </div>\n");
      out.write("                <p class=\"formulario__input-error\">Ingrese un correo electrónico valido.</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <span>Lugar Expedición</span><br>\n");
      out.write("            <select required=\"\" name=\"txtIdLugarExpedicion\">\n");
      out.write("                <option selected disabled>Seleccione ciudad</option>\n");
      out.write("                ");

                    LugarExpedicionDAO lugarDAO = new LugarExpedicionDAO();
                    for (LugarExpedicionVO lugarVO : lugarDAO.Listar()) {

                
      out.write("\n");
      out.write("                <option required=\"\" value=\"");
      out.print(lugarVO.getIdLugarExpedicion());
      out.write('"');
      out.write('>');
      out.print(lugarVO.getCiudad());
      out.write("</option>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </select><br>   \n");
      out.write("            \n");
      out.write("            <input type=\"hidden\" value=\"1\" name=\"txtEstado\" >\n");
      out.write("\n");
      out.write("            <button type=\"submit\">Continuar</button>\n");
      out.write("            <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("        </form>\n");
      out.write("\n");
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
      out.write("    \n");
      out.write("    ");
 }
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        <script src=\"JavaScript/validaciones.js\"></script>\n");
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
