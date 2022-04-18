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
public class LugarExpedicionVO {
    
    private String Id_lugarExpedicion, Ciudad;

    public LugarExpedicionVO() {
    }

    public LugarExpedicionVO(String Id_lugarExpedicion, String Ciudad) {
        this.Id_lugarExpedicion = Id_lugarExpedicion;
        this.Ciudad = Ciudad;
    }

    public String getId_lugarExpedicion() {
        return Id_lugarExpedicion;
    }

    public void setId_lugarExpedicion(String Id_lugarExpedicion) {
        this.Id_lugarExpedicion = Id_lugarExpedicion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    
}
