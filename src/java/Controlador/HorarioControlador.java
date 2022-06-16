/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.HorarioDAO;
import ModeloVO.HorarioVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author casti
 */
@WebServlet(name = "HorarioControlador", urlPatterns = {"/Horario"})
public class HorarioControlador extends HttpServlet {

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
        
        //1. Recibir datos de la vista
        String idHorario = request.getParameter("txtIdHorario");
        String horarioLaboral = request.getParameter("txtHorarioLaboral");

        //2. Quien tiene los datos de forma segura? VO
        HorarioVO horarioVO = new HorarioVO(idHorario, horarioLaboral);

        //3. Quien hace las operaciones? DAO
        HorarioDAO horarioDAO = new HorarioDAO(horarioVO);
        
        int opcion = Integer.parseInt(request.getParameter("opcion"));

        

        //4. Administrar operaciones del modulo
        switch (opcion) {
            case 1: //Agregar registro
                if (horarioDAO.agregarRegistro()) {
                    request.setAttribute("MensajeExito", "El horario se registro correctamente");
                } else {
                    request.setAttribute("MensajeError", "El horario NO se registro correctamente");
                }
                request.getRequestDispatcher("RegistrarHorario.jsp").forward(request, response);
                break;
            case 2: //Actualizar registro
                if (horarioDAO.actualizarRegistro()) {
                    request.setAttribute("MensajeExito", "El horario se actualizó correctamente!");
                } else {
                    request.setAttribute("MensajeError", "El horario NO se actualiazó correctamente");
                }
                request.getRequestDispatcher("actualizarHorario.jsp").forward(request, response);
                break;
            case 3: //Eliminar registro
                if (horarioDAO.eliminarRegistro()) {
                    request.setAttribute("MensajeExito", "El horario se eliminó correctamente!");
                } else {
                    request.setAttribute("MensajeError", "El horario NO se eliminó correctamente");
                }
                request.getRequestDispatcher("eliminarHorario.jsp").forward(request, response);
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
