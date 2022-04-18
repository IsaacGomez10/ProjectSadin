/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.CargoDAO;
import ModeloVO.CargoVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sena
 */
@WebServlet(name = "CargoControlador", urlPatterns = {"/Cargo"})
public class CargoControlador extends HttpServlet {

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
        
        String IdCargo = request.getParameter("txtIdCargo");
        String NombreCargo = request.getParameter("txtNombreCargo");
        String DescripcionCargo = request.getParameter("txtDescripcionCargo");
        String Dependencia = request.getParameter("txtDependencia");
        
        CargoVO carVO = new CargoVO(IdCargo, NombreCargo, DescripcionCargo, Dependencia);
        CargoDAO carDAO = new CargoDAO(carVO);
        
        int opcion = Integer.parseInt(request.getParameter("opcion"));
        
        
        switch(opcion){
            case 1: //Agregar registro
                if(carDAO.agregarRegistro()){
                    request.setAttribute("mensajeExito", "El cargo se registró correctamente!");
                }else{
                    request.setAttribute("mensajeError", "El cargo No se registró correctamente");
                }
                request.getRequestDispatcher("registrarCargo.jsp").forward(request, response);
                break;
            case 2: //Actualizar registro
                if(carDAO.actualizarRegistro()){
                    request.setAttribute("mensajeExito", "El cargo se actualizó correctamente!");
                }else{
                    request.setAttribute("mensajeError", "El cargo No se actualizó correctamente");
                }
                request.getRequestDispatcher("actualizarCargo.jsp").forward(request, response);
                break;
            case 3: //Eliminar registro
                if(carDAO.eliminarRegistro()){
                    request.setAttribute("mensajeExito", "El cargo se eliminó correctamente!");
                }else{
                    request.setAttribute("mensajeError", "El cargo No se eliminó correctamente");
                }
                request.getRequestDispatcher("eliminarCargo.jsp").forward(request, response);
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
