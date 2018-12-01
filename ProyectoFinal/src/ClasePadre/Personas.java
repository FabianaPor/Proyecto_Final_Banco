/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasePadre;

/**
 *
 * @author Magally Portillo
 */
public class Personas {
    private String Nombre;
    private String FechaDeNacimiento;
    private String ID;
    private char genero;
    private String Residencia;


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getResidencia() {
        return Residencia;
    }

    public void setResidencia(String Residencia) {
        this.Residencia = Residencia;
    }
        
}
