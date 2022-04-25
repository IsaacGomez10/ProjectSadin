<%-- 
    Document   : ConsultarCertificado
    Created on : Apr 25, 2022, 11:07:53 AM
    Author     : isaac
--%>

<%@page import="ModeloSolicitudVO.SolicitudVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Certificación</title>
    </head>
    <body>

        <h1>No esperes más para solicitar tu certificado!</h1>

        <%
            SolicitudVO solVO = (SolicitudVO) request.getAttribute("ValidarCertificado");
            if (solVO != null) {

        %>

        <form method="post" action="Certificacion">

            <div class="radio">
                <input type="radio" name="txtCer1" value="2">
                <label>Certificado 1</label>

                <input type="radio" name="txtCer2" value="3">
                <label>Certificado 2</label>

                <input type="radio" name="txtCer3" value="4">
                <label>Certificado 3</label>
                
                <input type="radio" name="txtCer4" value="5">
                <label>Certificado 4</label>
            </div>

            <input type="hidden" name="opcion">
            <button type="submit">Solicitar</button><br>
        </form>


        <% } else {
                request.getRequestDispatcher("consultarVehiculo.jsp").forward(request, response);
            }
        %>
        
        <script src="./CSS/Opciones.css"></script>
    </body>
</html>
