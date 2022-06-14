<%-- 
    Document   : sesiones
    Created on : 30/03/2022, 10:45:03 AM
    Author     : Sena
--%>

<%@page import="ModeloVO.EmpleadoVO"%>
<%@page import="ModeloVO.FuncionarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
    response.setDateHeader("Expires", 0);
%>

<%
    HttpSession buscarSesion = (HttpSession) request.getSession();
    String IdEmpleado = "", Usuario = "", NombreUsuario = "", IdFuncionario = "";
    if (buscarSesion.getAttribute("datosFuncionario") == null) {
        request.getRequestDispatcher("index.jsp").forward(request, response);

    } else {
        EmpleadoVO empVO = (EmpleadoVO) buscarSesion.getAttribute("datosEmpleado");
        EmpleadoVO empReVO = (EmpleadoVO) buscarSesion.getAttribute("datosEmpleadoRegistrado");
        FuncionarioVO funVO = (FuncionarioVO) buscarSesion.getAttribute("datosFuncionario");
        IdEmpleado = empReVO.getIdEmpleado();
        Usuario = funVO.getUsuario();
        NombreUsuario = (empVO.getNombres() + " " + empVO.getApellidos());
        IdFuncionario = funVO.getIdFuncionario();

    }

%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- icon  -->
        <link rel="icon" href="Css/recursos/Logo sadin.svg">
        <!-- plugins:css -->
        <link rel="stylesheet" href="vendors/feather/feather.css">
        <link rel="stylesheet" href="vendors/ti-icons/css/themify-icons.css">
        <link rel="stylesheet" href="vendors/css/vendor.bundle.base.css">
        <!-- endinject -->
        <!-- Plugin css for this page -->
        <link rel="stylesheet" href="vendors/datatables.net-bs4/dataTables.bootstrap4.css">
        <link rel="stylesheet" href="vendors/ti-icons/css/themify-icons.css">
        <link rel="stylesheet" type="text/css" href="js/select.dataTables.min.css">
        <!-- End plugin css for this page -->
        <!-- inject:css -->
        <link rel="stylesheet" href="Css/vertical-layout-light/style.css">
        <!-- endinject -->
    </head>

    <body>
        <div class="container-scroller">
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
                            <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" id="profileDropdown">
                                <img src="Css/recursos/userPerfil.svg" alt="profile" />
                            </a>
                            <div class="dropdown-menu dropdown-menu-right navbar-dropdown" aria-labelledby="profileDropdown">

                                <form method="post" action="Sesiones">
                                    <div>
                                        <input class="dropdown-item"  type="submit" value="Cerrar Sesión"><i class="ti-power-off text-primary"></i>
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
                                    <li class="nav-item"> <a class="nav-link" href="RegistrarEmpleado.jsp">Registrar</a></li>
                                    <li class="nav-item"> <a class="nav-link" href="ConsultarEmpleado.jsp">Consultar</a></li>
                                </ul>
                            </div>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" data-toggle="collapse" href="#form-elements" aria-expanded="false"
                               aria-controls="form-elements">
                                <i class="icon-columns menu-icon"></i>
                                <span class="menu-title">Actualización Datos</span>
                                <i class="menu-arrow"></i>
                            </a>
                            <div class="collapse" id="form-elements">
                                <ul class="nav flex-column sub-menu">
                                    <li class="nav-item"><a class="nav-link" href="ActualizarEmpleado.jsp">Actualizar Empleado</a>
                                    </li>
                                    <li class="nav-item"><a class="nav-link" href="#">Actualizar Contrato</a>
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
                                    <li class="nav-item"> <a class="nav-link" href="#">Listado</a></li>
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
                        <li class="nav-item">
                            <a class="nav-link" data-toggle="collapse" href="#error" aria-expanded="false" aria-controls="error">
                                <i class="icon-ban menu-icon"></i>
                                <span class="menu-title">Carga masiva</span>
                                <i class="menu-arrow"></i>
                            </a>
                            <div class="collapse" id="error">
                                <ul class="nav flex-column sub-menu">
                                    <li class="nav-item"> <a class="nav-link" href="cargarDatos.jsp"> Cargar empleado </a></li>
                                </ul>
                            </div>
                        </li>

                    </ul>
                </nav>
            </div>
            <!-- plugins:js -->
            <script src="vendors/js/vendor.bundle.base.js"></script>
            <!-- endinject -->
            <!-- Plugin js for this page -->
            <script src="vendors/chart.js/Chart.min.js"></script>
            <script src="vendors/datatables.net/jquery.dataTables.js"></script>
            <script src="vendors/datatables.net-bs4/dataTables.bootstrap4.js"></script>
            <script src="js/dataTables.select.min.js"></script>

            <!-- End plugin js for this page -->
            <!-- inject:js -->
            <script src="js/off-canvas.js"></script>
            <script src="js/hoverable-collapse.js"></script>
            <script src="js/template.js"></script>
            <script src="js/settings.js"></script>
            <script src="js/todolist.js"></script>
            <!-- endinject -->
            <!-- Custom js for this page-->
            <script src="js/dashboard.js"></script>
            <script src="js/Chart.roundedBarCharts.js"></script>
            <!-- End custom js for this page-->
    </body>
</html>
