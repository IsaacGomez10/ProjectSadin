<%-- 
    Document   : registrarContrato
    Created on : 30/03/2022, 09:10:30 AM
    Author     : Sena
--%>


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
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Contrato</title>
    </head>
    <body>

        <h1>Registrar Contrato</h1>

        <form method="post" action="Contrato">

            <span>Fecha de Contratación</span><br>
            <input required type="date" id="fechaActual" name="txtFechaContratacion"><br>

            <span>Fecha de Finalización</span><br>
            <input required type="date" id="fechaActual2" name="txtFechaFinalizacion"><br>

            <span>Salario</span><br>
            <input required type="text" name="txtSalario" placeholder="Ingrese Salario"><br>

            <span>Horario</span><br>
            <select aria-required="true" name="txtHorario">
                <option selected disabled>Seleccione...</option>
                <%  
                    HorarioDAO horarioDAO = new HorarioDAO();
                    for (HorarioVO horarioVO : horarioDAO.Listar()) {
                %>
                <option value="<%=horarioVO.getIdHorario()%>"><%=horarioVO.getHorarioLaboral()%></option>
                <%}%>
            </select><br>

            <span>Cargo</span><br>
            <select aria-required="true" name="txtIdCargo">
                <option selected disabled>Seleccione...</option>
                <%
                    CargoDAO cargoDAO = new CargoDAO();
                    for (CargoVO cargoVO : cargoDAO.Listar()) {
                %>
                <option value="<%=cargoVO.getIdCargo()%>"><%=cargoVO.getNombreCargo()%></option>
                <%}%>
            </select><br>

            <span>Tipo de Contrato</span><br>
            <select aria-required="true" name="txtIdTipoContrato">
                <option selected disabled>Seleccione...</option>
                <%
                    TipoContratoDAO tipoConDAO = new TipoContratoDAO();
                    for (TipoContratoVO tipoConVO : tipoConDAO.Listar()) {
                %>
                <option value="<%=tipoConVO.getIdTipoContrato()%>"><%=tipoConVO.getContrato()%></option>
                <%}%>
            </select><br>


            <%-- TERMINAR LÓGICA--%>
            <span>Número de Empleado</span><br>
            <input required type="text" name="txtIdEmpleado"><br>
            <%-- TERMINAR LÓGICA--%>


            <span>Jornada</span><br>
            <select aria-required="true" name="txtIdJornada">
                <option selected disabled>Seleccione...</option>
                <%
                    JornadaDAO jornadaDAO = new JornadaDAO();
                    for (JornadaVO jornadaVO : jornadaDAO.Listar()) {
                %>
                <option value="<%=jornadaVO.getIdJornada()%>"><%=jornadaVO.getJornada()%></option>
                <%}%>
            </select><br>
            
            <span>Dependencia</span><br>
            <select aria-required="true" name="txtIdJornada">
                <option selected disabled>Seleccione...</option>
                <%
                    DependenciaDAO depenDAO = new DependenciaDAO();
                    for (DependenciaVO depenVO : depenDAO.Listar()) {
                %>
                <option value="<%=depenVO.getIdDependencia()%>"><%=depenVO.getDependencia()%></option>
                <%}%>
            </select><br>



            <button>Registrar</button>
            <input type="hidden" value="1" name="opcion">
        </form>

        <div>
            <%if (request.getAttribute("mensajeError") != null) {%>
            ${mensajeError}
            <% } else {%>
            ${mensajeExito}
            <%}%>
        </div>

        <script src="JavaScript/Fechas.js"></script>
        

    </body>
</html>
