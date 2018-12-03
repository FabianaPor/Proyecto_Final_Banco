/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDeUso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Magally Portillo
 */
public class CrearCliente {
    
    //Datos del cliente
    //ArrayList
    private ArrayList<Cliente> Arrclientes = new ArrayList<Cliente>();
    private ArrayList<Beneficiario> beneficiarios = new ArrayList<Beneficiario>();

    //objetos
    private Cliente Obclientes;
    private Beneficiario ObBeneficiarios = new Beneficiario();
    private ArrayList<Cliente> Aclientes = new ArrayList<Cliente>();
    private ArrayList<Cuenta> ArCuentas = new ArrayList<Cuenta>();
    static ArrayList<Thread> Hilos = new ArrayList<Thread>();
    //protected Cuenta numeroCuenta = new Cuenta();
    protected Cuenta cuentas = new Cuenta();
    //protected Cuenta Descripcion = new Cuenta();

    //Variables
    private String Datos;
    protected String nombreCompleto;
    
    protected String fechaNacimiento;
    protected char genero;
    protected String estadoCivil;
    protected int telefono;
    protected String direccion;
    protected String lugarDeTrabajo;
    protected double salarioPromedio;
    protected int validarCuenta;
    protected int Monto=0;
    
    protected String sucursales;
    
    
    //Variables de la clase principal
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
        RetiroDeEfectivo ObjRetiro = new RetiroDeEfectivo();

        //varios
        String TIPOCUENTA = "AHORRO";

    public void CrearClientes(){
        int N=0;
        System.out.println("¿Cuantos Clientes quiere Crear?: ");
        System.out.print("---------> ");
        N = entrada.nextInt();
        
        for(int I=0; I<N; I++){
        System.out.println("Entrando a Cuenta No existente.");
        //Datos = entrada.next();
        //Introduciendo los datos del cliente
        System.out.println("Ingrese el nombre del cliente: \n");
        //nombreCompleto = Renglon.readLine();
        nombreCompleto = "Edwin Olivera";
        //Creando el numero de cuento
        System.out.println("Ingrese el numero de cliente: \n");
        //numeroCuenta = NumeroDeCuenta();
        cuentas.setNumeroCuenta("139785249872");
        cuentas.setMonto(2934);

        //*****************************
        //Introduciendo la fecha
        //fechaNacimiento = IntroducirFecha();
        fechaNacimiento = "10-09-1995";
        //*****************************************

        //Ingresando el Genero del cliente
        System.out.println("Ingrese el genero del cliente; M o F");

        //genero = entrada.next().charAt(0);
        genero = 'M';
        //*****************************************

        //ingresando el estado civil del cliente
        System.out.println("Ingrese el estado civil del cliente");
        estadoCivil = "1";
        //estadoCivil = EstadoCivil(entrada);
        //*****************************************

        //Ingresando el telefono del cliente
        System.out.println("Ingrese el numero telefonico");
        telefono = 1231232;
        //telefono = entrada.nextInt();
        //*****************************************

        //Ingresando la direccion
        System.out.println("Ingrese la direccion actual de recidencia: ");
        direccion = "Kennedy, zona 1";
        //direccion = IngresarLineasDeInformacion(Renglon);
        //*****************************************

        //Ingresando la direccion del trabajo actual
        System.out.println("Ingrese la direccion actual de Trabajo: ");
        lugarDeTrabajo = "Casa";
        //lugarDeTrabajo = IngresarLineasDeInformacion(Renglon);
        //*****************************************

        //Ingresando el salario actual
        System.out.println("Ingrese el salario promedio actual de Trabajo: ");
        salarioPromedio = 1234;
//         salarioPromedio = entrada.nextInt();
        //*****************************************

        //Ingresando el porque abrira la cuenta de banco
        System.out.println("Ingrese el porque desea  abrir la cuenta de banco: ");
        cuentas.setDescripcion("sflndfoindfoin");
        //Descripcion = IngresarLineasDeInformacion(Renglon);
        //*****************************************

        //Ingresando al beneficiario
        System.out.println("Ingrese datos del beneficiario: ");
        System.out.println("Ingrese el nombre");
        String Datos1;
        char opcion1;
        Datos1 = "Mario";
        
        cuentas.setBeneficiarios(Datos1);
        /*
        //Datos1 = Renglon.readLine();
        ObBeneficiarios.setNombre(Datos1);
        System.out.println("Ingrese la fecha de nacimiento");
        
        Datos1 = "31-10-1996";
        //Datos1 = Renglon.readLine();
        ObBeneficiarios.setFechaDeNacimiento(Datos1);
       
        System.out.println("Ingrese Genero");
        opcion1 = 'M';
        //opcion1 = entrada.next().charAt(0);
        ObBeneficiarios.setGenero(opcion1);
        
        beneficiarios.add(ObBeneficiarios);
        cuentas.setBeneficiarios(ObBeneficiarios);
        System.out.println(beneficiarios.size());
        //*****************************************
         */
        System.out.println("Ingrese La sucursal donde abrira la cuenta");
        Datos1 = "Intibuca";
        sucursales = Datos1;
        //sucursales = entrada.next();
        validarCuenta = 1;
        Monto = 1500;
        ArCuentas.add(1,cuentas);
        System.out.println("****** Los datos del primer cliente es:  " + ArCuentas.get(0).getNumeroCuenta());

        
        

        //Creando el cliente nuevo. 
        Obclientes = new Cliente(
                nombreCompleto,
                ArCuentas,
                fechaNacimiento,
                genero,
                estadoCivil,
                telefono,
                direccion,
                lugarDeTrabajo,
                salarioPromedio,
                validarCuenta, 
                Monto, 
                sucursales);

        /*
        System.out.println("1)------: " + Arrclientes.size());
        System.out.println("------------------------------------------------------------");
        System.out.println("2)------: " + Obclientes.getNombreCompleto());
        //Descripsion del porque
        //realizar el numero de cuenta
        //Beneficiario
      
            Nombre completo
            genero
            fecha de nacimiento
            #telefono
         
        System.out.println("Imprimiendo la informacion recien agregada: ");
        System.out.println("********************************************************");
        System.out.println(Obclientes.toString());*/
        
        Hilos.add(Obclientes);
        Aclientes.add((Cliente) Hilos.get(0));
     
        
        System.out.println("Entrando a Cuenta No existente.");
        //Datos = entrada.next();
        //Introduciendo los datos del cliente
        System.out.println("Ingrese el nombre del cliente: \n");
        //nombreCompleto = Renglon.readLine();
        nombreCompleto = "Roberto Mcleman";
        //Creando el numero de cuento
        System.out.println("Ingrese el numero de cliente: \n");
        //numeroCuenta = NumeroDeCuenta();
        cuentas.setNumeroCuenta(NumeroDeCuenta());

        //*****************************
        //Introduciendo la fecha
        //fechaNacimiento = IntroducirFecha();
        fechaNacimiento = "10-09-1995";
        //*****************************************

        //Ingresando el Genero del cliente
        System.out.println("Ingrese el genero del cliente; M o F");

        //genero = entrada.next().charAt(0);
        genero = 'M';
        //*****************************************

        //ingresando el estado civil del cliente
        System.out.println("Ingrese el estado civil del cliente");
        estadoCivil = "1";
        //estadoCivil = EstadoCivil(entrada);
        //*****************************************

        //Ingresando el telefono del cliente
        System.out.println("Ingrese el numero telefonico");
        telefono = 1231232;
        //telefono = entrada.nextInt();
        //*****************************************

        //Ingresando la direccion
        System.out.println("Ingrese la direccion actual de recidencia: ");
        direccion = "Kennedy, zona 1";
        //direccion = IngresarLineasDeInformacion(Renglon);
        //*****************************************

        //Ingresando la direccion del trabajo actual
        System.out.println("Ingrese la direccion actual de Trabajo: ");
        lugarDeTrabajo = "Casa";
        //lugarDeTrabajo = IngresarLineasDeInformacion(Renglon);
        //*****************************************

        //Ingresando el salario actual
        System.out.println("Ingrese el salario promedio actual de Trabajo: ");
        salarioPromedio = 1234;
//         salarioPromedio = entrada.nextInt();
        //*****************************************

        //Ingresando el porque abrira la cuenta de banco
        System.out.println("Ingrese el porque desea  abrir la cuenta de banco: ");
        cuentas.setDescripcion("sflndfoindfoin");
        //Descripcion = IngresarLineasDeInformacion(Renglon);
        //*****************************************

        //Ingresando al beneficiario
        System.out.println("Ingrese datos del beneficiario: ");
        System.out.println("Ingrese el nombre");
        
        Datos1 = "Mario";
        
        cuentas.setBeneficiarios(Datos1);
        /*
        //Datos1 = Renglon.readLine();
        ObBeneficiarios.setNombre(Datos1);
        System.out.println("Ingrese la fecha de nacimiento");
        
        Datos1 = "31-10-1996";
        //Datos1 = Renglon.readLine();
        ObBeneficiarios.setFechaDeNacimiento(Datos1);
       
        System.out.println("Ingrese Genero");
        opcion1 = 'M';
        //opcion1 = entrada.next().charAt(0);
        ObBeneficiarios.setGenero(opcion1);
        
        beneficiarios.add(ObBeneficiarios);
        cuentas.setBeneficiarios(ObBeneficiarios);
        System.out.println(beneficiarios.size());
        //*****************************************
         */
        System.out.println("Ingrese La sucursal donde abrira la cuenta");
        Datos1 = "Intibuca";
        sucursales = Datos1;


        validarCuenta = 0;
        Monto = 100;
        ArCuentas.add(cuentas);

        
        

        //Creando el cliente nuevo. 
        Obclientes = new Cliente(
                nombreCompleto,
                ArCuentas,
                fechaNacimiento,
                genero,
                estadoCivil,
                telefono,
                direccion,
                lugarDeTrabajo,
                salarioPromedio,
                validarCuenta, 
                Monto, 
                sucursales);
        
        /*
        System.out.println("1)------: " + Arrclientes.size());
        System.out.println("------------------------------------------------------------");
        System.out.println("2)------: " + Obclientes.getNombreCompleto());
        //Descripsion del porque
        //realizar el numero de cuenta
        //Beneficiario
      
            Nombre completo
            genero
            fecha de nacimiento
            #telefono
         */
        System.out.println("Imprimiendo la informacion recien agregada: ");
        System.out.println("********************************************************");
        System.out.println(Obclientes.toString());
        System.out.println(Obclientes.toString());
        System.out.println(Obclientes.toString());
        System.out.println(Obclientes.toString());
        System.out.println(cuentas.getNumeroCuenta());
        System.out.println("****** Los datos del primer cliente es:  " + ArCuentas.get(1).getNumeroCuenta());
        Hilos.add(Obclientes);
        Aclientes.add((Cliente) Hilos.get(1));
       
         //return Hilos;
  
        
        
        }
        
    
    }
     private String NumeroDeCuenta() {
        Random aleatorio = new Random(System.currentTimeMillis());
        String cuenta = "";
        for (int i = 0; i < 7; i++) {
            if (i < 4) {
                cuenta += aleatorio.nextInt(10);
            } else {
                cuenta += (char) (aleatorio.nextInt(80) + 65);
            }
        }
        return cuenta;
    }
}
