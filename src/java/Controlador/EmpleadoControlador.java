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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

        EmpleadoVO EmpVO = new EmpleadoVO(IdEmpleado, Nombres, Apellidos, IdTipoDocumento, NumeroDocumento, Telefono, Email, IdLugarExpedicion);
        EmpleadoDAO EmpDAO = new EmpleadoDAO(EmpVO);

        //Recibir datos del formulario a traves de una variable 
        int opcion = Integer.parseInt(request.getParameter("opcion"));

        //Administrar las variables
        switch (opcion) {
            case 1: //Agregar registro
                if (EmpDAO.agregarRegistro()) {
                    request.setAttribute("MensajeExito", "El empleado se registro correctamente");
                    request.getRequestDispatcher("RegistrarContrato.jsp").forward(request, response);
                } else {
                    request.setAttribute("MensajeError", "El empleado no se registro correctamente");
                    request.getRequestDispatcher("RegistrarEmpleado.jsp").forward(request, response);
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
