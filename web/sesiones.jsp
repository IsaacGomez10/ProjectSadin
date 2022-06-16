<%-- 
    Document   : sesiones
    Created on : 30/03/2022, 10:45:03 AM
    Author     : Sena
--%>

<%@page import="ModeloVO.EmpleadoVO"%>
<%@page import="ModeloVO.FuncionarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
    response.setDateHeader("Expires", 0);
%>

<%
    HttpSession buscarSesion = (HttpSession) request.getSession();
    String IdEmpleado = "", Usuario = "", NombreUsuario = "", IdFuncionario = "";
    if (buscarSesion.getAttribute("datosFuncionario") == null) {
        request.getRequestDispatcher("index.jsp").forward(request, response);

    } else {
        EmpleadoVO empVO = (EmpleadoVO) buscarSesion.getAttribute("datosEmpleado");
        EmpleadoVO empReVO = (EmpleadoVO) buscarSesion.getAttribute("datosEmpleadoRegistrado");
        FuncionarioVO funVO = (FuncionarioVO) buscarSesion.getAttribute("datosFuncionario");
        IdEmpleado = empReVO.getIdEmpleado();
        Usuario = funVO.getUsuario();
        NombreUsuario = (empVO.getNombres() + " " + empVO.getApellidos());
        IdFuncionario = funVO.getIdFuncionario();

    }

%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>

    <body>

    </body>
</html>
