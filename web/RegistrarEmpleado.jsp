<%-- 
    Document   : RegistrarEmpleado
    Created on : Apr 12, 2022, 12:16:46 PM
    Author     : Damian
--%>

<%@page import="ModeloVO.TipoDocumentoVO"%>
<%@page import="ModeloDAO.TipoDocumentoDAO"%>
<%@page import="ModeloVO.LugarExpedicionVO"%>
<%@page import="ModeloDAO.LugarExpedicionDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="sesiones.jsp"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Empleado</title>
        <!-- icon  -->
        <link rel="icon" href="Css/recursos/Logo sadin.svg">
        <%@include file="VistasParciales/linksHead.jsp"%>

    </head>
    <body>
        <div class="container-scroller">
            <%@include file="VistasParciales/navDashboard.jsp"%>

            <div class="container-fluid page-body-wrapper">
                <%@include file="VistasParciales/menuDashboard.jsp"%>

                <div class="main-panel">
                    <div class="content-wrapper">
                        <div class="row">
                            <div class="col-12 grid-margin">
                                <div class="card">
                                    <div class="card-body">
                                        <h4 class="card-title">Registrar Empleado</h4>
                                        <form class="form-sample">
                                            <div class="row">
                                                <div class="col-md-10">
                                                    <div class="form-group ">
                                                        <label>Nombres</label>
                                                        <input required="" type="text" class="form-control" name="txtNombres" id="nombre" />
                                                    </div>
                                                </div>
                                                <div class="col-md-10">
                                                    <div class="form-group ">
                                                        <label>Apellidos </label>
                                                        <input required="" type="text" name="txtApellidos" id="apellido" class="form-control" />
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-md-10">
                                                    <div class="form-group">
                                                        <label>Tipo de documento</label>
                                                        <select required="" class="form-control" name="txtIdTipoDocumento">
                                                            <option selected disabled>Seleccione tipo de documento</option>
                                                            <%  TipoDocumentoDAO tipoDocDAO = new TipoDocumentoDAO();
                                                                for (TipoDocumentoVO tipoDocVO : tipoDocDAO.Listar()) {
                                                            %>
                                                            <option required="" value="<%=tipoDocVO.getIdTipoDocumento()%>"><%=tipoDocVO.getTipoDocumento()%></option>
                                                            <%}%>
                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="col-md-10">
                                                    <div class="form-group">
                                                        <label>Número de documento</label>
                                                        <input type="text" class="form-control" required="" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)
                                                                    event.returnValue = false;" maxlength="14" type="text"  name="txtNumeroDocumento" />
                                                    </div>
                                                </div>
                                                <div class="col-md-10">
                                                    <div class="form-group">
                                                        <label>Teléfono</label>
                                                        <input type="text" class="form-control" required="" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)
                                                                    event.returnValue = false;" maxlength="10" type="text"name="txtTelefono" id="telefono" />
                                                    </div>
                                                </div>
                                                <div class="col-md-10">
                                                    <div class="form-group">
                                                        <label>Correo electrónico</label>
                                                        <input type="text" class="form-control" name="txtEmail" id="email" placeholder="correo@correo.com"/>
                                                    </div>
                                                </div>
                                                <div class="col-md-10">
                                                    <div class="form-group">
                                                        <label>Lugar de expedición</label>

                                                        <select required="" name="txtIdLugarExpedicion" class="form-control" >
                                                            <option selected disabled>Seleccione ciudad</option>
                                                            <%
                                                                LugarExpedicionDAO lugarDAO = new LugarExpedicionDAO();
                                                                for (LugarExpedicionVO lugarVO : lugarDAO.Listar()) {

                                                            %>
                                                            <option required="" value="<%=lugarVO.getIdLugarExpedicion()%>"><%=lugarVO.getCiudad()%></option>
                                                            <%}%>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div> 

                                            <button type="submit" class="btn btn-warning">Continuar</button>
                                            <input type="hidden" value="1" name="opcion">
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <%@include file="VistasParciales/scriptsFooter.jsp"%>


    </body>
</html>
