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
            int opcion =2;
            int almacenador = 1;
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
            System.out.println("---------AVISO IMPORTANTE---------");
            System.out.println("Se creara primero un cliente para que se puedea hacer las operaciones necesarias");
            
            
    //menu
            do{//Para que se muestre el menu cada vez que se termina una opcion
        System.out.println("Selecciones lo que desea hacer "
                + "\n 1) Crear un Nuevo Cliente"
                + "\n 2) Apertura de Cuenta Bancaria"
                + "\n 3) Retiro de efectivo"
                + "\n 4) Depósito a cuenta bancaria"
                + "\n 5) Transferencia entre cuentas"
                + "\n 6) Reporte de operaciones diarias"
                + "\n 7) Imprimir información de clientes"
                + "\n 8) Salir");
        System.out.println("");
        if(opcion !=1){//if necesario para que se cree primero un cliente y despues se pueda hacer lo demas
            do{
            //opcion = 2;
                System.out.println("Ingres una de las opciones anteriores");
            opcion = entrada.nextInt();
            almacenador = opcion;
            if(opcion < 1 || opcion > 8){
                System.out.println("Ingrese una opcion entre 1 y 7");
                }
            }while(opcion < 1 || opcion > 8);
        }
        
        switch(opcion){
            case 1:
                //apertura de cuenta bancaria
                crearClientes.CrearClientes(almacenador);
                opcion =0;
                break;
            case 2:
            //apertura de cuenta bancaria
            crearClientes.CrearClientes(1);
            crearClientes.CrearClientes(almacenador);
            break;
            case 3:
                //Retiro de efectivo

               ObjRetiro.Retirar(entrada, Renglon, crearClientes);
                break;
            case 4:
                //Deposito de cuenta Bancaria
                break;
            case 5:
                //Transferencia entre cuentas
                break;
            case 6:
                //Reporte de operaciones
                break;
            case 7:
                //Imprimir informacion
                break;
            case 8:
                //Salir
                System.out.println("Ha salido del Sistema ;)");
                break;
        }
        
     }while(opcion < 1 || opcion > 8);       
    }
  }
    

