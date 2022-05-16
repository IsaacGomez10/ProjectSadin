<%-- 
    Document   : ConsultarCertificado
    Created on : Apr 25, 2022, 11:07:53 AM
    Author     : isaac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Certificación</title>
    </head>
    <body>

        <h1>Solicitar certificado</h1>
        
        <section>
            <form method="post" action="Reporte/CargoDesempenado.jsp" target="_black">
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
        </section>
        
        <section>
            <form method="post" action="Reporte/SueldoBasico.jsp" target="_black">
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
        </section>
        
        <section>
            <form method="post" action="Reporte/TiempoDeServicio.jsp" target="_black">
                <div>
                    <label>Certificado de tiempo de servicio</label><br>
                    <label>Ingrese número documento nuevamente</label><br>
                    <input type="text" name="numeroDocumento3" id="txtidcliente" placeholder="Ingrese número de documento">
                </div>
                <div>
                    &nbsp;
                    <input type="submit" name="button" id="button" value="Generar Reporte">
                </div>
            </form>
        </section>
        
        <section>
            <form method="post" action="Reporte/TipoDeContrato.jsp" target="_black">
                <div>
                    <label>Certificado de tipo de contrato</label><br>
                    <label>Ingrese número documento nuevamente</label><br>
                    <input type="text" name="numeroDocumento4" id="txtidcliente" placeholder="Ingrese número de documento">
                </div>
                <div>
                    &nbsp;
                    <input type="submit" name="button" id="button" value="Generar Reporte">
                </div>
            </form>
        </section>

    </body>
</html>
