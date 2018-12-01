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
public class Auto extends Vehiculo implements Runnable {

    public String numMotor;
    public int cilindraje;

    public Auto() {
    }
    

    public Auto(String numMotor, int cilindraje, String marca, String modelo, int anio, String tipoVehiculo) {
        super(marca, modelo, anio, tipoVehiculo);
        this.numMotor = numMotor;
        this.cilindraje = cilindraje;
        
    }    
    
    @Override
    public void run(){
        System.out.print(toString()+ " ");
        Multihilos datos = new Multihilos();
    
        super.datos();
    }
    
    @Override
    public synchronized String toString() {
        return "El número de motor es: " + numMotor + " y el cilindraje es: " + cilindraje;
    }
}
