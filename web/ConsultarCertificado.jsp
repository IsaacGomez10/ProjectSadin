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
    </head>
    <body ondragstart="return false" onselectstart="return false" oncontextmenu="return false">
        <%@include file="VistasParciales/nav.jsp" %>

        <%
            SolicitudVO solVO = (SolicitudVO) request.getAttribute("ValidarCertificadoActivo");
            if (solVO != null) {
        %>


        <div class="containers">
            <section>

                <div class="home" id="home">
                    <div class="content">
                        <h3>Seleccione un <span>Certificado</span></h3>
                    </div>
                </div>
            </section>
            <div class="cards">
                <div class="box">
                    <div class="content">
                        <form method="post" action="Reporte/CargoDesempenado.jsp" target="_black">
                            <h1>01</h1>
                            <h3>Certificado cargo desempeñado</h3>
                            <input type="hidden" name="numeroDocumento" value="<%=solVO.getNumeroDocumento()%>">
                            &nbsp;
                            <button type="submit">Obtener</button>
                        </form>
                    </div>
                </div>
            </div>
            <div class="cards">
                <div class="box">
                    <div class="content">
                        <form method="post" action="Reporte/SueldoBasico.jsp" target="_black">
                            <h1>02</h1>
                            <h3>Certificado sueldo básico</h3>
                            <input type="hidden" name="numeroDocumento" value="<%=solVO.getNumeroDocumento()%>">
                            &nbsp;
                            <button type="submit">Obtener</button>
                        </form>
                    </div>
                </div>
            </div>
            <div class="cards">
                <div class="box">
                    <div class="content">
                        <form method="post" action="Reporte/TiempoDeServicio.jsp" target="_black">
                            <h1>03</h1>
                            <h3>Certificado tiempo de servicio</h3>
                            <input type="hidden" name="numeroDocumento"   value="<%=solVO.getNumeroDocumento()%>">
                            &nbsp;
                            <button type="submit">Obtener</button>
                        </form>
                    </div>
                </div>
            </div>
            <div class="cards">
                <div class="box">
                    <div class="content">
                        <form method="post" action="Reporte/TipoDeContrato.jsp" target="_black">
                            <h1>04</h1>
                            <h3>Certificado tipo de contrato</h3>
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
