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
        
 
        verificar = Verificarcuenta(crearClientes);
        ciclo = 1;
        if(verificar==true){
            System.out.println("Si existe la cuenta");
            crearClientes.RealizarRetiro(NumeroCuenta);
        }else{
            System.out.println("Cuenta no existente, ingrese otro numero de cuenta");
            ciclo = 2;
        }
    }while(ciclo!=1);
    }
    
    public int ConseguirMontoCuentaDeRetiro(CrearCliente crearClientes){
    int MontoConseguido=0;
    int ciclo=1;
        do{
        boolean verificar;
        System.out.println("Ingrese El numero de cuenta que desea buscar para realizar la transferencia");
        System.out.print("---------> ");
        NumeroCuenta = entrada.next();
        
 
        verificar = Verificarcuenta(crearClientes);
        ciclo = 1;
        if(verificar==true){
            System.out.println("**** Si existe la cuenta *****");
            MontoConseguido = crearClientes.ConseguirMonto(NumeroCuenta);
        }else{
            System.out.println("Cuenta no existente, ingrese otro numero de cuenta");
            ciclo = 2;
        }
    }while(ciclo!=1);
    return MontoConseguido;
    }
   
    public boolean Verificarcuenta(CrearCliente crearCliente){        
        almacenar = crearCliente.ConseguirCuenta(NumeroCuenta);
        crearCliente.ConseguirCuenta(NumeroCuenta);
        
        
        return NumeroCuenta.equals(almacenar);
    }    

}
