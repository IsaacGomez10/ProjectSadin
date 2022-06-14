<%-- 
    Document   : cargarCSV
    Created on : May 30, 2022, 9:09:12 PM
    Author     : Damian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sesiones.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cargar datos desde el excel</title>
    </head>

    <body>

        <h1>Cargar datos desde el excel</h1>

        <form action="Cargar" method="post"  enctype="multipart/form-data">                  

            <input type="file" name="archivocsv">

            <button>
                Enviar archivo                                             
            </button>
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
