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
        <title>Certificación</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css">
    </head>
    <body>

        <form method="post" action="Certificacion">
            <div id="limpiar">
            <span>Número de Documento</span><br>
            <input type="text" name="txtNumeroDocumento" placeholder="Ingrese documento">
            </div>
            <input type="hidden" value="1" name="opcion">
            <br><br>

            <!--Captcha-->
            <div class="captcha-container">
                <div class="header">Verificar Captcha</div>
                <div class="securityCode">
                    <p id="code"></p>
                    <div class="icons">
                        <span class="readText">
                            <i class="fas fa-headphones"></i>
                        </span>
                        <span class="changeText">
                            <i class="fas fa-sync-alt"></i>
                        </span>
                    </div>
                </div>
                <div class="userInput">
                    <input type="text" placeholder="Ingrese captcha" ><br>
                    <button type="submit" class="btn">Confirmar</button>
                </div>
            </div>

        </form><br>
        
        <%@include file="./ErrorDatosJava/ErrorDatosJava.jsp" %>

        <script src="https://code.responsivevoice.org/responsivevoice.js"></script>
        <script src="./JavaScript/ReCaptcha.js"></script>

    </body>
</html>
