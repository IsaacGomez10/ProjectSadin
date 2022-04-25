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

    private String NumeroDocumento, Certificado1, Certificado2, Certificado3, Certificado4;

    public SolicitudVO() {
    }

    public SolicitudVO(String NumeroDocumento) {
        this.NumeroDocumento = NumeroDocumento;
    }
    
    public SolicitudVO(String NumeroDocumento, String Certificado1, String Certificado2, String Certificado3, String Certificado4) {
        this.NumeroDocumento = NumeroDocumento;
        this.Certificado1 = Certificado1;
        this.Certificado2 = Certificado2;
        this.Certificado3 = Certificado3;
        this.Certificado4 = Certificado4;
    }

    public String getCertificado1() {
        return Certificado1;
    }

    public void setCertificado1(String Certificado1) {
        this.Certificado1 = Certificado1;
    }

    public String getCertificado2() {
        return Certificado2;
    }

    public void setCertificado2(String Certificado2) {
        this.Certificado2 = Certificado2;
    }

    public String getCertificado3() {
        return Certificado3;
    }

    public void setCertificado3(String Certificado3) {
        this.Certificado3 = Certificado3;
    }

    public String getCertificado4() {
        return Certificado4;
    }

    public void setCertificado4(String Certificado4) {
        this.Certificado4 = Certificado4;
    }

 

    public String getNumeroDocumento() {
        return NumeroDocumento;
    }

    public void setNumeroDocumento(String NumeroDocumento) {
        this.NumeroDocumento = NumeroDocumento;
    }

}
