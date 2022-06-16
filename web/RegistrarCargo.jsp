<%-- 
    Document   : registrarCargo
    Created on : 28/03/2022, 10:25:09 AM
    Author     : Sena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="sesiones.jsp"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registar Cargo</title>
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
                                        <h4 class="card-title">Registrar Cargo</h4>
                                        <form id="formulario" method="post" action="Cargo" class="form-sample">
                                            <div class="row">
                                                <div class="col-md-10">
                                                    <div class="form-group">
                                                        <label for="exampleInputUsername1">Nombre del cargo</label>
                                                        <input type="text" class="form-control" required="" name="txtNombreCargo" >
                                                    </div>
                                                </div>
                                                <div class="col-md-10">
                                                    <div class="form-group">
                                                        <label for="exampleTextarea1">Descripcion del cargo</label>
                                                        <textarea placeholder="Ingresar Descripción" class="form-control" name="txtDescripcionCargo" rows="4"></textarea>
                                                    </div>
                                                </div>
                                            </div>
                                            <button class="btn btn-warning">Registrar</button>
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
