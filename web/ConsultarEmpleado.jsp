<%-- 
    Document   : consultarEmpleado
    Created on : Apr 18, 2022, 9:07:34 PM
    Author     : Damian
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="ModeloVO.EmpleadoVO"%>
<%@page import="ModeloDAO.EmpleadoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@include file="css-js.jsp" %>
<%@include file="sesiones.jsp"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Empleado</title>
        <script src="JavaScript/Buscador.js" type="text/javascript"></script>
    </head>

    <body>


        <%@include file="navFuncionario.jsp" %>
        <h1>Actualizar Empleado</h1>

        <form method="post" action="Empleado">
            <%--
            llevar esto para datatable
            <section>
                <label>Ingrese número de documento del empleado que busca, si ingresa un número desconocido no recibira datos.</label><br>
                <label>Buscar empleado</label>
                <input id="buscarDocumento" type="text" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)
                            event.returnValue = false;" maxlength="14" onkeyup="doSearch()" placeholder="Ingrese documento"/>
            </section>--%>
            <br>
            
            <div>
                <label>Ingrese número de documento del empleado que actualizara</label><br>
                <label>Buscar empleado</label>
                <input name="txtNumeroDocumento" type="text" placeholder="Ingrese documento" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)
                            event.returnValue = false;" >
                <td><button>Editar</button></td>
                <input type="hidden" value="3" name="opcion">
            </div>
            <table border="1" id="datos" number-per-page="10">
                <thead>
                    <tr>
                        <th>Nombres</th>
                        <th>Apellidos</th>
                        <th>Tipo de documento</th>
                        <th>Número de documento</th>
                        <th>Teléfono</th>
                        <th>Correo electrónico</th>
                        <th>Lugar expedición</th>
                        <th>Estado actual</th>
                    </tr>
                </thead>

                <%                    EmpleadoDAO empDAO = new EmpleadoDAO();
                    ArrayList<EmpleadoVO> listaEmpleados = empDAO.obtenerEmpleados();
                    for (EmpleadoVO empVO : listaEmpleados) {

                %>

                <tr>
                    <td><%=empVO.getNombres()%></td>
                    <td><%=empVO.getApellidos()%></td>
                    <td><%=empVO.getIdTipoDocumento()%></td>
                    <td><%=empVO.getNumeroDocumento()%></td>
                    <td><%=empVO.getTelefono()%></td>
                    <td><%=empVO.getEmail()%></td>
                    <td><%=empVO.getIdLugarExpedicion()%></td>
                    <td><%=empVO.getEstado()%></td>
                </tr>
                <% }%>
            </table>
        </form>

        <div style="color:red;">
            <%                if (request.getAttribute("MensajeError") != null) {%>
            ${MensajeError}
            <% } else {%>
            ${MensajeExito}
            <%}%>
        </div>

        <%@include file="./ErrorDatosJava/ErrorDatosJava.jsp" %>

    </body>
</html>