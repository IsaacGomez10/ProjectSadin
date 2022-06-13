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
        <!-- font awesome cdn link  -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">

        <!-- custom css file link  -->
        <link rel="stylesheet" href="Css/estilos.css">

        <!-- font awesome icons -->
        <link rel="stylesheet" href="css/font-awesome.css">

    </head>
    <body ondragstart="return false" onselectstart="return false" oncontextmenu="return false">
        <%@include file="VistasParciales/nav.jsp" %>
        <!-- home section starts  -->

        <section id="solicitud">
            <section class="home" id="home">
                <div class="content">
                    <h3>Solicita aquí tu <span>Certificado</span></h3>
                </div>
            </section>
            <div class="carts">
                <div class="carts--hover">
                    <div>
                        <h3>Ingresa tu número de documento</h3>
                        <p>Solicita tu certificado laboral ágil, sin papeleo ni complicaciones,
                            recuerda confirmar tu número de documento para ingresar.</p>
                    </div>
                    <form method="post" action="Certificacion">

                        <div class="forms">
                            <div class="form__groups">
                                <input type="text" name="txtNumeroDocumento" id="doc" class="form__inputs" placeholder=" " autocomplete="off" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)
                                            event.returnValue = false;">
                                <label for="doc" class="form__labels">Número de Documento</label>
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
