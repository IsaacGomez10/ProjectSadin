/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloSolicitudDAO.SolicitudDAO;
import ModeloSolicitudVO.SolicitudVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author isaac
 */
@WebServlet(name = "ValidarCertificado", urlPatterns = {"/Certificacion"})
public class SolicitudControlador extends HttpServlet {

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

        String NumeroDocumento = request.getParameter("txtNumeroDocumento");

        SolicitudVO solVO = new SolicitudVO(NumeroDocumento);
        SolicitudDAO solDAO = new SolicitudDAO(solVO);

        //Recibir datos del formulario a traves de una variable 
        int opcion = Integer.parseInt(request.getParameter("opcion"));

        //Administrar las variables
        switch (opcion) {

            case 1://consultar por numero de documento
                if (solDAO.estadoEmpleado(NumeroDocumento) == 1) {

                    solVO = solDAO.SolicitarCertificado(NumeroDocumento);

                    if (solVO != null) {
                        request.setAttribute("ValidarCertificadoActivo", solVO);
                        request.getRequestDispatcher("ConsultarCertificado.jsp").forward(request, response);
                    } else {
                        request.setAttribute("MensajeError", "Este documento no existe, verifique el número de documento");
                        request.getRequestDispatcher("CertificadoSolicitud.jsp").forward(request, response);
                    }
                } else if (solDAO.estadoEmpleado(NumeroDocumento) == 0) {

                    solVO = solDAO.SolicitarCertificado(NumeroDocumento);

                    request.setAttribute("ValidarCertificadoInactivo", solVO);
                    request.getRequestDispatcher("ConsultarCertificadoInactivo.jsp").forward(request, response);
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
