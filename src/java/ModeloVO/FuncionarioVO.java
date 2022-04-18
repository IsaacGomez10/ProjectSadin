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
    
    private String idFuncionario, usuario, password, idEmpleado;
    
    public FuncionarioVO() {
    }

    public FuncionarioVO(String idFuncionario, String usuario, String password, String idEmpleado) {
        this.idFuncionario = idFuncionario;
        this.usuario = usuario;
        this.password = password;
        this.idEmpleado = idEmpleado;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }    
}
