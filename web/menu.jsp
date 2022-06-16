<%-- 
    Document   : index
    Created on : Apr 11, 2022, 5:25:06 PM
    Author     : isaac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="sesiones.jsp"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SADIN</title>
        <%@include file="VistasParciales/linksHead.jsp"%>

    </head>
    <body>
        <div class="container-scroller">
            <%@include file="VistasParciales/navDashboard.jsp"%>

            <div class="container-fluid page-body-wrapper">
                <%@include file="VistasParciales/menuDashboard.jsp"%>

                <div class="main-panel">
                    <div class="content-wrapper">
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
