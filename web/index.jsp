<%-- 
    Document   : index
    Created on : 28/03/2022, 11:30:51 AM
    Author     : Sena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesion</title>
    </head>
    <body>
        <%@include file="nav.jsp" %>

        <h1>Iniciar Sesión</h1>
        <form method="post" action="Funcionario" >

            <span>Usuario</span><br>
            <input type="text" name="txtUsuario"><br>
            <span>Contraseña</span><br>
            <input type="password" name="txtPassword"><br>
            <br>
            <button>Iniciar Sesión</button>
            <input type="hidden" value="3" name="opcion">
        </form>

        <br>
        <div>¿No tienes una cuenta aún?<a href="registrarFuncionario.jsp"> Crea una cuenta</a></div>
        <a href="olvidarContraseña.jsp">¿Olvidaste tu contraseña?</a></div>

    <div style="color:red;">
        <%
            if (request.getAttribute("MensajeError") != null) {%>
        ${MensajeError}
        <% } else {%>
        ${MensajeExito}
        <%}%>
    </div>

</body>
</html>