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
                                        <h4 class="card-title">Registrar Horario</h4>
                                        <form class="form-sample" method="post" action="Horario">
                                            <div class="row">
                                                <div class="col-md-12">
                                                    <div class="form-group">
                                                        <label for="exampleTextarea1">Descripción de horario</label>
                                                        <textarea placeholder="Ingresar Descripción" required name="txtHorarioLaboral" class="form-control" id="exampleTextarea1" rows="4"></textarea>
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
                    <%@include file="VistasParciales/footerDashboard.jsp"%>  
                </div>
                
            </div>
        </div>
        <%@include file="VistasParciales/scriptsFooter.jsp"%>
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <%@include file="ErrorDatosJava/ErrorDatosJava.jsp"%>

    </body>
</html>
