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
        <%@include file="navFuncionario.jsp" %>
        <h1>Registrar Empleados</h1>

        <form method="post" action="Empleado" id="formulario">
            
            <div class="formulario__grupo" id="grupo__nombre">
                <label for="nombre" class="formulario__label">Nombres</label>
                <div class="formulario__grupo-input">
                    <input required="" type="text" class="formulario__input" name="txtNombres" id="nombre" placeholder="Ingrese Nombres">
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>
                <p class="formulario__input-error">Los Nombres no pueden tener caracteres epeciales.</p>
            </div>


            <div class="formulario__grupo" id="grupo__apellido">
                <label for="apellido" class="formulario__label">Apellidos</label>
                <div class="formulario__grupo-input">
                    <input required="" type="text" class="formulario__input" name="txtApellidos" id="apellido" placeholder="Ingrese Apellidos">
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>
                <p class="formulario__input-error">Los Apellidos no pueden tener caracteres epeciales.</p>
            </div>



            <span>Tipo de documento</span><br>
            <select required="" name="txtIdTipoDocumento">
                <option selected disabled>Seleccione tipo de documento</option>
                <%  TipoDocumentoDAO tipoDocDAO = new TipoDocumentoDAO();
                    for (TipoDocumentoVO tipoDocVO : tipoDocDAO.Listar()) {
                %>
                <option required="" value="<%=tipoDocVO.getIdTipoDocumento()%>"><%=tipoDocVO.getTipoDocumento()%></option>
                <%}%>
            </select><br>


            <div class="formulario__grupo" id="grupo__numeroDocumento">
                <label for="numeroDocumento" class="formulario__label">Número de Documento</label>
                <div class="formulario__grupo-input">
                    <input required="" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;" maxlength="14" type="text" class="formulario__input" name="txtNumeroDocumento" id="numeroDocumento" placeholder="Ingrese Documento">
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>
                <p class="formulario__input-error">Ingrese un número de documento valido.</p>
            </div>


            <div class="formulario__grupo" id="grupo__telefono">
                <label for="telefono " class="formulario__label">Teléfono</label>
                <div class="formulario__grupo-input">
                    <input required="" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;" maxlength="10" type="text" class="formulario__input" name="txtTelefono" id="telefono" placeholder="3XXXXXXXXX">
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>
                <p class="formulario__input-error">Ingrese un número de telefono valido, maximo 10 dígitos.</p>
            </div>


            <div class="formulario__grupo" id="grupo__email">
                <label for="email" class="formulario__label">Correo Electrónico</label>
                <div class="formulario__grupo-input">
                    <input required=""  type="email" class="formulario__input" name="txtEmail" id="email" placeholder="correo@correo.com">
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>
                <p class="formulario__input-error">Ingrese un correo electrónico valido.</p>
            </div>



            <span>Lugar Expedición</span><br>
            <select required="" name="txtIdLugarExpedicion">
                <option selected disabled>Seleccione ciudad</option>
                <%
                    LugarExpedicionDAO lugarDAO = new LugarExpedicionDAO();
                    for (LugarExpedicionVO lugarVO : lugarDAO.Listar()) {

                %>
                <option required="" value="<%=lugarVO.getIdLugarExpedicion()%>"><%=lugarVO.getCiudad()%></option>
                <%}%>
            </select><br>   

            <button type="submit">Continuar</button>
            <input type="hidden" value="1" name="opcion">
        </form>

        <%@include file="./ErrorDatosJava/ErrorDatosJava.jsp" %>
        <script src="JavaScript/validaciones.js"></script>
    </body>
</html>
