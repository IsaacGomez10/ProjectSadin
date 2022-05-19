/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author Damian
 */
public class EmpleadoVO {
    
    //Definimos las variables
    
    private String IdEmpleado, Nombres, Apellidos, IdTipoDocumento, NumeroDocumento,Telefono, Email, IdLugarExpedicion;

    public EmpleadoVO() {
    }

    public EmpleadoVO(String IdEmpleado, String NumeroDocumento) {
        this.IdEmpleado = IdEmpleado;
        this.NumeroDocumento = NumeroDocumento;
    }
    
    public EmpleadoVO(String IdEmpleado, String Nombres, String Apellidos, String IdTipoDocumento, String NumeroDocumento, String Telefono, String Email, String IdLugarExpedicion) {
        this.IdEmpleado = IdEmpleado;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.IdTipoDocumento = IdTipoDocumento;
        this.NumeroDocumento = NumeroDocumento;
        this.Telefono = Telefono;
        this.Email = Email;
        this.IdLugarExpedicion = IdLugarExpedicion;
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(String IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getIdTipoDocumento() {
        return IdTipoDocumento;
    }

    public void setIdTipoDocumento(String IdTipoDocumento) {
        this.IdTipoDocumento = IdTipoDocumento;
    }

    public String getNumeroDocumento() {
        return NumeroDocumento;
    }

    public void setNumeroDocumento(String NumeroDocumento) {
        this.NumeroDocumento = NumeroDocumento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getIdLugarExpedicion() {
        return IdLugarExpedicion;
    }

    public void setIdLugarExpedicion(String IdLugarExpedicion) {
        this.IdLugarExpedicion = IdLugarExpedicion;
    }

    
}
