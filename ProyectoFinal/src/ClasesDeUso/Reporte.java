/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDeUso;

import java.util.Date;

/**
 *
 * @author Magally Portillo
 */
public class Reporte {
    String operacion;
    String tiempo;
    String empleado;

    @Override
    public String toString() {
        return "Reporte{" + "operacion=" + operacion + ", tiempo=" + tiempo + ", empleado=" + empleado + '}';
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public Reporte(String operacion, String tiempo, String empleado) {
        this.operacion = operacion;
        this.tiempo = tiempo;
        this.empleado = empleado;
    }

    }
