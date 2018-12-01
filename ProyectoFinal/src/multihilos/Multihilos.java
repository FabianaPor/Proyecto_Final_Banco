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
public class Multihilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ////Hilos con herencia de clase THREAD
        Vehiculo oV = new Vehiculo("Toyota", "Corolla", 2018, "Terrestre");
        Vehiculo oV1 = new Vehiculo("Nissan", "Frontier", 2000, "Terrestre");
        Vehiculo oV2 = new Vehiculo("Mitsubishi", "Lancer", 2009, "Terrestre");
        Vehiculo oV3 = new Vehiculo("Honda", "Fit Sport", 2010, "Terrestre");
        oV.start();
        oV1.start();
        oV2.start();
        oV3.start();

        ////Hilos con implementación de interface RUNNABLE
        Auto oA = new Auto("1ZZ", 1500, "IZUZU", "D-MAX", 2019, "TERRESTRE");
        Auto oA1 = new Auto("D17", 1600, "FORD", "RANGER", 2012, "TERRESTRE");
        Auto oA2 = new Auto("E5A", 1700, "KIA", "SORENTO", 2013, "TERRESTRE");
        Thread hilo = new Thread(oA);
        Thread hilo1 = new Thread(oA1);
        Thread hilo2 = new Thread(oA2);
        try {
            hilo.start();
            hilo.join();
            hilo1.start();
            hilo1.join();            
            hilo2.start();
        } catch (InterruptedException e) {
        }
    }

}
