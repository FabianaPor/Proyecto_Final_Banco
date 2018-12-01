/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDeUso;

import java.io.BufferedReader;
import java.util.Scanner;

  
public class RetiroDeEfectivo {
   
    AperturarCuenta clientes = new AperturarCuenta();
    protected String almacenar;
    protected String Conseguir;
    protected String NumeroCuenta="139785249872";
    
    public void Retirar(Scanner entrada, BufferedReader Renglon){
        System.out.println("Ingrese su numero de cuenta para retirar: "
                + "\n-----------> ");
        //NumeroCuenta = entrada.next();
        if(Verificarcuenta()==true){
            System.out.println("Si existe la cuenta");
        }else{
            System.out.println("Cuenta no existente");
        }
    
    }
    
   
    public boolean Verificarcuenta(){        
        almacenar = clientes.ConseguirCuenta(Conseguir, NumeroCuenta);
        
        System.out.println("El numero de cuenta es: " + almacenar);
        
        if (NumeroCuenta.equals(almacenar)){
        return true;
        }
        return false;
    }

}
