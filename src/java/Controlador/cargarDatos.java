package Controlador;

import ModeloDAO.AdministrarArchivos;
import ModeloDAO.EmpleadoDAO;
import ModeloVO.EmpleadoVO;
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
@WebServlet(name = "CargarDatosControlador", urlPatterns = {"/Cargar"})
public class cargarDatos extends HttpServlet {

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

        //Recibir csv
        Part archivocsv = request.getPart("archivocsv");

        EmpleadoVO empVO = new EmpleadoVO(IdEmpleado, Nombres, Apellidos, IdTipoDocumento, NumeroDocumento, Telefono, Email, IdLugarExpedicion, Estado);
        EmpleadoDAO empDAO = new EmpleadoDAO(empVO);

        //Recibir datos del formulario a traves de una variable 
        int opcion = Integer.parseInt(request.getParameter("opcion"));

        switch (opcion) {

            case 1://Guardar CSV

                AdministrarArchivos adminFiles = new AdministrarArchivos();
                String rutaAbsoluta = adminFiles.guardarArchivo(archivocsv, adminFiles.validarRuta());

                try {

                    if (empDAO.cargarUsuarios(rutaAbsoluta) == true) {

                        request.setAttribute("MensajeExito", "La carga se hizo correactamente");
                        request.getRequestDispatcher("cargarDatos.jsp").forward(request, response);
                    } else {
                        request.setAttribute("MensajeError", "Error");
                        request.getRequestDispatcher("cargarDatos.jsp").forward(request, response);
                    }

                } catch (SQLException e) {
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
