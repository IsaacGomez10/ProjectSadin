<%-- 
    Document   : olvidarContraseña
    Created on : 22/05/2022, 09:20:16 PM
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recuperar contraseña</title>
        <!-- icon  -->
        <link rel="icon" href="Css/recursos/Logo sadin.svg">
        <!-- font awesome cdn link  -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">

        <!-- custom css file link  --
        <link rel="stylesheet" href="Css/estilos.css"-->

        <!-- font awesome icons -->
        <link rel="stylesheet" href="css/font-awesome.css">
    </head>
    <body>
        <%--@include file="VistasParciales/nav.jsp" --%>

        <h1>Recuperar contraseña</h1>
        <form method="post" action="Funcionario">

            <label for="user">Número de Documento</label>
            <br>
            <input type="text" id="user" name="txtUsuario" placeholder=" " autocomplete="off"><br>
            <button>Restaurar Contraseña</button>
            <input type="hidden" value="4" name="opcion">
        </form>
        <div style="color:red;">
            <%                if (request.getAttribute("MensajeError") != null) {%>
            ${MensajeError}
            <% } else {%>
            ${MensajeExito}
            <%}%>
        </div>
    </body>
</html>