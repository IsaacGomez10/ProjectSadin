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
public class TipoContratoVO {
    
    private String IdTipoContrato, Contrato;

    public TipoContratoVO() {
    }

    public TipoContratoVO(String IdTipoContrato, String Contrato) {
        this.IdTipoContrato = IdTipoContrato;
        this.Contrato = Contrato;
    }

    public String getIdTipoContrato() {
        return IdTipoContrato;
    }

    public void setIdTipoContrato(String IdTipoContrato) {
        this.IdTipoContrato = IdTipoContrato;
    }

    public String getContrato() {
        return Contrato;
    }

    public void setContrato(String Contrato) {
        this.Contrato = Contrato;
    }

    
}
