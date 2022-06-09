/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.EmpleadoDAO;
import ModeloDAO.FuncionarioDAO;
import ModeloVO.EmpleadoVO;
import ModeloVO.FuncionarioVO;
import Util.Main;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sena
 */
@WebServlet(name = "FuncionarioControlador", urlPatterns = {"/Funcionario"})
public class FuncionarioControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String Destino = "", Asunto = "", Mensaje = "";

        String IdFuncionario = request.getParameter("txtId_Funcionario");
        String Usuario = request.getParameter("txtUsuario");
        String Password = request.getParameter("txtPassword");
        String Password1 = request.getParameter("txtPassword1");
        String PasswordNueva = request.getParameter("txtPasswordNueva");
        String IdEmpleado = request.getParameter("txtIdEmpleado");

        int opcion = Integer.parseInt(request.getParameter("opcion"));

        FuncionarioVO funVO = new FuncionarioVO(IdFuncionario, Usuario, Password, IdEmpleado);
        FuncionarioDAO funDAO = new FuncionarioDAO(funVO);

        EmpleadoVO empVO = new EmpleadoVO(IdEmpleado, Usuario);
        EmpleadoDAO empDAO = new EmpleadoDAO(empVO);

        FuncionarioVO funCorreoVO = new FuncionarioVO(Destino, Asunto, Mensaje);
        FuncionarioDAO funCorreoDAO = new FuncionarioDAO(funCorreoVO);

        switch (opcion) {
            case 1: //Enviar contraseña provisional
                if (funDAO.funcionarioExistente(Usuario) == 0) {
                    empVO = empDAO.consultarEmpleados(Usuario);
                    if (empVO != null) {
                        String PasswordEmp = funDAO.GenerarContraseña();
                        Destino = empVO.getEmail();
                        Asunto = "Contraseña Provisional";
                        Mensaje = "Esta es la contraseña provisional para tu inicio de sesion en Sadin: \n\n" + PasswordEmp + "\n\n" + " Recuerde que debes cambiarla apenas entres";

                        funCorreoVO = new FuncionarioVO(Destino, Asunto, Mensaje);
                        funCorreoDAO = new FuncionarioDAO(funCorreoVO);

                        if (funCorreoDAO.EnviarCorreo()) {

                            Usuario = empVO.getNumeroDocumento();
                            Password = PasswordEmp;
                            IdEmpleado = empVO.getIdEmpleado();

                            funVO = new FuncionarioVO(IdFuncionario, Usuario, Password, IdEmpleado);
                            funDAO = new FuncionarioDAO(funVO);
                            funDAO.agregarRegistro();

                            if (funDAO.estadoEmpleado(Usuario) == 1) {
                                request.setAttribute("MensajeExito", "Se ha enviado una contraseña provisional a su correo");
                                request.getRequestDispatcher("index.jsp").forward(request, response);
                            } else {
                                request.setAttribute("MensajeError", "Este empleado no se encuentra activo");
                                request.getRequestDispatcher("registrarFuncionario.jsp").forward(request, response);
                            }
                        } else {
                            request.setAttribute("MensajeError", "Se ha presentado un error. Intentelo mas tarde!");
                            request.getRequestDispatcher("registrarFuncionario.jsp").forward(request, response);
                        }

                    } else {
                        request.setAttribute("MensajeError", "El empleado No existe");
                        request.getRequestDispatcher("registrarFuncionario.jsp").forward(request, response);
                    }
                } else {
                    request.setAttribute("MensajeError", "Este usuario ya existe.");
                    request.getRequestDispatcher("registrarFuncionario.jsp").forward(request, response);
                }
                break;
            case 2: //Actualizar contraseña
                funVO = funDAO.iniciarSesion(Usuario, Password);

                if (funVO != null) {
                    if (PasswordNueva.equals(Password1)) {

                        funVO = new FuncionarioVO(Usuario, PasswordNueva);
                        funDAO = new FuncionarioDAO(funVO);
                        funDAO.actualizarRegistro();

                        request.setAttribute("MensajeExito", "La contraseña se ha actualizado correctamente!");
                        request.getRequestDispatcher("menu.jsp").forward(request, response);

                    } else {
                        request.setAttribute("MensajeError", "Las contraseñas no coinciden!");
                        request.getRequestDispatcher("cambiarContraseña.jsp").forward(request, response);
                    }
                } else {
                    request.setAttribute("MensajeError", "La contraseña actual es incorrecta!");
                    request.getRequestDispatcher("cambiarContraseña.jsp").forward(request, response);
                }

                break;

            case 3: //Iniciar sesión

                funVO = funDAO.iniciarSesion(Usuario, (Password));
                if (funVO != null) {

                    empVO = empDAO.consultarEmpleados(Usuario);

                    HttpSession miSesion = request.getSession(true);

                    String Id = funVO.getIdFuncionario();
                    String Empleado = funVO.getIdEmpleado();

                    funVO = new FuncionarioVO(Id, Usuario, Password, Empleado);
                    miSesion.setAttribute("datosEmpleado", empVO);
                    miSesion.setAttribute("datosEmpleadoRegistrado", empVO);
                    miSesion.setAttribute("datosFuncionario", funVO);

                    request.getRequestDispatcher("menu.jsp").forward(request, response);

                } else {
                    request.setAttribute("MensajeError", "Corregir Datos");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
                break;
            case 4://Olvidaste la contraseña
                empVO = empDAO.consultarEmpleados(Usuario);

                if (funDAO.estadoEmpleado(Usuario) == 1) {

                    if (empVO != null) {
                        String PasswordEmp = funDAO.GenerarContraseña();
                        Destino = empVO.getEmail();
                        Asunto = "Recuperacion de Contraseña";
                        Mensaje = "Esta es la nueva contraseña para el inicio de sesion en Sadin: \n\n" + PasswordEmp + "\n\n" + " Recuerda que debes cambiarla apenas entres";

                        funCorreoVO = new FuncionarioVO(Destino, Asunto, Mensaje);
                        funCorreoDAO = new FuncionarioDAO(funCorreoVO);
                        if (funCorreoDAO.EnviarCorreo()) {

                            Usuario = empVO.getNumeroDocumento();
                            Password = PasswordEmp;

                            funVO = new FuncionarioVO(Usuario, Password);
                            funDAO = new FuncionarioDAO(funVO);
                            funDAO.actualizarRegistro();

                            request.setAttribute("MensajeExito", "Se ha enviado una contraseña provisional a su correo");
                            request.getRequestDispatcher("index.jsp").forward(request, response);

                        } else {
                            request.setAttribute("MensajeError", "Se ha presentado un error. Intentelo mas tarde!");
                            request.getRequestDispatcher("registrarFuncionario.jsp").forward(request, response);
                        }

                    } else {
                        request.setAttribute("MensajeError", "El empleado No existe");
                        request.getRequestDispatcher("registrarFuncionario.jsp").forward(request, response);
                    }
                } else {
                    request.setAttribute("MensajeError", "Este empleado no se encuentra activo, verifique por favor.");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
                break;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
