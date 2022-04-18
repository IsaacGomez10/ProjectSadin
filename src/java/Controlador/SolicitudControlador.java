package Controlador;

import ModeloDAO.EmpleadoDAO;
import ModeloDAO.SolicitudDAO;
import ModeloVO.EmpleadoVO;
import ModeloVO.SolicitudVO;
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
@WebServlet(name = "SolicitudControlador", urlPatterns = {"/Certificado"})
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

        String FechaSolicitud = request.getParameter("txtFechaSolicitud");
        String Destinatario = request.getParameter("txtDestinatario");
        String IdEmpleado = request.getParameter("txtIdEmpleado");

        SolicitudVO solVO = new SolicitudVO(FechaSolicitud, Destinatario, IdEmpleado);
        SolicitudDAO solDAO = new SolicitudDAO(solVO);
        
        int opcion = Integer.parseInt(request.getParameter("opcion"));


        switch (opcion) {
            case 1: //Agregar registro
                if (solDAO.agregarRegistro()) {
                    request.setAttribute("mensajeExito", "El destinatario se guardo correctamente!");
                    request.getRequestDispatcher("ConfirmarCertificado.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeError", "Número de empleado desconocido, verifique sus datos");
                    request.getRequestDispatcher("SolicitarCertificado.jsp").forward(request, response);
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
