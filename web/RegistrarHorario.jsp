<%-- 
    Document   : registrarHorario
    Created on : 12/04/2022, 09:15:37 AM
    Author     : casti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="sesiones.jsp"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Horario</title>
    </head>
    <body>

    <center>
        <h1>Registrar Horario</h1>
        <form method="post" action="Horario">

            <span>Descripcion de horario</span><br>
            <textarea required name="txtHorarioLaboral" rows="5" cols="40" style="resize: none;" placeholder="Ingresar Descripción"></textarea><br>

            <button>Registrar</button>
            <input type="hidden" value="1" name="opcion">
        </form><br>
        <a href="Index.jsp">Inicio</a>
        <div style="color:red;">
            <%                if (request.getAttribute("MensajeError") != null) {%>
            ${MensajeError}
            <% } else {%>
            ${MensajeExito}
            <%}%>
        </div>

    </center>
</body>
</html>
