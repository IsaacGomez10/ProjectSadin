<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Sadin Certificados</title>

        <!-- icon  -->
        <link rel="icon" href="Css/recursos/Logo sadin.svg">
        <!-- font awesome cdn link  -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">

        <!-- custom css file link  -->
        <link rel="stylesheet" href="Css/estilosLanding.css">

        <!-- font awesome icons -->
        <link rel="stylesheet" href="css/font-awesome.css">

    </head>

    <body ondragstart="return false" onselectstart="return false" oncontextmenu="return false">

        <!-- header section starts  -->

        <header>
            <a href="landingPage.jsp"><img class="LogoTitulo" src="Css/recursos/LogoHeader.svg"></a>

            <input type="checkbox" id="menu-bar">
            <label for="menu-bar" class="fas fa-bars"></label>

            <nav class="navbar">
                <a href="#home">Inicio</a>
                <a href="#about">Acerca De Sadin</a>
                <a href="#features">M�dulos</a>
                <a href="#review">Funcionalidades</a>
                <a href="#ventajas">Ventajas</a>
                <a href="#contact">Contacto</a>
                <a class="active" href="index.jsp">Iniciar Sesi�n</a>

            </nav>

        </header>

        <!-- header section ends -->

        <!-- home section starts  -->
        <section class="home" id="home">

            <div class="content">
                <h3>tu Certificado Laboral<span> Desde Casa</span></h3>
                <p>Solicita tu certificado laboral �gil, sin papeleo ni complicaciones</p>
                <a href="CertificadoSolicitud.jsp" class="btn">Solicitar Certificado <i class="fas fa-angle-double-right"></i></a>
            </div>

            <div class="image">
                <img src="Css/recursos/Inicio.svg" alt="inicio">
            </div>

        </section>

        <!-- home section ends -->

        <!-- about section starts  -->

        <section class="about" id="about">

            <h1 class="heading"> Acerca de SADIN </h1>

            <div class="column">
                <div class="image">
                    <img src="Css/recursos/AcercaDe.svg" alt="acerca">
                </div>
                <div class="content">
                    <p>T� certificado laboral de una manera f�cil, rap�da y eficiente.</p>
                    <br>
                    <p>Sadin certificados es una aplicaci�n de software a medida que automatiza y acelera procesos gracias a la
                        tecnolog�a y la programaci�n. Nos dedicamos a ver oportunidades de mejora donde otros ven problemas. </p>
                </div>
            </div>

        </section>

        <!-- about section ends -->

        <!-- features section starts  -->

        <section class="features" id="features">

            <h1 class="heading"> M�dulos </h1>

            <div class="box-container">

                <div class="box">
                    <div class="user">
                        <div class="stars">

                        </div>
                    </div>
                    <img src="Css/recursos/usuarios.svg" alt="usuarios">
                    <h3>Usuarios</h3>
                    <p> Los usuarios, determinados funcionarios o administradores tienen varias funcionalidades, entre ellas est�n
                        registrar, actualizar y eliminar informaci�n relacionada con los empleados. Por otro lado los usuarios
                        externos van a poder solicitar certificados laborales generados inmediatamente.</p>
                </div>

                <div class="box">
                    <img src="Css/recursos/certificacion.svg" alt="certificado">
                    <h3>Certificados</h3>
                    <p>Simplemente ingrese a la p�gina, dir�jase a la pesta�a solicitar
                        certificado, ingrese los datos que se le solicitan, elija el tipo
                        de certificado laboral que necesita y por �ltimo descargue el documento.
                    </p>
                </div>



        </section>

        <!-- features section ends -->



        <!-- review section starts  -->


        <section class="aboutSadin" id="review">

            <h1 class="heading"> Funcionalidades </h1>

            <div class="column">

                <div class="imageAbout">
                    <img src="Css/recursos/funcionalidad.svg" alt="funcion">
                </div>

                <div class="functions">
                    <ul>
                        <li><i class="fas fa-check"></i> Carga masiva de datos apartir de los registros de la compa�ia. </li>
                        <li><i class="fas fa-check"></i> Generador de claves para empleados antiguos. </li>
                        <li><i class="fas fa-check"></i> Capacidad de editar datos de manera eficiente. </li>
                        <li><i class="fas fa-check"></i> Permite actualizar el contrato de manera r�pida.</li>
                        <li><i class="fas fa-check"></i> Descargar certificado de tu preferencia desde la p�gina web. </li>
                    </ul>
                </div>


            </div>

        </section>

        <!-- review section ends -->

        <!-- pricing section starts  -->

        <section class="aboutSadinCertificados" id="ventajas">

            <h1 class="heading"> Ventajas </h1>

            <div class="column">

                <div class="imageAbout">
                    <img src="Css/recursos/ventajas.svg" alt="ventaja">
                </div>

                <div class="functions">
                    <ul>
                        <li><i class="fas fa-check"></i> Aumentar� la seguridad de la empresa haciendo la informaci�n m�s personal.
                        </li>
                        <li><i class="fas fa-check"></i> Mejora del medio ambiente al no imprimir papel. </li>
                        <li><i class="fas fa-check"></i> Validez legal de nuestros certificados. </li>
                        <li><i class="fas fa-check"></i> �gilidad para obtener certificado.</li>
                        <li><i class="fas fa-check"></i> Aumento en la productivad del �rea recursos humanos.</li>
                        <li><i class="fas fa-check"></i> F�cil interacci�n para los usuarios. </li>

                    </ul>
                </div>


            </div>

        </section>

        <!-- pricing section ends -->

        <!-- contact section starts  -->

        <section class="contact" id="contact">
            <div class="image">
                <img src="Css/recursos/contacto.svg" alt="contacto">
            </div>

            <form action="">

                <h1 class="heading__contact">Contacto</h1>

                <div class="form__groups">
                    <input type="text" id="name" class="form__inputs" placeholder=" " autocomplete="off">
                    <label for="name" class="form__labels">Nombre</label>
                </div>

                <div class="form__groups">
                    <input type="text" id="email" class="form__inputs" placeholder=" " autocomplete="off">
                    <label for="email" class="form__labels">Correo Electr�nico</label>
                </div>

                <div class="form__groups">
                    <input type="text" id="phone" class="form__inputs" placeholder=" " autocomplete="off" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)
                                                event.returnValue = false;">
                    <label for="phone" class="form__labels">Tel�fono</label>
                </div>

                <div class="form__groups">
                    <textarea type="text" id="message" class="form__textarea" placeholder=" " autocomplete="off"></textarea>
                    <label for="message" class="form__labels">Mensaje</label>

                    <input type="submit" class="btn" value="Enviar">
                </div>

            </form>

        </section>


        <!-- contact section edns -->

        <!-- footer section starts  -->


        <footer class="footer">
            <img class="logo-image" src="Css/recursos/LogoHeader.svg">

            <p>&copy;2021
                SAD�N -
                Todos los derechos reservados</p>
        </footer>
        <!-- footer section ends -->

    </body>

</html>