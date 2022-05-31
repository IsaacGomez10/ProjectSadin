/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author casti
 */
public class FuncionarioVO {
    
    private String idFuncionario, Usuario, Password, idEmpleado, Destino, Asunto, Mensaje;
    
    public FuncionarioVO() {
    }

    public FuncionarioVO(String Usuario, String Password) {
        this.Usuario = Usuario;
        this.Password = Password;
    }

    public FuncionarioVO(String Destino, String Asunto, String Mensaje) {
        this.Destino = Destino;
        this.Asunto = Asunto;
        this.Mensaje = Mensaje;
    }

    public FuncionarioVO(String idFuncionario, String Usuario, String Password, String idEmpleado) {
        this.idFuncionario = idFuncionario;
        this.Usuario = Usuario;
        this.Password = Password;
        this.idEmpleado = idEmpleado;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
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
