<%-- 
    Document   : ActualizarEmpleado
    Created on : Apr 18, 2022, 9:14:21 PM
    Author     : Damian
--%>

<%@page import="ModeloDAO.EmpleadoDAO"%>
<%@page import="ModeloDAO.LugarExpedicionDAO"%>
<%@page import="ModeloVO.TipoDocumentoVO"%>
<%@page import="ModeloDAO.TipoDocumentoDAO"%>
<%@page import="ModeloVO.LugarExpedicionVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ModeloVO.EmpleadoVO"%>
<%@include file="sesiones.jsp"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar empleado</title>
        <!-- icon  -->
        <link rel="icon" href="Css/recursos/Logo sadin.svg">
        <%@include file="VistasParciales/linksHead.jsp"%>
    </head>
    <body>

        <div class="container-scroller">
            <%@include file="VistasParciales/navDashboard.jsp"%>

            <div class="container-fluid page-body-wrapper">
                <%@include file="VistasParciales/menuDashboard.jsp"%>

                <%                    EmpleadoVO empVO = (EmpleadoVO) request.getAttribute("obtenerDatos");
                    if (empVO != null) {
                %>
                <div class="main-panel">
                    <div class="content-wrapper">
                        <div class="row">
                            <div class="col-12 grid-margin">
                                <div class="card">
                                    <div class="card-body">
                                        <h4 class="card-title">Actualizar Empleado</h4>   
                                        <form class="form-sample" method="post" action="Empleado">
                                            <div class="row">
                                                <div class="col-md-6">
                                                    <div class="form-group ">
                                                        <label>Nombres</label>
                                                        <input required="" type="text" class="form-control" name="txtNombres" id="nombre" value="<%=empVO.getNombres()%>" readonly="readonly"/>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group ">
                                                        <label>Apellidos </label>
                                                        <input required="" type="text" name="txtApellidos" id="apellido" class="form-control" value="<%=empVO.getApellidos()%>" readonly="readonly"/>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label>Tipo de Documento</label>
                                                        <select required="" class="form-control" name="txtIdTipoDocumento">
                                                            <option selected disabled value="<%=empVO.getIdTipoDocumento()%>"><%=empVO.getIdTipoDocumento()%></option>
                                                            <%  TipoDocumentoDAO tipoDocDAO = new TipoDocumentoDAO();
                                                                for (TipoDocumentoVO tipoDocVO : tipoDocDAO.Listar()) {
                                                            %>
                                                            <option value="<%=tipoDocVO.getIdTipoDocumento()%>"><%=tipoDocVO.getTipoDocumento()%></option>

                                                            <%}%>
                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label>Número de Documento</label>
                                                        <input type="text" class="form-control" required="" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)
                                                                    event.returnValue = false;" maxlength="14" type="text"  name="txtNumeroDocumento" value="<%=empVO.getNumeroDocumento()%>" readonly="readonly" />
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label>Teléfono</label>
                                                        <input type="text" class="form-control" required="" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)
                                                                    event.returnValue = false;" maxlength="10" type="text"name="txtTelefono" id="telefono" value="<%=empVO.getTelefono()%>"/>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label>Correo Electrónico</label>
                                                        <input type="text" class="form-control" name="txtEmail" id="email" placeholder="correo@correo.com" value="<%=empVO.getEmail()%>" />
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label>Lugar de Expedición</label>

                                                        <select required="" name="txtIdLugarExpedicion" class="form-control" readonly="readonly">
                                                            <option selected value="<%=empVO.getIdLugarExpedicion()%>"><%=empVO.getIdLugarExpedicion()%></option>
                                                            <%
                                                                LugarExpedicionDAO lugarDAO = new LugarExpedicionDAO();
                                                                for (LugarExpedicionVO lugarVO : lugarDAO.Listar()) {

                                                            %>
                                                            <option value="<%=lugarVO.getIdLugarExpedicion()%>"><%=lugarVO.getCiudad()%></option>
                                                            <%}%>
                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label>Estado</label>

                                                        <select required="" name="txtEstado" class="form-control" >
                                                            <option selected value="<%=empVO.getEstado()%>"><%=empVO.getEstado()%></option>
                                                            <option value="1">Activo</option>
                                                            <option value="0">inactivo</option>

                                                        </select>
                                                    </div>
                                                </div>
                                            </div> 

                                            <button type="submit" class="btn btn-warning">Continuar</button>
                                            <input type="hidden" value="2" name="opcion">
                                            <a class="btn btn-inverse-success" href="ConsultarEmpleado.jsp">Regresar <i class="ti-back-left"></i></a>
                                        </form>
                                        <% } else {
                                                request.getRequestDispatcher("ConsultarEmpleado.jsp").forward(request, response);
                                            }
                                            %>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <%@include file="VistasParciales/footerDashboard.jsp"%>  
                </div>
            </div>
        </div>
        <%@include file="VistasParciales/scriptsFooter.jsp"%>
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <%@include file="ErrorDatosJava/ErrorDatosJava.jsp"%>  
    </body>
</html>
