/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasePrincipal;

import ClasesDeUso.AperturarCuenta;
import ClasesDeUso.CrearCliente;
import ClasesDeUso.RetiroDeEfectivo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Magally Portillo
 */
public class ProyectoFinal {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here   
        Ejecutar();
   }

    public static  void Ejecutar() throws IOException {
            
            //Entrada de teclado
            Scanner entrada = new Scanner(System.in);
            BufferedReader Renglon = new BufferedReader(new InputStreamReader(System.in));

            
            //Variables
            int opcion;
            String almacenador = "1";
            String RETORNADO;
            
            //Clases
            
            //ArrayLis
            ArrayList<AperturarCuenta> Arrapertura = new ArrayList<AperturarCuenta>();
             //Objetos
            AperturarCuenta OBJapertura = new AperturarCuenta();
            RetiroDeEfectivo ObjRetiro = new RetiroDeEfectivo();
            CrearCliente crearClientes = new CrearCliente();
            
            //varios
            String TIPOCUENTA = "AHORRO";
            
    //menu
            do{//Para que se muestre el menu cada vez que se termina una opcion
        System.out.println("Selecciones lo que desea hacer "
                + "\n 1) Apertura de Cuenta Bancaria"
                + "\n 2) Retiro de efectivo"
                + "\n 3) Depósito a cuenta bancaria"
                + "\n 4) Transferencia entre cuentas"
                + "\n 5) Reporte de operaciones diarias"
                + "\n 6) Imprimir información de clientes"
                + "\n 7) Salir");
        System.out.println("");
   

        do{
        
        opcion = 2;
        //opcion = entrada.nextInt();
        if(opcion < 1 || opcion > 7){
            System.out.println("Ingrese una opcion entre 1 y 7");
        }
        }while(opcion < 1 || opcion > 7);
        
        switch(opcion){
            case 1:
                //apertura de cuenta bancaria
                RETORNADO = crearClientes.CrearClientes(almacenador);
                break;
            case 2:
                //Retiro de efectivo
                //RETORNADO = crearClientes.CrearClientes(almacenador);//Creando los clientes de forma automatica
                ObjRetiro.Retirar(entrada, Renglon, crearClientes);
                break;
            case 3:
                //Deposito de cuenta Bancaria
                break;
            case 4:
                //Transferencia entre cuentas
                break;
            case 5:
                //Reporte de operaciones
                break;
            case 6:
                //Imprimir informacion
                break;
            case 7:
                //Salir
                System.out.println("Ha salido del Sistema ;)");
                break;
        }
        
     }while(opcion < 1 || opcion > 7);       
    }
  }
    

