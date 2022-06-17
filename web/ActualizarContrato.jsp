<%-- 
    Document   : registrarContrato
    Created on : 30/03/2022, 09:10:30 AM
    Author     : Sena
--%>


<%@page import="ModeloVO.ContratoVO"%>
<%@page import="ModeloVO.DependenciaVO"%>
<%@page import="ModeloDAO.DependenciaDAO"%>
<%@page import="ModeloVO.JornadaVO"%>
<%@page import="ModeloDAO.JornadaDAO"%>
<%@page import="ModeloVO.TipoContratoVO"%>
<%@page import="ModeloDAO.TipoContratoDAO"%>
<%@page import="ModeloDAO.HorarioDAO"%>
<%@page import="ModeloVO.HorarioVO"%>
<%@page import="ModeloVO.EmpleadoVO"%>
<%@page import="ModeloDAO.EmpleadoDAO"%>
<%@page import="ModeloVO.CargoVO"%>
<%@page import="ModeloDAO.CargoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="sesiones.jsp"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Empleado</title>
        <!-- icon  -->
        <link rel="icon" href="Css/recursos/Logo sadin.svg">
        <%@include file="VistasParciales/linksHead.jsp"%>

    </head>
    <body>
        <div class="container-scroller">
            <%@include file="VistasParciales/navDashboard.jsp"%>

            <div class="container-fluid page-body-wrapper">
                <%@include file="VistasParciales/menuDashboard.jsp"%>
                <%                    ContratoVO conVO = (ContratoVO) request.getAttribute("obtenerDatos");
                    ContratoVO conIds = (ContratoVO) request.getAttribute("obtenerIds");
                    if (conVO != null) {
                        if (conIds != null) {
                %>
                <div class="main-panel">
                    <div class="content-wrapper">
                        <div class="row">
                            <div class="col-12 grid-margin">
                                <div class="card">
                                    <div class="card-body">
                                        <h4 class="card-title">Actualizar contrato</h4>
                                        <form method="post" action="Contrato" id="formulario" class="form-sample">
                                            <div class="row">
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label>Fecha de contratación</label>
                                                        <input type="date" class="form-control" id="fechaActual" name="txtFechaContratacion" value="<%=conVO.getFechaContratacion()%>" readonly="readonly"/>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label>Fecha de finalización</label>
                                                        <input type="date" class="form-control" required value="<%=conVO.getFechaFinalizacion()%>"  name="txtFechaFinalizacion"/>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label>Salario</label>
                                                        <input type="text" class="form-control" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)
                                                                    event.returnValue = false;" required name="txtSalario" value="<%=conVO.getSalario()%>"/>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label>Cargo</label>
                                                        <select class="form-control" name="txtIdCargo">
                                                            <option selected value="<%=conIds.getIdCargo()%>"><%=conVO.getIdCargo()%></option>
                                                            <%
                                                                CargoDAO cargoDAO = new CargoDAO();
                                                                for (CargoVO cargoVO : cargoDAO.Listar()) {
                                                            %>
                                                            <option value="<%=cargoVO.getIdCargo()%>"><%=cargoVO.getNombreCargo()%></option>
                                                            <%}%>
                                                        </select>

                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label>Dependencia</label>
                                                        <select class="form-control" name="txtDependencia">
                                                            <option selected value="<%=conIds.getIdDependencia()%>"><%=conVO.getIdDependencia()%></option>
                                                            <%
                                                                DependenciaDAO depenDAO = new DependenciaDAO();
                                                                for (DependenciaVO depenVO : depenDAO.Listar()) {
                                                            %>
                                                            <option value="<%=depenVO.getIdDependencia()%>"><%=depenVO.getDependencia()%></option>
                                                            <%}%>
                                                        </select>
                                                    </div>
                                                </div>

                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label>Tipo de Contrato</label>
                                                        <select class="form-control" name="txtIdTipoContrato">
                                                            <option selected value="<%=conIds.getIdTipoContrato()%>"><%=conVO.getIdTipoContrato()%></option>
                                                            <%
                                                                TipoContratoDAO tipoConDAO = new TipoContratoDAO();
                                                                for (TipoContratoVO tipoConVO : tipoConDAO.Listar()) {
                                                            %>
                                                            <option value="<%=tipoConVO.getIdTipoContrato()%>"><%=tipoConVO.getContrato()%></option>
                                                            <%}%>
                                                        </select>
                                                    </div>
                                                </div>

                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label>Jornada</label>
                                                        <select class="form-control" name="txtIdJornada">
                                                            <option selected value="<%=conIds.getIdJornada()%>"><%=conVO.getIdJornada()%></option>
                                                            <%
                                                                JornadaDAO jornadaDAO = new JornadaDAO();
                                                                for (JornadaVO jornadaVO : jornadaDAO.Listar()) {
                                                            %>
                                                            <option value="<%=jornadaVO.getIdJornada()%>"><%=jornadaVO.getJornada()%></option>
                                                            <%}%>
                                                        </select>
                                                    </div>
                                                </div>

                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label>Horario</label>
                                                        <select class="form-control" name="txtHorario">
                                                            <option selected value="<%=conIds.getIdHorario()%>"><%=conVO.getIdHorario()%></option>
                                                            <%                    HorarioDAO horarioDAO = new HorarioDAO();
                                                                for (HorarioVO horarioVO : horarioDAO.Listar()) {
                                                            %>
                                                            <option value="<%=horarioVO.getIdHorario()%>"><%=horarioVO.getHorarioLaboral()%></option>
                                                            <%}%>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>
                                            <input type="hidden" value="<%=conIds.getIdEmpleado()%>" name="txtIdEmpleado">
                                            
                                            <button type="submit" class="btn btn-warning">Actualizar</button>
                                            <input type="hidden" value="2" name="opcion">
                                            <a class="btn btn-inverse-success" href="ConsultarEmpleado.jsp">Regresar <i class="ti-back-left"></i></a>
                                        </form>
                                        <% } else {
                                                request.getRequestDispatcher("ConsultarEmpleado.jsp").forward(request, response);
                                            }
                                        %>
                                        <% } else {
                                                request.getRequestDispatcher("ConsultarEmpleado.jsp").forward(request, response);
                                            }
                                        %>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <%@include file="VistasParciales/footerDashboard.jsp"%>  
                </div>
            </div>
        </div>

        <%@include file="VistasParciales/scriptsFooter.jsp"%>
        <script src="JavaScript/validar.js"></script>
        <script src="JavaScript/Fechas.js"></script>
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <%@include file="ErrorDatosJava/ErrorDatosJava.jsp"%>
    </body>
</html>
