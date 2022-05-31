<%-- 
    Document   : ConsultarCertificado
    Created on : Apr 25, 2022, 11:07:53 AM
    Author     : isaac
--%>

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
            SolicitudVO solVO = (SolicitudVO) request.getAttribute("ValidarCertificado");
            if (solVO != null) {
        %>

        <section>

            <form method="post" action="Reporte/CargoDesempenado.jsp" target="_black">

                <div>
                    <label><b>Certificado de cargo desempeñado</b></label><br>
                    <input type="hidden" name="numeroDocumento" value="<%=solVO.getNumeroDocumento()%>" placeholder="Ingrese número de documento">
                </div>
                <div>
                    &nbsp;
                    <input type="submit" name="button" id="button" value="Generar Reporte">
                </div>

            </form>
        </section>

        <br>
        <section>
            <form method="post" action="Reporte/SueldoBasico.jsp" target="_black">

                <div>
                    <label><b>Certificado de sueldo básico</b></label><br>
                    <input type="hidden" name="numeroDocumento" value="<%=solVO.getNumeroDocumento()%>" placeholder="Ingrese número de documento">
                </div>
                <div>
                    &nbsp;
                    <input type="submit" name="button" id="button" value="Generar Reporte">
                </div>
            </form>
        </section>
        <br>
        <section>
            <form method="post" action="Reporte/TiempoDeServicio.jsp" target="_black">
                <div>
                    <label><b>Certificado de tiempo de servicio</b></label><br>
                    <input type="hidden" name="numeroDocumento"   value="<%=solVO.getNumeroDocumento()%>" placeholder="Ingrese número de documento">
                </div>
                <div>
                    &nbsp;
                    <input type="submit" name="button" id="button" value="Generar Reporte">
                </div>
            </form>
        </section>
        <br>
        <section>
            <form method="post" action="Reporte/TipoDeContrato.jsp" target="_black">
                <div>
                    <label><b>Certificado de tipo de contrato</b></label><br>
                    <input type="hidden" name="numeroDocumento" value="<%=solVO.getNumeroDocumento()%>" placeholder="Ingrese número de documento">
                </div>
                <div>
                    &nbsp;
                    <input type="submit" name="button" id="button" value="Generar Reporte">
                </div>
            </form>
        </section>

        <% } else {
                request.getRequestDispatcher("ConsultarEmpleado.jsp").forward(request, response);
            }
        %>
    </body>
</html>
