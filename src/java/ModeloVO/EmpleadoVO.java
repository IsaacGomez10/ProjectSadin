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
    private String idEmpleado, nombres, apellidos, idTipoDocumento, numeroDocumento, telefono, email, idLugarExpedicion, estado;

    public EmpleadoVO() {
    }

    public EmpleadoVO(String idEmpleado, String numeroDocumento) {
        this.idEmpleado = idEmpleado;
        this.numeroDocumento = numeroDocumento;
    }

    public EmpleadoVO(String idEmpleado, String nombres, String apellidos, String idTipoDocumento, String numeroDocumento, String telefono, String email, String idLugarExpedicion, String estado) {
        this.idEmpleado = idEmpleado;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.idTipoDocumento = idTipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.telefono = telefono;
        this.email = email;
        this.idLugarExpedicion = idLugarExpedicion;
        this.estado = estado;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(String idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdLugarExpedicion() {
        return idLugarExpedicion;
    }

    public void setIdLugarExpedicion(String idLugarExpedicion) {
        this.idLugarExpedicion = idLugarExpedicion;
    }   

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
