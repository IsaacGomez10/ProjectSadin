<%-- 
    Document   : index
    Created on : 28/03/2022, 11:30:51 AM
    Author     : Sena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://kit.fontawesome.com/64d58efce2.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="Css/styleLogin.css" />
        <!-- icon  -->
        <link rel="icon" href="Css/recursos/Logo sadin.svg">
        <title>Iniciar Sesión</title>
    </head>
    <body ondragstart="return false" onselectstart="return false" oncontextmenu="return false">
        <div class="container">
            <div class="forms-container">
                <div class="signin-signup">
                    <form method="post" action="Funcionario" class="sign-in-form">
                        <a href="landingPage.jsp">
                            <img src="Css/recursos/LogoHeader.svg" class="logo" alt="SADIN">
                        </a>
                        <h2 class="title">Iniciar Sesión</h2>

                        <div class="form">
                            <div class="form__group">
                                <input type="text" name="txtUsuario" class="form__input" id="user" placeholder=" " autocomplete="off" required=""><br>
                                <label for="user" class="form__label">Usuario</label>
                            </div>
                            <div class="form__group">
                                <input type="password" name="txtPassword" id="password" class="form__input" placeholder=" " required="">
                                <label for="password" class="form__label">Contraseña</label>
                            </div>
                        </div>
                        <button class="btn solid" type="submit"> Ingresar <i class="fas fa-angle-double-right"></i></button>
                        <input type="hidden" value="3" name="opcion">
                        <a class="only__link" onclick="cambiarClave()">¿Ha olvidado tu contraseña?</a>
                    </form>

                    <form method="post" action="Funcionario" class="sign-up-form">
                        <a href="landingPage.jsp">
                            <img src="Css/recursos/LogoHeader.svg" class="logo" alt="SADIN"></a>
                        <h2 class="title">Registrate como funcionario</h2>
                        <div class="form">

                            <div class="form__group">
                                <input type="text" name="txtUsuario" id="doc" class="form__input" placeholder=" " autocomplete="off" required="" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)
                                            event.returnValue = false;">
                                <label for="doc" class="form__label">Número de documento</label>
                            </div>

                        </div>
                        <button class="btn solid" type="submit"> Registrarse <i class="fas fa-angle-double-right"></i></button>
                        <input type="hidden" value="1" name="opcion">
                    </form>

                </div>
            </div>

            <div class="panels-container">
                <div class="panel left-panel">
                    <div class="content">
                        <h3>¿Eres nuevo aquí?</h3>
                        <p>

                        </p>
                        <button class="btn transparent" id="sign-up-btn">
                            Registrate
                        </button>

                    </div>
                    <img src="Css/recursos/log.svg" class="image" alt="Login" />
                </div>
                <div class="panel right-panel">
                    <div class="content">
                        <h3>¿Ya tienes cuenta?</h3>
                        <p>

                        </p>
                        <button class="btn transparent" id="sign-in-btn">
                            Iniciar Sesión
                        </button>

                    </div>
                    <img src="Css/recursos/register.svg" class="image" alt="Register" />
                </div>
            </div>

        </div>

        <script src="Css/js/appLogin.js"></script>
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <script src="Css/js/cambiarClave.js"></script>

    </body>
</html>