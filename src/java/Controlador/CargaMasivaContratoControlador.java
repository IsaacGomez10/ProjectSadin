/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.AdministrarArchivos;
import ModeloDAO.ContratoDAO;
import ModeloVO.ContratoVO;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Damian
 */
@MultipartConfig
@WebServlet(name = "CargaMasivaContratoControlador", urlPatterns = {"/CargaContrato"})
public class CargaMasivaContratoControlador extends HttpServlet {

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
        String IdContrato = request.getParameter("txtIdContrato");
        String IdEmpleado = request.getParameter("txtIdEmpleado");
        String FechaContratacion = request.getParameter("txtFechaContratacion");
        String FechaFinalizacion = request.getParameter("txtFechaFinalizacion");
        String Salario = request.getParameter("txtSalario");
        String IdCargo = request.getParameter("txtIdCargo");
        String IdDependencia = request.getParameter("txtDependencia");
        String IdTipoContrato = request.getParameter("txtIdTipoContrato");
        String IdJornada = request.getParameter("txtIdJornada");
        String IdHorario = request.getParameter("txtHorario");

        Part archivocsv = request.getPart("archivocsv");

        //2. Quien tiene los datos de forma segura? VO
        ContratoVO conVO = new ContratoVO(IdContrato, IdEmpleado, FechaContratacion, FechaFinalizacion, Salario, IdCargo, IdDependencia, IdTipoContrato, IdJornada, IdHorario);
        //3. Quien hace las operaciones? DAO
        ContratoDAO conDAO = new ContratoDAO(conVO);

        int opcion = Integer.parseInt(request.getParameter("opcion"));

        
        switch (opcion) {

            case 1://Guardar CSV
                AdministrarArchivos adminFiles = new AdministrarArchivos();
                String rutaAbsoluta = adminFiles.guardarArchivo(archivocsv, adminFiles.validarRuta());
                try {
                    if (conDAO.cargarContrato(rutaAbsoluta) == true) {
                        request.setAttribute("MensajeExito", "Los datos se han cargado correctamente");
                        request.getRequestDispatcher("cargarDatos.jsp").forward(request, response);
                    } else {
                        request.setAttribute("MensajeError", "Error");
                        request.getRequestDispatcher("cargaContrato.jsp").forward(request, response);
                    }

                }catch (SQLException e) {
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
