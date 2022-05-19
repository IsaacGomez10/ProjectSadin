<%-- 
    Document   : consultarEmpleado
    Created on : Apr 18, 2022, 9:07:34 PM
    Author     : Damian
--%>

<%@page import="ModeloVO.EmpleadoVO"%>
<%@page import="ModeloDAO.EmpleadoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="sesiones.jsp"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscar Empleado</title>
    </head>
    <body>
        <h1>Consultar Empleado</h1>


        <form method="post" action="Empleado">

            <span>Ingrese el número de documento del empleado</span><br>
            <input type="text" name="txtNumeroDocumento" placeholder="Ingrese Documento"><br>
            
            <button>Consultar</button>
            <input type="hidden" value="3" name="opcion">

        </form>
        
            <%@include file="./ErrorDatosJava/ErrorDatosJava.jsp" %>
        
    </body>
</html>
