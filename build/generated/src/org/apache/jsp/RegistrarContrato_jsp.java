package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.DependenciaVO;
import ModeloDAO.DependenciaDAO;
import ModeloVO.JornadaVO;
import ModeloDAO.JornadaDAO;
import ModeloVO.TipoContratoVO;
import ModeloDAO.TipoContratoDAO;
import ModeloDAO.HorarioDAO;
import ModeloVO.HorarioVO;
import ModeloVO.EmpleadoVO;
import ModeloDAO.EmpleadoDAO;
import ModeloVO.CargoVO;
import ModeloDAO.CargoDAO;

public final class RegistrarContrato_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registrar Contrato</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <h1>Registrar Contrato</h1>\n");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"Contrato\">\n");
      out.write("\n");
      out.write("            <span>Fecha de Contratación</span><br>\n");
      out.write("            <input required type=\"date\" id=\"fechaActual\" name=\"txtFechaContratacion\"><br>\n");
      out.write("\n");
      out.write("            <span>Fecha de Finalización</span><br>\n");
      out.write("            <input required type=\"date\" id=\"fechaActual2\" name=\"txtFechaFinalizacion\"><br>\n");
      out.write("\n");
      out.write("            <span>Salario</span><br>\n");
      out.write("            <input required type=\"text\" name=\"txtSalario\" placeholder=\"Ingrese Salario\"><br>\n");
      out.write("\n");
      out.write("            <span>Horario</span><br>\n");
      out.write("            <select aria-required=\"true\" name=\"txtHorario\">\n");
      out.write("                <option selected disabled>Seleccione...</option>\n");
      out.write("                ");
  
                    HorarioDAO horarioDAO = new HorarioDAO();
                    for (HorarioVO horarioVO : horarioDAO.Listar()) {
                
      out.write("\n");
      out.write("                <option value=\"");
      out.print(horarioVO.getIdHorario());
      out.write('"');
      out.write('>');
      out.print(horarioVO.getHorarioLaboral());
      out.write("</option>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </select><br>\n");
      out.write("\n");
      out.write("            <span>Cargo</span><br>\n");
      out.write("            <select aria-required=\"true\" name=\"txtIdCargo\">\n");
      out.write("                <option selected disabled>Seleccione...</option>\n");
      out.write("                ");

                    CargoDAO cargoDAO = new CargoDAO();
                    for (CargoVO cargoVO : cargoDAO.Listar()) {
                
      out.write("\n");
      out.write("                <option value=\"");
      out.print(cargoVO.getIdCargo());
      out.write('"');
      out.write('>');
      out.print(cargoVO.getNombreCargo());
      out.write("</option>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </select><br>\n");
      out.write("\n");
      out.write("            <span>Tipo de Contrato</span><br>\n");
      out.write("            <select aria-required=\"true\" name=\"txtIdTipoContrato\">\n");
      out.write("                <option selected disabled>Seleccione...</option>\n");
      out.write("                ");

                    TipoContratoDAO tipoConDAO = new TipoContratoDAO();
                    for (TipoContratoVO tipoConVO : tipoConDAO.Listar()) {
                
      out.write("\n");
      out.write("                <option value=\"");
      out.print(tipoConVO.getIdTipoContrato());
      out.write('"');
      out.write('>');
      out.print(tipoConVO.getContrato());
      out.write("</option>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </select><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            <span>Número de Empleado</span><br>\n");
      out.write("            <input required type=\"text\" name=\"txtIdEmpleado\"><br>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <span>Jornada</span><br>\n");
      out.write("            <select aria-required=\"true\" name=\"txtIdJornada\">\n");
      out.write("                <option selected disabled>Seleccione...</option>\n");
      out.write("                ");

                    JornadaDAO jornadaDAO = new JornadaDAO();
                    for (JornadaVO jornadaVO : jornadaDAO.Listar()) {
                
      out.write("\n");
      out.write("                <option value=\"");
      out.print(jornadaVO.getIdJornada());
      out.write('"');
      out.write('>');
      out.print(jornadaVO.getJornada());
      out.write("</option>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </select><br>\n");
      out.write("            \n");
      out.write("            <span>Dependencia</span><br>\n");
      out.write("            <select aria-required=\"true\" name=\"txtIdJornada\">\n");
      out.write("                <option selected disabled>Seleccione...</option>\n");
      out.write("                ");

                    DependenciaDAO depenDAO = new DependenciaDAO();
                    for (DependenciaVO depenVO : depenDAO.Listar()) {
                
      out.write("\n");
      out.write("                <option value=\"");
      out.print(depenVO.getIdDependencia());
      out.write('"');
      out.write('>');
      out.print(depenVO.getDependencia());
      out.write("</option>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </select><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <button>Registrar</button>\n");
      out.write("            <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <div>\n");
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
      out.write("\n");
      out.write("        <script src=\"JavaScript/Fechas.js\"></script>\n");
      out.write("        \n");
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
