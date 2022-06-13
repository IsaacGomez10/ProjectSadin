<%-- 
    Document   : ConsultarCertificado
    Created on : Apr 25, 2022, 11:07:53 AM
    Author     : isaac
--%>


<%@page import="ModeloSolicitudDAO.SolicitudDAO"%>
<%@page import="ModeloSolicitudVO.SolicitudVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- icon  -->
        <link rel="icon" href="Css/recursos/Logo sadin.svg">
        <title>Certificación</title>
        <link rel="stylesheet" href="Css/estilosCertificado.css">
        <!-- font awesome icons -->
        <link rel="stylesheet" href="css/font-awesome.css">
        <!-- font awesome cdn link  -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    </head>
    <body ondragstart="return false" onselectstart="return false" oncontextmenu="return false">

        <%@include file="VistasParciales/navCertificado.jsp"%>
        <%
            SolicitudVO solVO = (SolicitudVO) request.getAttribute("ValidarCertificadoInactivo");
            if (solVO != null) {
        %>


    <div class="containers">
        <div class="cards">
            <div class="box">
                <div class="content">
                    <form method="post" action="Reporte/TiempoDeServicio.jsp" target="_black">
                        <h1>01</h1>
                        <h3>Certificado tiempo de servicio</h3>
                        <input type="hidden" name="numeroDocumento" value="<%=solVO.getNumeroDocumento()%>">
                        &nbsp;
                        <button type="submit">Obtener</button>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <% } else {
            request.getRequestDispatcher("ConsultarEmpleado.jsp").forward(request, response);
        }
    %>
</body>
</html>
