<%-- 
    Document   : registrarFuncionario
    Created on : 28/03/2022, 11:19:39 AM
    Author     : Sena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Funcionario</title>
    </head>
    <body>
    <center>
        <h1>Registrar Funcionario</h1>
        <form method="post" action="Funcionario">
            <table>
                <tr>
                    <th>
                        Numero de Documento<br>
                        <input type="text" name="txtUsuario"><br><br>
                    </th>
                </tr>
            </table><br>
            <button>Registrarse</button>
            <input type="hidden" value="1" name="opcion">
        </form>

        <div style="color:red;">
            <%
                if (request.getAttribute("mensajeError") != null) {%>
            ${mensajeError}
            <% } else {%>
            ${mensajeExito}
            <%}%>
        </div>
    </center>
</body>
</html>
