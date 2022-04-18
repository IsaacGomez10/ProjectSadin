/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author Sena
 */
public class CargoVO {
    
    private String IdCargo, NombreCargo, DescripcionCargo,Dependencia;

    public CargoVO() {
    }

    public CargoVO(String IdCargo, String NombreCargo) {
        this.IdCargo = IdCargo;
        this.NombreCargo = NombreCargo;
    }

    public CargoVO(String IdCargo, String NombreCargo, String DescripcionCargo, String Dependencia) {
        this.IdCargo = IdCargo;
        this.NombreCargo = NombreCargo;
        this.DescripcionCargo = DescripcionCargo;
        this.Dependencia = Dependencia;
    }

    public String getIdCargo() {
        return IdCargo;
    }

    public void setIdCargo(String IdCargo) {
        this.IdCargo = IdCargo;
    }

    public String getNombreCargo() {
        return NombreCargo;
    }

    public void setNombreCargo(String NombreCargo) {
        this.NombreCargo = NombreCargo;
    }

    public String getDescripcionCargo() {
        return DescripcionCargo;
    }

    public void setDescripcionCargo(String DescripcionCargo) {
        this.DescripcionCargo = DescripcionCargo;
    }

    public String getDependencia() {
        return Dependencia;
    }

    public void setDependencia(String Dependencia) {
        this.Dependencia = Dependencia;
    }

    
    
}
