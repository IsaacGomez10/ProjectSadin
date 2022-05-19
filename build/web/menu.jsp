<%-- 
    Document   : index
    Created on : Apr 11, 2022, 5:25:06 PM
    Author     : isaac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="sesiones.jsp"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SADIN</title>
    </head>
    <body>
        <h1>Bienvenido</h1>

        <div>
            <h3>Menú Empleado</h3>

            <div>
                <a href="cambiarContraseña.jsp">Cambiar contraseña</a><br><br>
                <a href="RegistrarEmpleado.jsp">Registrar Empleado</a>
                <a href="RegistrarHorario.jsp">Registrar Horario</a>
                <a href="RegistrarCargo.jsp">Registrar Cargo</a>
            </div>
        </div>
        <br><br>
    </body>
</html>
