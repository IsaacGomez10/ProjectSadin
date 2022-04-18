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
public class HorarioVO {
    
    private String idHorario, horarioLaboral;   
    
    public HorarioVO() {
    }
    
    public HorarioVO(String idHorario, String horarioLaboral) {
        this.idHorario = idHorario;
        this.horarioLaboral = horarioLaboral;
    }

    public String getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(String idHorario) {
        this.idHorario = idHorario;
    }

    public String getHorarioLaboral() {
        return horarioLaboral;
    }

    public void setHorarioLaboral(String horarioLaboral) {
        this.horarioLaboral = horarioLaboral;
    }
    
}
