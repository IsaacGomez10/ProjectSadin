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
public class ContratoVO {

    private String IdContrato,IdEmpleado,FechaContratacion,FechaFinalizacion,Salario,IdCargo,IdDependencia,IdTipoContrato,IdJornada,IdHorario;

    public ContratoVO() {
    }

    public ContratoVO(String IdContrato, String IdEmpleado, String FechaContratacion, String FechaFinalizacion, String Salario, String IdCargo, String IdDependencia, String IdTipoContrato, String IdJornada, String IdHorario) {
        this.IdContrato = IdContrato;
        this.IdEmpleado = IdEmpleado;
        this.FechaContratacion = FechaContratacion;
        this.FechaFinalizacion = FechaFinalizacion;
        this.Salario = Salario;
        this.IdCargo = IdCargo;
        this.IdDependencia = IdDependencia;
        this.IdTipoContrato = IdTipoContrato;
        this.IdJornada = IdJornada;
        this.IdHorario = IdHorario;
    }

    

    public String getIdDependencia() {
        return IdDependencia;
    }

    public void setIdDependencia(String IdDependencia) {
        this.IdDependencia = IdDependencia;
    }

    public String getIdContrato() {
        return IdContrato;
    }

    public void setIdContrato(String IdContrato) {
        this.IdContrato = IdContrato;
    }

    public String getFechaContratacion() {
        return FechaContratacion;
    }

    public void setFechaContratacion(String FechaContratacion) {
        this.FechaContratacion = FechaContratacion;
    }

    public String getFechaFinalizacion() {
        return FechaFinalizacion;
    }

    public void setFechaFinalizacion(String FechaFinalizacion) {
        this.FechaFinalizacion = FechaFinalizacion;
    }

    public String getSalario() {
        return Salario;
    }

    public void setSalario(String Salario) {
        this.Salario = Salario;
    }

    public String getIdHorario() {
        return IdHorario;
    }

    public void setIdHorario(String IdHorario) {
        this.IdHorario = IdHorario;
    }

    public String getIdCargo() {
        return IdCargo;
    }

    public void setIdCargo(String IdCargo) {
        this.IdCargo = IdCargo;
    }

    public String getIdTipoContrato() {
        return IdTipoContrato;
    }

    public void setIdTipoContrato(String IdTipoContrato) {
        this.IdTipoContrato = IdTipoContrato;
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(String IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getIdJornada() {
        return IdJornada;
    }

    public void setIdJornada(String IdJornada) {
        this.IdJornada = IdJornada;
    }

}
