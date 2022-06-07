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
        <title>Certificación</title>
    </head>
    <body>

        <h1>Solicitar certificado</h1>

        <%
            SolicitudVO solVO = (SolicitudVO) request.getAttribute("ValidarCertificadoInactivo");

            if (solVO != null) {

        %>
         <form method="post" action="Reporte/TiempoDeServicioInactivo.jsp" target="_black">
                <div>
                    <label><b>Certificado de tiempo de servicio</b></label><br>
                    <input type="hidden" name="numeroDocumento"   value="<%=solVO.getNumeroDocumento()%>">
                </div>
                <div>
                    &nbsp;
                    <input type="submit" name="button" id="button" value="Generar Reporte">
                </div>
            </form>
        <% } else {
                request.getRequestDispatcher("ConsultarEmpleado.jsp").forward(request, response);
            }
        %>

    </body>
</html>
