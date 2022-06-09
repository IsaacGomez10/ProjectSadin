<%-- 
    Document   : cambiarContraseña
    Created on : 17/05/2022, 05:52:40 PM
    Author     : AdminSena
--%>

<%@page import="ModeloVO.LugarExpedicionVO"%>
<%@page import="ModeloDAO.LugarExpedicionDAO"%>
<%@page import="ModeloVO.EmpleadoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sesiones.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cambiar Contraseña</title>
    </head>
    <body>
        <h1>Cambiar Contraseña</h1>
        
        <%@include file="navFuncionario.jsp" %>
        
        <form method="post" action="Funcionario">

            <table>
                <tr>
                    <th>
                        <input type="hidden" value="<%=Usuario%>" name="txtUsuario">
                        Contraseña Actual<br>
                        <input type="text" name="txtPassword"><br><br>
                        Contraseña Nueva<br>
                        <input type="text" name="txtPassword1"><br><br>
                        Confirmar Contraseña<br>
                        <input type="text" name="txtPasswordNueva"><br><br>
                    </th>
                </tr>
            </table>
            <button>Actualizar</button><br>
            <input type="hidden" value="2" name="opcion">
        </form>
        <br>
        <div style="color:red;">
            <%                if (request.getAttribute("MensajeError") != null) {%>
            ${MensajeError}
            <% } else {%>
            ${MensajeExito}
            <%}%>
        </div>

</body>
</html>
