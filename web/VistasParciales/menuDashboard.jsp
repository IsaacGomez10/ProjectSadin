<nav class="sidebar sidebar-offcanvas" id="sidebar">
    <ul class="nav">
        <li class="nav-item">
            <a class="nav-link" href="menu.jsp">
                <i class="icon-grid menu-icon"></i>
                <span class="menu-title">Página Principal</span>
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
                <i class="icon-layout menu-icon"></i>
                <span class="menu-title">Menú Empleados</span>
                <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="ui-basic">
                <ul class="nav flex-column sub-menu">
                    <li class="nav-item"> <a class="nav-link" href="RegistrarEmpleado.jsp">Registrar</a></li>
                    <li class="nav-item"> <a class="nav-link" href="ConsultarEmpleado.jsp">Consultar</a></li>
                    <li class="nav-item"> <a class="nav-link" href="cargarDatos.jsp"> Cargar datos</a></li>
                </ul>
            </div>
        </li>
        <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#form-elements" aria-expanded="false"
               aria-controls="form-elements">
                <i class="icon-columns menu-icon"></i>
                <span class="menu-title">Ingresar datos</span>
                <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="form-elements">
                <ul class="nav flex-column sub-menu">
                    <li class="nav-item"><a class="nav-link" href="RegistrarHorario.jsp">Registrar horario</a>
                    </li>
                    <li class="nav-item"><a class="nav-link" href="RegistrarCargo.jsp">Registrar cargo</a>
                    </li>
                </ul>
            </div>
        </li>
        <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#auth" aria-expanded="false" aria-controls="auth">
                <i class="icon-head menu-icon"></i>
                <span class="menu-title">Usuario</span>
                <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="auth">
                <ul class="nav flex-column sub-menu">
                    <li class="nav-item"> <a class="nav-link" href="#"> Perfil </a></li>
                    <li class="nav-item"> <a class="nav-link" href="cambiarContraseña.jsp"> Cambiar contraseña </a>
                    </li>
                </ul>
            </div>
        </li>
        
    </ul>
</nav>