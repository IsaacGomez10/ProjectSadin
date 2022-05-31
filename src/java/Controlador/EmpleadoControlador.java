/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.EmpleadoDAO;
import ModeloVO.EmpleadoVO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Damian
 */
@WebServlet(name = "EmpleadoControlador", urlPatterns = {"/Empleado"})
public class EmpleadoControlador extends HttpServlet {

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

        String IdEmpleado = request.getParameter("txtIdEmpleado");
        String Nombres = request.getParameter("txtNombres");
        String Apellidos = request.getParameter("txtApellidos");
        String IdTipoDocumento = request.getParameter("txtIdTipoDocumento");
        String NumeroDocumento = request.getParameter("txtNumeroDocumento");
        String Telefono = request.getParameter("txtTelefono");
        String Email = request.getParameter("txtEmail");
        String IdLugarExpedicion = request.getParameter("txtIdLugarExpedicion");
        String Estado = request.getParameter("txtEstado");

        EmpleadoVO empVO = new EmpleadoVO(IdEmpleado, Nombres, Apellidos, IdTipoDocumento, NumeroDocumento, Telefono, Email, IdLugarExpedicion,Estado);
        EmpleadoDAO empDAO = new EmpleadoDAO(empVO);

        //Recibir datos del formulario a traves de una variable 
        int opcion = Integer.parseInt(request.getParameter("opcion"));

        //Administrar las variables
        switch (opcion) {
            case 1: //Agregar registro y verifica datos en la bae de dato antes de guardar
                //Verificar número de documento en la base de datos
                if (empDAO.documentoExistente(NumeroDocumento) == 0) {
                    //Verificar número de teléfono en la base de datos
                    if (empDAO.telefonoExistente(Telefono) == 0) {
                        //Verificar correo electronico en la base de datos
                        if (empDAO.emailExistente(Email) == 0) {
                            if (empDAO.agregarRegistro()) {

                                empVO = empDAO.consultarEmpleados(NumeroDocumento);
                                HttpSession miSesion = request.getSession(true);
                                String Id = empVO.getIdEmpleado();
                                String Documento = empVO.getNumeroDocumento();

                                empVO = new EmpleadoVO(Id, Documento);

                                miSesion.setAttribute("datosEmpleadoRegistrado", empVO);
                                request.getRequestDispatcher("RegistrarContrato.jsp").forward(request, response);
                            } else {
                                request.setAttribute("MensajeError", "El empleado no pudo ser registrado, verifique datos");
                                request.getRequestDispatcher("RegistrarEmpleado.jsp").forward(request, response);
                            }
                        } else {
                            request.setAttribute("MensajeError", "El correo electrónico ya existe, verifique el dato");
                            request.getRequestDispatcher("RegistrarEmpleado.jsp").forward(request, response);
                        }
                    } else {
                        request.setAttribute("MensajeError", "El número de teléfono ya existe, verifique el dato");
                        request.getRequestDispatcher("RegistrarEmpleado.jsp").forward(request, response);
                    }
                } else {
                    request.setAttribute("MensajeError", "El número de documento ya existe, verifique el dato");
                    request.getRequestDispatcher("RegistrarEmpleado.jsp").forward(request, response);
                }

                break;

            case 2://Metodo de actualizar registro
                if (empDAO.actualizarRegistro()) {
                    request.setAttribute("MensajeExito", "El Empleado se actualizo correctamente");
                    request.getRequestDispatcher("ActualizarEmpleado.jsp").forward(request, response);
                } else {
                    request.setAttribute("MensajeError", "El Empleado no se actualizo correctamente");
                    request.getRequestDispatcher("ConsultarEmpleado.jsp").forward(request, response);
                }

                break;
            case 3: //consultar por numero de documento
                empVO = empDAO.consultarEmpleados(NumeroDocumento);
                if (empVO != null) {
                    request.setAttribute("EmpleadoConsultado", empVO);
                    request.getRequestDispatcher("ActualizarEmpleado.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeError", "El empleado No existe, verifique el documento");
                    request.getRequestDispatcher("ConsultarEmpleado.jsp").forward(request, response);
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
