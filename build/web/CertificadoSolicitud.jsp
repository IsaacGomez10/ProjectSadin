<%-- 
    Document   : CertificadoSolicitud
    Created on : Apr 25, 2022, 11:07:14 AM
    Author     : isaac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Certificacion</title>
    </head>
    <body>
        <form method="post" action="Certificacion">

            <span>Número de Documento</span><br>
            <input type="text" name="txtNumeroDocumento" placeholder="Ingrese documento"><br>
            <input type="hidden" value="1" name="opcion">
            <button>Consultar</button>

        </form><br>

        <div>
            <%
                if (request.getAttribute("mensajeError") != null) {%>
            ${mensajeError}
            <% }%>
        </div><br>
    </body>
</html>
