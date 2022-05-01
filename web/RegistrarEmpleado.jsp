<%-- 
    Document   : RegistrarEmpleado
    Created on : Apr 12, 2022, 12:16:46 PM
    Author     : Damian
--%>

<%@page import="ModeloVO.TipoDocumentoVO"%>
<%@page import="ModeloDAO.TipoDocumentoDAO"%>
<%@page import="ModeloVO.LugarExpedicionVO"%>
<%@page import="ModeloDAO.LugarExpedicionDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Empleado</title>
    </head>
    <body>
        <h1>Registrar Empleados</h1>

        <form method="post" action="Empleado" id="formulario">

            <span>Nombres</span><br>
            <input required type="text" name="txtNombres" placeholder="Ingrese Nombres"><br> 

            <span>Apellidos</span><br>
            <input required type="text" name="txtApellidos" placeholder="Ingrese Apellidos"><br>  

            <span>Tipo de documento</span><br>
            <select aria-required="true" name="txtIdTipoDocumento">
                <option selected disabled>Seleccione...</option>
                <%  TipoDocumentoDAO tipoDocDAO = new TipoDocumentoDAO();
                    for (TipoDocumentoVO tipoDocVO : tipoDocDAO.Listar()) {
                %>
                <option value="<%=tipoDocVO.getIdTipoDocumento()%>"><%=tipoDocVO.getTipoDocumento()%></option>
                <%}%>
            </select><br>

            <span>Número de documento</span><br>
            <input required type="text" name="txtNumeroDocumento" placeholder="Ingrese Documento"><br>   

            <span>Teléfono</span><br>
            <input required type="text" name="txtTelefono" placeholder="Ingrese Télefono"><br>   

            <span>Email</span><br>
            <input required type="text" name="txtEmail" placeholder="Ingrese Email"><br>  

            <span>Lugar Expedición</span><br>
            <select aria-required="true" name="txtIdLugarExpedicion">
                <option selected disabled>Seleccione...</option>
                <%
                    LugarExpedicionDAO lugarDAO = new LugarExpedicionDAO();
                    for (LugarExpedicionVO lugarVO : lugarDAO.Listar()) {

                %>
                <option value="<%=lugarVO.getIdLugarExpedicion()%>"><%=lugarVO.getCiudad()%></option>
                <%}%>
            </select><br>   

            <button onclick="validar">Continuar</button>
            <input type="hidden" value="1" name="opcion">
        </form>

        <%@include file="./ErrorDatosJava/ErrorDatosJava.jsp" %>
        <script src="JavaScript/validar.js"></script>
    </body>
</html>
