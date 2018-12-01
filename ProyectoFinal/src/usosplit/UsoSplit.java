/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usosplit;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author UNAH
 */
public class UsoSplit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*La cadena se guarda con el formato 
        nombre, direccion, genero, telefono, fecha nacimiento
        que son los datos generales de una persona, y cada
        valor esta separado por una coma (,)
         */
        String cadena = "Deniset,Los Pinitos,Femenino,99887766,04-02-1980";
        String[] arregloDatos = new String[5];
        System.out.println("Los valores del arreglo, antes del"
                + " split son:");
        for (int i = 0; i < arregloDatos.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            System.out.println(arregloDatos[i]);
        }

        System.out.println();
        arregloDatos = cadena.split(",");
        System.out.println("Los valores del arreglo, despues del"
                + " split son:");
        for (int i = 0; i < arregloDatos.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            System.out.println(arregloDatos[i]);
        }
        

        System.out.println();
        ArrayList<String> arreglo;
        arreglo = new ArrayList<String>(Arrays.asList(cadena.split(",")));
        System.out.println("Los valores del array list son:");
        for (int i = 0; i < arreglo.size(); i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            System.out.println(arreglo.get(i));
        }
    }

}
