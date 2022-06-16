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

                <div class="main-panel">
                    <div class="content-wrapper">
                        <div class="row">
                            <div class="col-12 grid-margin">
                                <div class="card">
                                    <div class="card-body">
                                        <h4 class="card-title">Registrar Contrato</h4>
                                        <form method="post" action="Contrato" id="formulario" class="form-sample">
                                            <input type="hidden" value="<%=IdEmpleado%>" name="txtIdEmpleado"> 

                                            <div class="row">
                                                <div class="col-md-10">
                                                    <div class="form-group row">
                                                        <label>Fecha de contratación</label>
                                                        <input type="date" class="form-control" id="fechaActual" name="txtFechaContratacion" readonly="readonly"/>
                                                    </div>
                                                </div>
                                                <div class="col-md-10">
                                                    <div class="form-group row">
                                                        <label>Fecha de finalización</label>
                                                        <input type="date" class="form-control" required  name="txtFechaFinalizacion"/>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-md-10">
                                                    <div class="form-group row">
                                                        <label>Salario</label>
                                                        <input type="text" class="form-control" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)
                                                                    event.returnValue = false;" required name="txtSalario"/>
                                                    </div>
                                                </div>
                                                <div class="col-md-10">
                                                    <div class="form-group row">
                                                        <label>Horario</label>
                                                        <select class="form-control" name="txtHorario">
                                                            <option selected disabled>Seleccione un horario</option>
                                                            <%                    HorarioDAO horarioDAO = new HorarioDAO();
                                                                for (HorarioVO horarioVO : horarioDAO.Listar()) {
                                                            %>
                                                            <option value="<%=horarioVO.getIdHorario()%>"><%=horarioVO.getHorarioLaboral()%></option>
                                                            <%}%>
                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="col-md-10">
                                                    <div class="form-group row">
                                                        <label>Cargo</label>
                                                        <select class="form-control" name="txtIdCargo">
                                                            <option selected disabled>Seleccione un cargo</option>
                                                            <%
                                                                CargoDAO cargoDAO = new CargoDAO();
                                                                for (CargoVO cargoVO : cargoDAO.Listar()) {
                                                            %>
                                                            <option value="<%=cargoVO.getIdCargo()%>"><%=cargoVO.getNombreCargo()%></option>
                                                            <%}%>
                                                        </select>

                                                    </div>
                                                </div>
                                                <div class="col-md-10">
                                                    <div class="form-group row">
                                                        <label>Dependencia</label>
                                                        <select class="form-control" name="txtDependencia">
                                                            <option selected disabled>Seleccione...</option>
                                                            <%
                                                                DependenciaDAO depenDAO = new DependenciaDAO();
                                                                for (DependenciaVO depenVO : depenDAO.Listar()) {
                                                            %>
                                                            <option value="<%=depenVO.getIdDependencia()%>"><%=depenVO.getDependencia()%></option>
                                                            <%}%>
                                                        </select>
                                                    </div>
                                                </div>

                                                <div class="col-md-10">
                                                    <div class="form-group row">
                                                        <label>Tipo de Contrato</label>
                                                        <select class="form-control" name="txtIdTipoContrato">
                                                            <option selected disabled>Seleccione...</option>
                                                            <%
                                                                TipoContratoDAO tipoConDAO = new TipoContratoDAO();
                                                                for (TipoContratoVO tipoConVO : tipoConDAO.Listar()) {
                                                            %>
                                                            <option value="<%=tipoConVO.getIdTipoContrato()%>"><%=tipoConVO.getContrato()%></option>
                                                            <%}%>
                                                        </select>
                                                    </div>
                                                </div>

                                                <div class="col-md-10">
                                                    <div class="form-group row">
                                                        <label>Jornada</label>
                                                        <select class="form-control" name="txtIdJornada">
                                                            <option selected disabled>Seleccione...</option>
                                                            <%
                                                                JornadaDAO jornadaDAO = new JornadaDAO();
                                                                for (JornadaVO jornadaVO : jornadaDAO.Listar()) {
                                                            %>
                                                            <option value="<%=jornadaVO.getIdJornada()%>"><%=jornadaVO.getJornada()%></option>
                                                            <%}%>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>

                                            <button type="submit" class="btn btn-warning">Registrar</button>
                                            <input type="hidden" value="1" name="opcion">
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <%@include file="VistasParciales/scriptsFooter.jsp"%>
        <script src="JavaScript/validar.js"></script>
        <script src="JavaScript/Fechas.js"></script>

    </body>
</html>
