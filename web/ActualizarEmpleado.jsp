<%-- 
    Document   : ActualizarEmpleado
    Created on : Apr 18, 2022, 9:14:21 PM
    Author     : Damian
--%>

<%@page import="ModeloVO.TipoDocumentoVO"%>
<%@page import="ModeloDAO.TipoDocumentoDAO"%>
<%@page import="ModeloVO.LugarExpedicionVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ModeloVO.EmpleadoVO"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar empleado</title>
    </head>
    <body>
    <center>
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
            <input type="text" name="txtIdTipoDocumento" value="<%=empVO.getIdTipoDocumento()%>" readonly="readonly"><br>                        

            <span>Número de Documento</span><br>
            <input type="text" name="txtNumeroDocumento" value="<%=empVO.getNumeroDocumento()%>" readonly="readonly"><br>                        

            <span>Télefono</span><br>
            <input type="text" name="txtTelefono" value="<%=empVO.getTelefono()%>" ><br>     

            <span>Email</span><br>
            <input type="text" name="txtEmail" value="<%=empVO.getEmail()%>" ><br>                        

            <span>Lugar de Expedición</span><br>
            <input type="text" name="txtIdLugarExpedicion" value="<%=empVO.getIdLugarExpedicion()%>" readonly="readonly"><br>

            <button>Actualizar</button>
            <input type="hidden" value="2" name="opcion">
            <br>
            <a href="ConsultarEmpleado.jsp">Actualizar otro empleado</a>
        </form>
        <% } else {
                request.getRequestDispatcher("ConsultarEmpleado.jsp").forward(request, response);
            }
        %>
    </center>
    
</body>
</html>
