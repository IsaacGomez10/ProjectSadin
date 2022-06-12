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
        <title>Sadin Certificados</title>
        <!-- icon  -->
        <link rel="icon" href="Css/recursos/Logo sadin.svg">

    </head>
    <body ondragstart="return false" onselectstart="return false" oncontextmenu="return false">
        <%@include file="VistasParciales/nav.jsp" %>
        <!-- home section starts  -->

        <section class="home" id="home">

            <div class="content">
                <h3>tu Certificado Laboral<span> Desde Casa</span></h3>
                <p>Solicita tu certificado laboral ágil, sin papeleo ni complicaciones</p>
                <a href="#solicitud" class="btn">Solicitar Certificado<i class="fas fa-angle-double-right"></i></a>
            </div>

            <div class="image">
                <img src="Css/recursos/Inicio.svg" alt="start">
            </div>

        </section>

        <section id="solicitud">
            <section class="home" id="home">
                <div class="content">
                    <h3>Solicita aquí tu <span>Certificado</span></h3>
                </div>
            </section>
            <div class="carts">
                <div class="carts--hover">

                    <form method="post" action="Certificacion">
                        <div>
                            <h3>Ingresa tu número de documento</h3>
                            <p>Recuerda confirmar tu número de documento para ingresar.</p>
                        </div>
                        <div class="form">
                            <div class="form__group">
                                <input type="text" name="txtNumeroDocumento" id="doc" class="form__input" placeholder=" " autocomplete="off" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)
                                            event.returnValue = false;">
                                <label for="doc" class="form__label">Número de Documento</label>
                            </div>
                        </div>
                        <button class="btn">Confirmar</button>
                        <input type="hidden" value="1" name="opcion">
                    </form>

                </div>
            </div>
        </section>
        <%@include file="VistasParciales/footer.jsp" %>
    </body>
</html>
