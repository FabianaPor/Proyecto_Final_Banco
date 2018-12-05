/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDeUso;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 *
 * @author Magally Portillo
 */
public class Deposito {
        
    protected String almacenar;
    protected String Conseguir;
    protected String NumeroCuenta;
    Scanner entrada = new Scanner(System.in);
    
    public void Depositar(Scanner entrada, BufferedReader Renglon,CrearCliente crearClientes){
        int ciclo=1;
        do{
        boolean verificar;
        System.out.println("Ingrese El numero de cuenta que desea buscar");
        System.out.print("---------> ");
        NumeroCuenta = entrada.next();
        verificar = Verificarcuenta(crearClientes);
        ciclo = 1;
        if(verificar==true){
            System.out.println("****** Si existe la cuenta ******");
            crearClientes.RealizarDeposito(NumeroCuenta);
        }else{
            System.out.println("Cuenta no existente, ingrese otro numero de cuenta");
            ciclo = 2;
        }
    }while(ciclo!=1);
    }
     public void RealizarDepositoCuenta(int ConseguirMonto1, CrearCliente crearClientes) {
    
    int ciclo=1;
        do{
        boolean verificar;
        System.out.println("Ingrese El numero de cuenta que desea buscar para realizar la transferencia");
        System.out.print("---------> ");
        NumeroCuenta = entrada.next();
        verificar = Verificarcuenta(crearClientes);
        ciclo = 1;
        if(verificar==true){
            System.out.println("Si existe la cuenta");
            crearClientes.RealizarDepositoACuenta(NumeroCuenta, ConseguirMonto1);
        }else{
            System.out.println("Cuenta no existente, ingrese otro numero de cuenta");
            ciclo = 2;
        }
    }while(ciclo!=1);
    }
    
    
   
    public boolean Verificarcuenta(CrearCliente crearCliente){        
        almacenar = crearCliente.ConseguirCuenta(NumeroCuenta);
        crearCliente.ConseguirCuenta(NumeroCuenta);
        return NumeroCuenta.equals(almacenar);
    }


}
