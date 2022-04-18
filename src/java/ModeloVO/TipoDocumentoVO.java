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
public class TipoDocumentoVO {
    
    private String IdTipoDocumento, TipoDocumento;

    public TipoDocumentoVO() {
    }

    public TipoDocumentoVO(String IdTipoDocumento, String TipoDocumento) {
        this.IdTipoDocumento = IdTipoDocumento;
        this.TipoDocumento = TipoDocumento;
    }

    public String getIdTipoDocumento() {
        return IdTipoDocumento;
    }

    public void setIdTipoDocumento(String IdTipoDocumento) {
        this.IdTipoDocumento = IdTipoDocumento;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    
}
