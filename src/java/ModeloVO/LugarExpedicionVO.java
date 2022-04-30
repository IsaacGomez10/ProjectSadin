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
    
    private String IdLugarExpedicion, Ciudad;

    public LugarExpedicionVO() {
    }

    public LugarExpedicionVO(String IdLugarExpedicion, String Ciudad) {
        this.IdLugarExpedicion = IdLugarExpedicion;
        this.Ciudad = Ciudad;
    }

    public String getIdLugarExpedicion() {
        return IdLugarExpedicion;
    }

    public void setIdLugarExpedicion(String IdLugarExpedicion) {
        this.IdLugarExpedicion = IdLugarExpedicion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    
    
    
}
