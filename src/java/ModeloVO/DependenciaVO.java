/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author isaac
 */
public class DependenciaVO {
        
    private String IdDependencia,Dependencia;

    public DependenciaVO() {
    }

    public DependenciaVO(String IdDependencia, String Dependencia) {
        this.IdDependencia = IdDependencia;
        this.Dependencia = Dependencia;
    }

    public String getIdDependencia() {
        return IdDependencia;
    }

    public void setIdDependencia(String IdDependencia) {
        this.IdDependencia = IdDependencia;
    }

    public String getDependencia() {
        return Dependencia;
    }

    public void setDependencia(String Dependencia) {
        this.Dependencia = Dependencia;
    }
    
    
}
