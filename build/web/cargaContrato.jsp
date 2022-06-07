<%-- 
    Document   : cargaContrato
    Created on : Jun 6, 2022, 10:38:45 AM
    Author     : Damian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%@include file="navFuncionario.jsp" %>

        <h1>Cargar datos desde el excel</h1>

        <form action="CargaContrato" method="post"  enctype="multipart/form-data">                  

            <input type="file" name="archivocsv">
            <img src="../../../../../../AppData/Local/Temp/download.jpg" alt=""/>

            <button>
                Enviar archivo                                             
            </button>
            <input type="hidden" value="1" name="opcion">           

        </form>
        <div style="color:red;">
               <%
                if (request.getAttribute("mensajeError") != null) {%>
            ${mensajeError}
            <% } else {%>
            ${mensajeExito}
            <%}%>
        </div>
    </body>
</html>
