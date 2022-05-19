/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloSolicitudVO;

/**
 *
 * @author isaac
 */
public class SolicitudVO {

    private String NumeroDocumento;

    public SolicitudVO() {
    }

    public SolicitudVO(String NumeroDocumento) {
        this.NumeroDocumento = NumeroDocumento;
    }

    public String getNumeroDocumento() {
        return NumeroDocumento;
    }

    public void setNumeroDocumento(String NumeroDocumento) {
        this.NumeroDocumento = NumeroDocumento;
    }

}
