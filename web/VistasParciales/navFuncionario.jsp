<!-- partial -->
<div class="container-fluid page-body-wrapper">
    <!-- partial:partials/_sidebar.html -->
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
                        <li class="nav-item"> <a class="nav-link" href="RegistrarEmpleado.jsp">Registrar Empleado</a></li>
                        <li class="nav-item"> <a class="nav-link" href="ConsultarEmpleado.jsp">Actualizar Empleado</a></li>
                    </ul>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link" data-toggle="collapse" href="#form-elements" aria-expanded="false"
                   aria-controls="form-elements">
                    <i class="icon-columns menu-icon"></i>
                    <span class="menu-title">Registrar Datos</span>
                    <i class="menu-arrow"></i>
                </a>
                <div class="collapse" id="form-elements">
                    <ul class="nav flex-column sub-menu">
                        <li class="nav-item"><a class="nav-link" href="RegistrarCargo.jsp">Registrar Cargo</a>
                        </li>
                        <li class="nav-item"><a class="nav-link" href="RegistrarHorario.jsp">Registrar Horario</a>
                        </li>
                    </ul>
                </div>
            </li>

            <li class="nav-item">
                <a class="nav-link" data-toggle="collapse" href="#tables" aria-expanded="false" aria-controls="tables">
                    <i class="icon-grid-2 menu-icon"></i>
                    <span class="menu-title">Tabla de datos</span>
                    <i class="menu-arrow"></i>
                </a>
                <div class="collapse" id="tables">
                    <ul class="nav flex-column sub-menu">
                        <li class="nav-item"> <a class="nav-link" href="pages/tables/data-table.html">Consulta Datos</a></li>
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
                        <li class="nav-item"> <a class="nav-link" href="cambiarContraseña.jsp">Cambiar contraseña</a>
                        </li>
                    </ul>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="pages/documentation/documentation.html">
                    <i class="icon-paper menu-icon"></i>
                    <span class="menu-title">Documentación</span>
                    <i class="menu-arrow"></i>
                </a>
            </li>
        </ul>
    </nav>
</div>
<!-- page-body-wrapper ends -->

<nav>
    <ul>
        <li><a href="cambiarContraseña.jsp">Cambiar contraseña</a></li>
        <li><a href="RegistrarEmpleado.jsp">Registrar empleado</a></li>
        <li><a href="RegistrarCargo.jsp">Registrar cargo</a></li>
        <li><a href="RegistrarHorario.jsp">Registrar horario</a></li>
        <li><a href="ConsultarEmpleado.jsp">Consultar empleado</a></li>
        <li><a href="cargarDatos.jsp">Cargar datos</a></li>
    </ul>
</nav>
