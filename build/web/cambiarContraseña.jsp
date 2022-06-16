<%-- 
    Document   : cambiarContraseña
    Created on : 17/05/2022, 05:52:40 PM
    Author     : AdminSena
--%>

<%@page import="ModeloVO.LugarExpedicionVO"%>
<%@page import="ModeloDAO.LugarExpedicionDAO"%>
<%@page import="ModeloVO.EmpleadoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sesiones.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cambiar Contraseña</title>
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
                                        <h4 class="card-title">Cambiar contraseña</h4>
                                        <form class="forms-sample" method="post" action="Funcionario">
                                            <input type="hidden" value="<%=Usuario%>" name="txtUsuario">
                                            <div class="form-group">
                                                <label>Contraseña actual</label>
                                                <input type="password" class="form-control" id="exampleInputPassword1" name="txtPassword">
                                            </div>
                                            <p class="card-description">Ingrese nueva contraseña</p>
                                            <div class="form-group">
                                                <label>Contraseña nueva</label>
                                                <input type="password" class="form-control" id="exampleInputPassword1" name="txtPassword1">
                                            </div>
                                            <div class="form-group">
                                                <label>Confirmar contraseña</label>
                                                <input type="password" class="form-control" id="exampleInputConfirmPassword1" name="txtPasswordNueva">
                                            </div>

                                            <button type="submit" class="btn btn-warning mr-2">Confirmar</button>
                                            <input type="hidden" value="2" name="opcion">
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

    </body>
</html>
