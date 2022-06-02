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

            <div class="captcha-container">
            <span>Número de Documento</span><br>
            <input type="text" name="txtNumeroDocumento" placeholder="Ingrese documento">

            <!--Captcha-->
                <div class="header">Verificar Captcha</div>
                <div class="securityCode">
                    <p id="code"></p>
                    <div class="icons">
                        <span class="changeText">
                            <i class="fas fa-sync-alt"></i>
                        </span>
                    </div>
                </div>
                <div class="userInput">
                    <input type="text" placeholder="Ingrese captcha" ><br>
                    <button>Confirmar</button>
                    <input type="hidden" value="1" name="opcion">
                </div>
            </div>
            <div>


            </div>

        </form><br>
        <%@include file="./ErrorDatosJava/ErrorDatosJava.jsp" %>

        <script src="./JavaScript/ReCaptcha.js"></script>

    </body>
</html>
