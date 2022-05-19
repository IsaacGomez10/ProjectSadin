<%-- 
    Document   : registrarCargo
    Created on : 28/03/2022, 10:25:09 AM
    Author     : Sena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@include file="sesiones.jsp"%>--%>
<!DOCTYPE html>
<%@include file="sesiones.jsp"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registar Cargo</title>
    </head>
    <body>
        <h1>Registrar Cargo</h1>
        <form id="formulario" method="post" action="Cargo">
            <span>Nombre del Cargo</span><br>
            <input required="" type="text" name="txtNombreCargo" placeholder="Ingrese Cargo"><br>
            <span>Descripción del Cargo</span><br>
            <textarea required name="txtDescripcionCargo" rows="5" cols="40" style="resize: none;" placeholder="Ingresar Descripción"></textarea><br>
            <span>Dependencias</span><br>
            <input required type="text" name="txtDependencias" placeholder="Ingrese Dependencia"><br>
            
            <button onclick="return validar();">Registrar</button>
            <input type="hidden" value="1" name="opcion">
        </form><br>
        <a href="Index.jsp">Inicio</a>

        <div>
            <%
                if (request.getAttribute("mensajeError") != null) {%>
            ${mensajeError}
            <% } else {%>
            ${mensajeExito}
            <%}%>
        </div>
        <script>
            function validar() {
                console.log("Datos guardados correctamente!");
                let borrar = document.getElementById("formulario");
                borrar.reset();
                return false;
            }
        </script>
    </body>
</html>
