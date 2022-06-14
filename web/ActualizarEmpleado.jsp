<%-- 
    Document   : ActualizarEmpleado
    Created on : Apr 18, 2022, 9:14:21 PM
    Author     : Damian
--%>

<%@page import="ModeloDAO.EmpleadoDAO"%>
<%@page import="ModeloDAO.LugarExpedicionDAO"%>
<%@page import="ModeloVO.TipoDocumentoVO"%>
<%@page import="ModeloDAO.TipoDocumentoDAO"%>
<%@page import="ModeloVO.LugarExpedicionVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ModeloVO.EmpleadoVO"%>
<!DOCTYPE html>
<%@include file="sesiones.jsp"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar empleado</title>
    </head>
    <body>
        <h1>Actualizar empleado</h1>
        <%
            EmpleadoVO empVO = (EmpleadoVO) request.getAttribute("EmpleadoConsultado");
            if (empVO != null) {
        %>

        <form method="post" action="Empleado">

            <span>Nombres</span><br>
            <input type="text" name="txtNombres" value="<%=empVO.getNombres()%>" readonly="readonly"><br>                        

            <span>Apellidos</span><br>
            <input type="text" name="txtApellidos" value="<%=empVO.getApellidos()%>" readonly="readonly"><br>                        
            
            <span>Tipo de documento</span><br>
            <select required="" name="txtIdTipoDocumento">
                
                <%  
                    TipoDocumentoDAO tipoDocDAO = new TipoDocumentoDAO();
                    for (TipoDocumentoVO tipoDocVO : tipoDocDAO.Listar()) {
                %>
                <option selected="" required="" value="<%=tipoDocVO.getIdTipoDocumento()%>"><%=tipoDocVO.getTipoDocumento()%></option>
                <%}%>
            </select><br>

            <span>Número de Documento</span><br>
            <input type="text" name="txtNumeroDocumento" value="<%=empVO.getNumeroDocumento()%>" readonly="readonly"><br>                        

            <span>Télefono</span><br>
            <input onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;" maxlength="10" type="text" name="txtTelefono" value="<%=empVO.getTelefono()%>" ><br>     

            <span>Email</span><br>
            <input type="text" name="txtEmail" value="<%=empVO.getEmail()%>" ><br>                        

             <span>Lugar Expedición</span><br>
            <select required="" name="txtIdLugarExpedicion">
                <%
                    LugarExpedicionDAO lugarDAO = new LugarExpedicionDAO();
                    for (LugarExpedicionVO lugarVO : lugarDAO.Listar()) {

                %>
                <option selected required="" value="<%=lugarVO.getIdLugarExpedicion()%>"><%=lugarVO.getCiudad()%></option>
                <%}%>
            </select><br> 
            <span>Estado</span>
            <select aria-required="true" name="txtEstado">
                <option selected disabled>Seleccione...</option>
                <option value="0">Inactivo</option>
                <option value="1">Activo</option>  
            </select>

            <button>Actualizar</button>
            <input type="hidden" value="2" name="opcion">
            <br>
            <a href="ConsultarEmpleado.jsp">Actualizar otro empleado</a>
        </form>
        <% } else {
                request.getRequestDispatcher("ConsultarEmpleado.jsp").forward(request, response);
            }
        %>
    
</body>
</html>
