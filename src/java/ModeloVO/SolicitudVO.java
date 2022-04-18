
package ModeloVO;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
@ManagedBean
@RequestScoped

/**
 *
 * @author isaac
 */
public class SolicitudVO {
    
    private String IdSolicitud,FechaSolicitud,Destinatario, IdEmpleado;

    public SolicitudVO() {
    }

    public SolicitudVO(String IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public SolicitudVO(String Fecha_Solicitud,String Destinatario,String IdEmpleado) {
        this.FechaSolicitud = Fecha_Solicitud;
        this.Destinatario = Destinatario;
        this.IdEmpleado = IdEmpleado;
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(String IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }


    public String getIdSolicitud() {
        return IdSolicitud;
    }

    public void setIdSolicitud(String IdSolicitud) {
        this.IdSolicitud = IdSolicitud;
    }

    
    public String getFechaSolicitud() {
        return FechaSolicitud;
    }

    public void setFechaSolicitud(String FechaSolicitud) {
        this.FechaSolicitud = FechaSolicitud;
    }

    public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String Destinatario) {
        this.Destinatario = Destinatario;
    }
    
    
    
}
