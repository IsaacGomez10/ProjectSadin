<nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
    <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
        <a class="navbar-brand brand-logo mr-5" href="menu.jsp"><img src="Css/recursos/LogoHeader.svg" class="mr-2"
                alt="logo" /></a>
        <a class="navbar-brand brand-logo-mini" href="menu.jsp"><img src="Css/recursos/Logo sadin.svg" alt="logo" /></a>
    </div>
    <div class="navbar-menu-wrapper d-flex align-items-center justify-content-end">
        <button class="navbar-toggler navbar-toggler align-self-center" type="button" data-toggle="minimize">
            <span class="icon-menu"></span>
        </button>
        <ul class="navbar-nav navbar-nav-right">
            <li class="nav-item nav-profile dropdown">
                <p class="card-description">
                    <%=NombreUsuario%>
                </p>
                <a class="nav-link dropdown-toggle col-2" href="#" data-toggle="dropdown" id="profileDropdown">
                    <img src="Css/recursos/userPerfil.svg" alt="profile" />
                </a>
                <div class="dropdown-menu dropdown-menu-right navbar-dropdown" aria-labelledby="profileDropdown">
                    <form method="post" action="Sesiones">
                        <div>
                            <input class="dropdown-item" type="submit" value="Cerrar Sesi?n">
                            <i class="ti-power-off text-primary"></i>
                        </div>
                    </form>

                </div>
            </li>
        </ul>
        <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button"
            data-toggle="offcanvas">
            <span class="icon-menu"></span>
        </button>
    </div>
</nav>