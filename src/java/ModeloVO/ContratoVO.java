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

    private String IdContrato, FechaContratacion, FechaFinalizacion, Salario, IdHorario, IdCargo, IdTipoContrato, IdEmpleado, IdJornada, IdDependencia;

    public ContratoVO() {
    }

    public ContratoVO(String IdContrato, String FechaContratacion, String FechaFinalizacion, String Salario, String IdHorario, String IdCargo, String IdTipoContrato, String IdEmpleado, String IdJornada, String IdDependencia) {
        this.IdContrato = IdContrato;
        this.FechaContratacion = FechaContratacion;
        this.FechaFinalizacion = FechaFinalizacion;
        this.Salario = Salario;
        this.IdHorario = IdHorario;
        this.IdCargo = IdCargo;
        this.IdTipoContrato = IdTipoContrato;
        this.IdEmpleado = IdEmpleado;
        this.IdJornada = IdJornada;
        this.IdDependencia = IdDependencia;
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
