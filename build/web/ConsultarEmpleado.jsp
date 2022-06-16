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
<%@include file="sesiones.jsp"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Empleado</title>
        <script src="JavaScript/Buscador.js" type="text/javascript"></script>
        <!-- icon  -->
        <link rel="icon" href="Css/recursos/Logo sadin.svg">
        <%@include file="VistasParciales/linksHead.jsp"%>
        <%@include file="css-js.jsp" %>
    </head>

    <body>

        <div class="container-scroller">
            <%@include file="VistasParciales/navDashboard.jsp"%>

            <div class="container-fluid page-body-wrapper">

                <%@include file="VistasParciales/menuDashboard.jsp"%>

                <div class="main-panel">
                    <div class="content-wrapper">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Consultar empleado</h4>
                                <p class="card-description">
                                    Busque el empleado por su número de documento
                                </p>
                                <form method="post" action="Empleado">
                                    <div class="input-group">
                                        <div class="col-md-4">
                                            <label>Número de documento</label>
                                            <input id="buscarDocumento" type="text" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)
                                                        event.returnValue = false;" maxlength="14" onkeyup="doSearch()" placeholder="Ingrese documento"  class="form-control"/>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-12">
                                            <div class="table-responsive">
                                                <table class="table" id="datos" number-per-page="10" current-page="">
                                                    <thead>
                                                        <tr>
                                                            <th>Nombres</th>
                                                            <th>Apellidos</th>
                                                            <th>Tipo de documento</th>
                                                            <th>Número de documento</th>
                                                            <th>Teléfono</th>
                                                            <th>Correo electrónico</th>
                                                            <th>Lugar expedición</th>
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
                                                        <td>
                                                            <form method="post" action="Empleado">
                                                                <input name="txtNumeroDocumento" type="hidden" value="<%= empVO.getNumeroDocumento()%>">         
                                                                <button class="btn btn-inverse-info btn-icon"><i class="ti-pencil"></i></button>
                                                                <input type="hidden" value="3" name="opcion">
                                                            </form>
                                                        </td>
                                                        <% }%>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="VistasParciales/scriptsFooter.jsp"%>
        <script src="JavaScript/Buscador.js"></script>
    </body>
</html>