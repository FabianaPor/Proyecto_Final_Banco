/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasePrincipal;

import ClasesDeUso.CrearCliente;
import ClasesDeUso.Deposito;
import ClasesDeUso.Reporte;
import ClasesDeUso.RetiroDeEfectivo;
import ClasesDeUso.TranferenciasEntreCuentas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Magally Portillo
 */
public class ProyectoFinal {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here   

    }

    public static void Ejecutar(String empleado0) throws IOException {

        //Entrada de teclado
        Scanner entrada = new Scanner(System.in);
        BufferedReader Renglon = new BufferedReader(new InputStreamReader(System.in));

        //Variables
        int opcion = 2;
        int almacenador = 1;
        String operacion;
        String empleado = empleado0;

        //Objetos
        RetiroDeEfectivo ObjRetiro = new RetiroDeEfectivo();
        CrearCliente crearClientes = new CrearCliente();
        Deposito depositos = new Deposito();
        TranferenciasEntreCuentas entreCuentas = new TranferenciasEntreCuentas();
        ArrayList<Reporte> ArReportes = new ArrayList<>();

        //varios
        
        System.out.println("---------AVISO IMPORTANTE---------");
        System.out.println("Se creara primero un cliente para que se puedea hacer las operaciones necesarias");

        //menu
        do {//Para que se muestre el menu cada vez que se termina una opcion
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
            if (opcion != 1) {//if necesario para que se cree primero un cliente y despues se pueda hacer lo demas
                do {
                    //opcion = 2;
                    System.out.println("Ingres una de las opciones anteriores");
                    opcion = entrada.nextInt();
                    almacenador = opcion;
                    if (opcion < 1 || opcion > 8) {
                        System.out.println("Ingrese una opcion entre 1 y 7");
                    }
                } while (opcion < 1 || opcion > 8);
            }

            switch (opcion) {
                case 1:
                    //Creacion de Clientes
                    operacion = "Crear Clientes nuevos";

                    RealizarReportePunto(operacion, empleado, ArReportes);
                    crearClientes.CrearClientes(almacenador);
                    opcion = 0;
                    break;
                case 2:
                    //apertura de cuenta bancaria
                    
                    operacion = "Aperturar Cuentas nuevas en clientes existentes";

                    RealizarReportePunto(operacion, empleado, ArReportes);
                    crearClientes.CrearClientes(almacenador);
                    break;
                case 3:
                    //Retiro de efectivo
                    operacion = "Retirar Efectivo de una cuenta";
                    RealizarReportePunto(operacion, empleado, ArReportes);
                    ObjRetiro.Retirar(entrada, Renglon, crearClientes);
                    break;
                case 4:
                    //Deposito de cuenta Bancaria
                    operacion = "Depositar en una cuenta Bancaria";
                    RealizarReportePunto(operacion, empleado, ArReportes);
                    depositos.Depositar(entrada, Renglon, crearClientes);
                    break;
                case 5:
                    //Realizar Tranferencias entre las cuentas
                    operacion = "Realizar Traferencia de CUENTA a CUENTA";
                    RealizarReportePunto(operacion, empleado, ArReportes);
                    entreCuentas.TranferirEntreCuentas(entrada, Renglon, depositos, ObjRetiro, crearClientes);
                    break;
                case 6:
                    //Reporte de operaciones
                    System.out.println("***** SE EMPRIMIRA EL REPORTE DE LAS OPERACIONES DIARIAS *****");
                    for (int i = 0; i < ArReportes.size(); i++) {
                        System.out.println("#" + i + "= " + ArReportes.get(i));
                    }
                    break;
                case 7:
                    //Imprimir informacion
                    operacion = "Imprimir Informacion de Cliente";
                    RealizarReportePunto(operacion, empleado, ArReportes);
                    crearClientes.imprimirInformacion();
                    break;
                case 8:
                    //Salir
                    System.out.println("Ha salido del Sistema ;)");
                    break;
            }

        } while (opcion < 1 || opcion > 8);
    }

    private static void RealizarReportePunto(String operacion, String empleado, ArrayList ArReportes) {
        String TiempoAlmacenado = " (";
        Date tiempoActual;
        tiempoActual = new Date();
        TiempoAlmacenado += tiempoActual + ")";//Se asigna el tiempo en el momento de realizar la operacion

        Reporte reportes = new Reporte(operacion, TiempoAlmacenado, empleado);
        ArReportes.add(reportes);
    }

   
}
