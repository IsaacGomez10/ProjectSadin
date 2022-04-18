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
public class JornadaVO {
    
    private String IdJornada, Jornada;

    public JornadaVO() {
    }

    public JornadaVO(String IdJornada, String Jornada) {
        this.IdJornada = IdJornada;
        this.Jornada = Jornada;
    }

    public String getIdJornada() {
        return IdJornada;
    }

    public void setIdJornada(String IdJornada) {
        this.IdJornada = IdJornada;
    }

    public String getJornada() {
        return Jornada;
    }

    public void setJornada(String Jornada) {
        this.Jornada = Jornada;
    }
    
    
}
