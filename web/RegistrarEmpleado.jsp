<%-- 
    Document   : RegistrarEmpleado
    Created on : Apr 12, 2022, 12:16:46 PM
    Author     : Damian
--%>

<%@page import="ModeloVO.TipoDocumentoVO"%>
<%@page import="ModeloDAO.TipoDocumentoDAO"%>
<%@page import="ModeloVO.LugarExpedicionVO"%>
<%@page import="ModeloDAO.LugarExpedicionDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="sesiones.jsp"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Empleado</title>
    <link rel="stylesheet" href="CSS/estilosForms.css">
    </head>
    <body>
        <h1>Registrar Empleados</h1>

       <form method="post" action="Empleado" id="formulario">


            <div class="formulario__grupo" id="grupo__nombre">
                <label for="nombre" class="formulario__label">Nombre</label>
                <div class="formulario__grupo-input">
                    <input type="text" class="formulario__input" name="txtNombres" id="nombre" placeholder="Ingrese Nombres">
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>
                <p class="formulario__input-error">El usuario tiene que ser de 4 a 16 dígitos y solo puede contener numeros, letras y guion bajo.</p>
            </div>


            <div class="formulario__grupo" id="grupo__apellido">
                <label for="apellido" class="formulario__label">Apellidos</label>
                <div class="formulario__grupo-input">
                    <input type="text" class="formulario__input" name="txtApellidos" id="apellido" placeholder="Ingrese Apellidos">
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>
                <p class="formulario__input-error">El usuario tiene que ser de 4 a 16 dígitos y solo puede contener numeros, letras y guion bajo.</p>
            </div>



            <span>Tipo de documento</span><br>
            <select aria-required="true" name="txtIdTipoDocumento">
                <option selected disabled>Seleccione...</option>
                <%  TipoDocumentoDAO tipoDocDAO = new TipoDocumentoDAO();
                    for (TipoDocumentoVO tipoDocVO : tipoDocDAO.Listar()) {
                %>
                <option value="<%=tipoDocVO.getIdTipoDocumento()%>"><%=tipoDocVO.getTipoDocumento()%></option>
                <%}%>
            </select><br>


            <div class="formulario__grupo" id="grupo__numeroDocumento">
                <label for="numeroDocumento" class="formulario__label">Numero Documento</label>
                <div class="formulario__grupo-input">
                    <input type="text" class="formulario__input" name="txtNumeroDocumento" id="numeroDocumento" placeholder="Ingrese Documento">
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>
                <p class="formulario__input-error">El documento solo puede contener numeros y el maximo son 14 dígitos.</p>
            </div>


            <div class="formulario__grupo" id="grupo__telefono">
                <label for="telefono " class="formulario__label">Telefono</label>
                <div class="formulario__grupo-input">
                    <input type="text" class="formulario__input" name="txtTelefono" id="telefono" placeholder="Ingrese Documento">
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>
                <p class="formulario__input-error">El telefono solo puede contener numeros y el maximo son 14 dígitos.</p>
            </div>


            <div class="formulario__grupo" id="grupo__email">
                <label for="email" class="formulario__label">Correo Electrónico</label>
                <div class="formulario__grupo-input">
                    <input type="email" class="formulario__input" name="txtEmail" id="email" placeholder="correo@correo.com">
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>
                <p class="formulario__input-error">El correo solo puede contener letras, numeros, puntos, guiones y guion bajo.</p>
            </div>



            <span>Lugar Expedición</span><br>
            <select aria-required="true" name="txtIdLugarExpedicion">
                <option selected disabled>Seleccione...</option>
                <%
                    LugarExpedicionDAO lugarDAO = new LugarExpedicionDAO();
                    for (LugarExpedicionVO lugarVO : lugarDAO.Listar()) {

                %>
                <option value="<%=lugarVO.getIdLugarExpedicion()%>"><%=lugarVO.getCiudad()%></option>
                <%}%>
            </select><br>   

            <button type="submit">Continuar</button>
            <input type="hidden" value="1" name="opcion">
        </form>

        <%@include file="./ErrorDatosJava/ErrorDatosJava.jsp" %>
        <script src="JavaScript/validaciones.js"></script>
    </body>
</html>
