/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multihilos;

/**
 *
 * @author Emilson
 */
public class Vehiculo extends Thread {

    private String marca;
    private String modelo;
    private int anio;
    public String tipoVehiculo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, String tipoVehiculo) {        
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipoVehiculo = tipoVehiculo;
    }
    
    @Override
    public void run(){
        datos();
    }
    
    public synchronized void datos(){
        System.out.println("Marca: "+marca+" Modelo: "+modelo+" año: "+anio+" tipo: "+tipoVehiculo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
        
}
