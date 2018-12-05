/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDeUso;

import java.io.BufferedReader;
import java.util.Scanner;

  
public class RetiroDeEfectivo extends CrearCliente{
   
    
    protected String almacenar;
    protected String Conseguir;
    protected String NumeroCuenta="139785249872";
    
    public void Retirar(Scanner entrada, BufferedReader Renglon,CrearCliente crearClientes){
        int ciclo=1;
        do{
        boolean verificar;
        System.out.println("Ingrese El numero de cuenta que desea buscar");
        System.out.print("---------> ");
        NumeroCuenta = entrada.next();
        System.out.println("Ingrese su numero de cuenta para retirar: "
                + "\n-----------> ");
        //NumeroCuenta = entrada.next();
        verificar = Verificarcuenta(crearClientes);
        ciclo = 1;
        if(verificar==true){
            System.out.println("Si existe la cuenta");
            RetirarMonto();
        }else{
            System.out.println("Cuenta no existente, ingrese otro numero de cuenta");
            ciclo = 2;
        }
    }while(ciclo!=1);
    }
    
    
   
    public boolean Verificarcuenta(CrearCliente crearCliente){        
        almacenar = crearCliente.ConseguirCuenta(NumeroCuenta);
        
        System.out.println("El numero de cuenta recuperado es: " + almacenar);
        System.err.println("---------------------------");
        
        return NumeroCuenta.equals(almacenar);
    }

    private void RetirarMonto() {
  
    }

}
