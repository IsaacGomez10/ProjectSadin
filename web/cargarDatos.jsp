<%-- 
    Document   : cargarCSV
    Created on : May 30, 2022, 9:09:12 PM
    Author     : Damian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sesiones.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cargar Datos</title>
        <%@include file="VistasParciales/linksHead.jsp"%>
        <link href="Css/file.css" rel="stylesheet">

    </head>

    <body>
        <div class="container-scroller">
            <%@include file="VistasParciales/navDashboard.jsp"%>

            <div class="container-fluid page-body-wrapper">
                <%@include file="VistasParciales/menuDashboard.jsp"%>

                <div class="main-panel">
                    <div class="content-wrapper">
                        <div class="col-12 grid-margin">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="card-title">Cargar datos empleados</h4>
                                    <p class="card-description">
                                        Seleccione un archivo excel(XSLX), cargue los datos con el orden de las instrucciones dadas.
                                    </p>
                                    <form action="Cargar" method="post"  enctype="multipart/form-data">                  
                                        <div class="row">
                                            <div class="col-md-10">
                                                <div class="form-group">
                                                    <input type="file" name="archivocsv" class="uploadFile">
                                                </div>
                                            </div>
                                        </div>
                                            <button class="btn btn-warning">Subir archivo</button>
                                            <input type="hidden" value="1" name="opcion">           
                                    </form>

                                </div>
                            </div>
                        </div>
                        <%@include file="VistasParciales/footerDashboard.jsp"%>  
                    </div>

                </div>

            </div>
            <%@include file="VistasParciales/scriptsFooter.jsp"%>

    </body>
</html>
