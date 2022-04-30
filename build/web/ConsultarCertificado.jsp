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
        <link rel="stylesheet" href="./CSS/Styles.css">
    </head>
    <body>

        <h1>Solicitar certificado</h1>

        <%
            SolicitudVO solVO = (SolicitudVO) request.getAttribute("ValidarCertificado");
            if (solVO != null) {

        %>

        <form method="post" action="Certificacion">

            <div>
                <input type="radio" id="html" name="fav_language" value="HTML">
                <label for="html">HTML</label><br>
                <input type="radio" id="css" name="fav_language" value="CSS">
                <label for="css">CSS</label><br>
                <input type="radio" id="javascript" name="fav_language" value="JavaScript">
                <label for="javascript">JavaScript</label>
            </div>

            <input type="hidden" name="opcion">
            <button type="submit">Solicitar</button><br>
        </form>


        <% } else {
                request.getRequestDispatcher("Certificado solicitud.jsp").forward(request, response);
            }
        %>

    </body>
</html>
