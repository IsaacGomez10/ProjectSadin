7<%-- 
    Document   : ConfirmarCertificado
    Created on : Apr 13, 2022, 1:41:38 PM
    Author     : isaac
--%>

<%@page import="ModeloVO.SolicitudVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="eliminarCacheEnForms.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <dvi>
        <h1>Bienvenido, Solicita tú Certificado Laboral</h1>

        <div>
            <h2>Verifique Certificado que Solicitara</h2>
            <form action="Certificado" method="post">
                <span>Ingrese Email</span><br>
                <input required type="email" name="txtEmail" placeholder="Ingrese Email"/>
                <div>
                    <input required type="radio" name="opcion" value="2" placeholder=""/>
                    <span>Certificado 1</span><br>
                    <input required type="radio" name="opcion" value="3" placeholder=""/>
                    <span>Certificado 2</span><br>
                    <input required type="radio" name="opcion" value="4" placeholder=""/>
                    <span>Certificado 3</span><br>
                    <input required type="radio" name="opcion" value="5" placeholder=""/>
                    <span>Certificado 4</span><br>
                </div>
                <button type="submit">Solicitar</button>
            </form>

        </div>

    </dvi>

    <div class="error">
        <%                if (request.getAttribute("mensajeError") != null) {%>
        ${mensajeError}
        <% } else {%>
        ${mensajeExito}
        <%}%>
    </div>

</body>
</html>
