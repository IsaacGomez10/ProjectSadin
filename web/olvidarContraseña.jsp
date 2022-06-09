<%-- 
    Document   : olvidarContraseña
    Created on : 22/05/2022, 09:20:16 PM
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recuperar contraseña</title>
    </head>
    <body>
    <center>
        <h1>Recuperar contraseña</h1>
        <form method="post" action="Funcionario">
            <table>
                <tr>
                    <th>
                        Numero de Documento<br>
                        <input type="text" name="txtUsuario"><br><br>
                    </th>
                </tr>
            </table><br>
            <button>Restaurar Contraseña</button>
            <input type="hidden" value="4" name="opcion">
        </form>

       <div style="color:red;">
            <%                if (request.getAttribute("MensajeError") != null) {%>
            ${MensajeError}
            <% } else {%>
            ${MensajeExito}
            <%}%>
        </div>

    </center>
</body>
</html>