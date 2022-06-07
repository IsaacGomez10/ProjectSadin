<%-- 
    Document   : CertificadoSolicitud
    Created on : Apr 25, 2022, 11:07:14 AM
    Author     : isaac
--%>
<%@page import="ModeloSolicitudVO.SolicitudVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="./EliminarCache/EliminarCache.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Certificación</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css">
        <meta http-equiv="Expires" content="0">
        <meta http-equiv="Last-Modified" content="0">
        <meta http-equiv="Cache-Control" content="no-cache, mustrevalidate">
        <meta http-equiv="Pragma" content="no-cache">
    </head>
    <body>
        <%@include file="nav.jsp" %>


        <form method="post" action="Certificacion">

            <label>Para solicitar un su certificado verifique su número de documento</label><br>
            <span>Número de Documento</span>
            <input type="text" name="txtNumeroDocumento" placeholder="Ingrese documento">
            <button>Confirmar</button>
            <input type="hidden" value="1" name="opcion">

        </form>

        <div style="color:red;">
            <%                if (request.getAttribute("MensajeError") != null) {%>
            ${MensajeError}
            <% } else {%>
            ${MensajeExito}
            <%}%>
        </div>

    </body>
</html>
