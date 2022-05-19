/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author USUARIO
 */
public class CorreoVO {
    
    String CorreoEnvia,Password,Destino, Asunto, Mensaje;

    public CorreoVO() {
    }

    public CorreoVO(String Destino, String Asunto, String Mensaje) {
        this.Destino = Destino;
        this.Asunto = Asunto;
        this.Mensaje = Mensaje;
    }
    
    public CorreoVO(String CorreoEnvia, String Password, String Destino, String Asunto, String Mensaje) {
        this.CorreoEnvia = CorreoEnvia;
        this.Password = Password;
        this.Destino = Destino;
        this.Asunto = Asunto;
        this.Mensaje = Mensaje;
    }

    public String getCorreoEnvia() {
        return CorreoEnvia;
    }

    public void setCorreoEnvia(String CorreoEnvia) {
        this.CorreoEnvia = CorreoEnvia;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }
  
}
