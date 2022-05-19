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
    
    private String idFuncionario, Usuario, Password, idEmpleado;
    
    public FuncionarioVO() {
    }

    public FuncionarioVO(String Usuario, String Password) {
        this.Usuario = Usuario;
        this.Password = Password;
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

   
}
