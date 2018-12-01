/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasePrincipal;

import ClasesDeUso.AperturarCuenta;
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //Objetos para introducir datos
            Scanner entrada = new Scanner(System.in);
            BufferedReader Renglon = new BufferedReader(new InputStreamReader(System.in));

            
            //Variables
            int opcion;
            int almacenador;
            
            //Clases
            
            //ArrayLis
            ArrayList<AperturarCuenta> Arrapertura = new ArrayList<AperturarCuenta>();
            
            //Objetos
            AperturarCuenta OBJapertura = new AperturarCuenta();
            
            //varios
            String TIPOCUENTA = "AHORRO";
            
    //menu
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
        
        opcion = 1;
        //opcion = entrada.nextInt();
        if(opcion < 1 || opcion > 7){
            System.out.println("Ingrese una opcion entre 1 y 7");
        }
        }while(opcion < 1 || opcion > 7);
        
        switch(opcion){
            case 1:
                //apertura de cuenta bancaria
                OBJapertura.Menu(entrada, Renglon);
                break;
            case 2:
                //Retiro de efectivo
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
        
    }
    
}
