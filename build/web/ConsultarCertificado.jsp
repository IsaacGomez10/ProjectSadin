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
        <link rel="stylesheet" href="./CSS/Styles.css">
    </head>
    <body>

        <h1>Solicitar certificado</h1>
        
        <form method="post" action="ReportesCodigos/CargoDesempenadoCodigo.jsp">
            <div>
                <label>Certificado de cargo desempeñado</label><br>
            <label>Ingrese número documento nuevamente</label><br>
            <input type="text" name="numeroDocumento" id="txtidcliente" placeholder="Ingrese número de documento">
            </div>
            <div>
            &nbsp;
            <input type="submit" name="button" id="button" value="Generar Reporte">
            </div>
        </form>
        
        
        <form method="post" action="ReportesCodigos/SueldoBaicoCodigo.jsp">
            <div>
                <label>Certificado de sueldo básico</label><br>
            <label>Ingrese número documento nuevamente</label><br>
            <input type="text" name="numeroDocumento" id="txtidcliente" placeholder="Ingrese número de documento">
            </div>
            <div>
            &nbsp;
            <input type="submit" name="button" id="button" value="Generar Reporte">
            </div>
        </form>
        
        <form method="post" action="ReportesCodigos/TiempoDeServicioCodigo.jsp">
            <div>
                <label>Certificado de tiempo de servicio</label><br>
            <label>Ingrese número documento nuevamente</label><br>
            <input type="text" name="numeroDocumento" id="txtidcliente" placeholder="Ingrese número de documento">
            </div>
            <div>
            &nbsp;
            <input type="submit" name="button" id="button" value="Generar Reporte">
            </div>
        </form>
        
        <form method="post" action="ReportesCodigos/TipoDeContratoCodigo.jsp">
            <div>
                <label>Certificado de tipo de contrato</label><br>
            <label>Ingrese número documento nuevamente</label><br>
            <input type="text" name="numeroDocumento" id="txtidcliente" placeholder="Ingrese número de documento">
            </div>
            <div>
            &nbsp;
            <input type="submit" name="button" id="button" value="Generar Reporte">
            </div>
        </form>
        

    </body>
</html>
