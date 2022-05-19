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
        <h1>Iniciar Sesion</h1>
        <form method="post" action="Funcionario">
            <table>
                <tr>
                    Usuario<br>
                    <input type="text" name="txtUsuario"><br>
                    Contraseña<br>
                    <input type="password" name="txtPassword"><br>
                </tr>
                </table><br>
                <button>Iniciar Sesión</button>
                <input type="hidden" value="3" name="opcion">
        </form>
        <br>
        <a href="registrarFuncionario.jsp">¿No tienes una cuenta aún?</a>
        
        <div style="color:red;">
            <%
                if (request.getAttribute("mensajeError") != null) {%>
            ${mensajeError}
            <% } else {%>
            ${mensajeExito}
            <%}%>
        </div>
    </body>
</html>
