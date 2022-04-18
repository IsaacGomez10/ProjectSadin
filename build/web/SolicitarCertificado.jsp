<%-- 
    Document   : SolicitarCertificado
    Created on : Apr 12, 2022, 8:40:52 AM
    Author     : isaac
--%>

<%@page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://www.google.com/recaptcha/api.js"></script>
        <title>Solicitar</title>
        <link rel="stylesheet" href="style.css">
        <!-- Font Awesome CDN Link for Icons -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
    </head>
    <body>
        <h1>Solicite su Certificado</h1>
        <form method="post" action="Certificado" class="input-area">

            <%
                Date FechaActual = new Date();
                SimpleDateFormat fechaActual = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String fecha = fechaActual.format(FechaActual);
            %>
            <input type="hidden" name="txtFechaSolicitud" value="<%=fecha%>">

            <span>Ingrese Número de Empleado</span><br>
            <input required type="text" name="txtIdEmpleado" placeholder="Número de empleado"><br>

            <span>Destinatario</span><br>
            <input required type="text" name="txtDestinatario" placeholder="Destinatario"><br>

            <!--Captcha-->
            <div class="captcha-area">
                <div class="captcha-img">
                    <img src="captcha-bg.png" alt="Captch Background">
                    <span class="captcha"></span>
                </div>
                <button class="reload-btn">Generar Código</button>
            </div>
            <form action="#" class="input-area">
                <input type="text" placeholder="Ingresa Captcha" maxlength="6" spellcheck="false" required>
                <button class="check-btn">Confirmar</button>
            </form>
            <div class="status-text"></div>
            <!--Captcha-->

            <button>Siguiente</button>
            <input type="hidden" name="opcion" value="1">
        </form><br>

        <a href="Index.jsp">Inicio</a>

        <div class="error">
            <%if (request.getAttribute("mensajeError") != null) {%>
            ${mensajeError}
            <% } else {%>
            ${mensajeExito}
            <%}%>
        </div>
        <script src="JavaScript/ReCaptcha.js"></script>
    </body>
</html>
