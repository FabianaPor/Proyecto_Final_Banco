/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDeUso;

import static ClasesDeUso.AperturarCuenta.Hilos;
import java.io.BufferedReader;
import java.io.IOException;
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
    private ArrayList<Cliente> Arclientes = new ArrayList<Cliente>();
    private ArrayList<Beneficiario> ArBeneficiarios = new ArrayList<Beneficiario>();
    public ArrayList<ArrayList<Cuenta>> ArrCuentas = new ArrayList<>();
    //objetos
    private Cliente Obclientes;
    private Beneficiario ObBeneficiarios = new Beneficiario();
    private ArrayList<Cliente> Aclientes = new ArrayList<>();
    
    static ArrayList<Thread> Hilos = new ArrayList<Thread>();
    //protected Cuenta numeroCuenta = new Cuenta();
    protected Cuenta cuentas;
    //protected Cuenta Descripcion = new Cuenta();

    //Variables
    private String Datos;
    protected String nombreCompleto;
    

    protected String fechaNacimiento;
    protected char genero;
    protected String auxS; 
    protected String estadoCivil;
    protected int telefono;
    protected String direccion;
    protected String lugarDeTrabajo;
    protected double salarioPromedio;
    protected int validarCuenta;
    protected int Monto = 0;

    protected String sucursales;

    //Variables de la clase principal
    Scanner entrada = new Scanner(System.in);
    BufferedReader Renglon = new BufferedReader(new InputStreamReader(System.in));

    //Variables
    int opcion;
    int almacenador;

    //Clases
    //ArrayLis
   
    //Objetos
    AperturarCuenta OBJapertura = new AperturarCuenta();

    //varios
    String TIPOCUENTA = "AHORRO";

    public String CrearClientes(String almacenador) {
        if(almacenador.equals("1")){
                System.out.println("Iniciando proceso de creacion de Cliente");
                int N = 0;
                System.out.println("¿Cuantos Clientes quiere Crear?: ");
                System.out.print("---------> ");
                N = entrada.nextInt();

                for (int I = 0; I < N; I++) {
                    System.out.println("Inciando Creacion de Clientes");

                    //Introduciendo los datos del cliente
                    System.out.println("Ingrese el nombre del cliente: \n");
                    //nombreCompleto = Renglon.readLine();
                    nombreCompleto = "Edwin Olivera";

                    //*****************************
                    //Introduciendo la fecha
                    //fechaNacimiento = IntroducirFecha();
                    fechaNacimiento = "10-09-1995";
                    //*****************************************
                   

                    //Ingresando el Genero del cliente
                  
                    System.out.println("Ingrese el genero del cliente; M o F");
                    //genero = entrada.next().charAt(0);
                    
                    genero = 'M';//Crear funcion para que ingrese solo los generos permitidos
                    
                    
                    //*****************************************
                    //ingresando el estado civil del cliente
                    System.out.println("Ingrese el estado civil del cliente");
                    estadoCivil = "1";
                    //estadoCivil = EstadoCivil(entrada);
                    //*****************************************

                    //Ingresando el telefono del cliente
                    System.out.println("Ingrese el numero telefonico");
                    telefono = 1231232;
                    //telefono = entrada.nextInt();//Crear metodo para que entre el numero de forma xxxx-xxxx
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

                   do{
                    //Ingresando el salario actual
                    System.out.println("Ingrese el salario promedio actual de Trabajo: ");
                    salarioPromedio = 1234;
                    //salarioPromedio = entrada.nextInt();
                    //*****************************************
                    }while(salarioPromedio<=0 || salarioPromedio>999999);
                   
                    String opcion1;
                   
                    System.out.println("Ingrese La sucursal donde abrira la cuenta");
                    opcion1 = "Intibuca";
                    sucursales = opcion1;
                    //sucursales = entrada.next();//Crear Funcion para introducir la sucursal
                    validarCuenta = 1;
                    Monto = 1500;
                   
                    ArrCuentas.add(CrearArrayListCuenta());//Agregando Segundo ArrayList.
                    System.out.println("Crecimiento del ArrayList Mayor: " +ArrCuentas.size());
                   
                    System.out.println("******El numero de cuenta del primer cliente es:  " + ArrCuentas.get(0).get(0).getNumeroCuenta());
                    
                    //Creando el cliente nuevo. 
                    Obclientes = new Cliente(
                            nombreCompleto,
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
                }
              }  
            if(almacenador.equals("2")){
                        
                        
                System.err.println("Iniciando El retiro");
             
                String Conseguido;
               String numeroCuenta = ArrCuentas.get(0).get(0).getNumeroCuenta();

                String Conseguir;
                for (int fila = 0; fila < ArrCuentas.size(); fila++) {
                    for (int columnas = 0; columnas < ArrCuentas.get(fila).size(); columnas++) {
                        //clientes.add((Cliente) Hilos.get(I));
                        System.out.println("-----");
                        // System.out.println(ArrCuentas.get(fila).get(columnas).getNumeroCuenta());
                          Conseguido = ArrCuentas.get(fila).get(columnas).getNumeroCuenta();
                        System.out.println("-----");

                        //Conseguir = ArrCuentas.get(fila).get(columnas).getNumeroCuenta();
                        Conseguir = "¬¬¬¬¬¬¬¬";
                        System.out.println("La variable Conseguir es: " + Conseguir);
                        System.out.println("La variable NumeroCuenta es: " + numeroCuenta);
                        //System.out.println(ArrCuentas.get(fila).get(columnas));
                        
                        if (numeroCuenta.equals(Conseguido)) {
                            System.out.println("*************************************************");
                            System.out.println("El nuemero de cuenta encontrado" + Conseguido);
                            return Conseguido;
                        }
                    }

                }
                System.err.println("-----");

                System.err.println("-----");
                // Conseguir = Aclientes.get(I).getCuentas().getNume
                Conseguido = "No se encontro el numero de cuenta";
                return Conseguido;
                }

        

        return almacenador;
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

    private String IntroducirFecha() throws IOException {
        String fecha = "";
        String dia, mes, anio;
        int posicion;
        int datodia, datomes, datoanio;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print("Ingrese La Fecha en este orden (dd/mm/aa):");

            fecha = teclado.readLine();
            posicion = fecha.indexOf("-");
            dia = fecha.substring(0, posicion);
            fecha = fecha.substring(posicion + 1);
            posicion = fecha.indexOf("-");
            mes = fecha.substring(0, posicion);
            fecha = fecha.substring(posicion + 1);
            anio = fecha;

            datodia = Integer.parseInt(dia);
            datomes = Integer.parseInt(mes);
            datoanio = Integer.parseInt(anio);

            if (1 > datodia || datodia > 31 || 1 > datomes || datomes > 12 || 1900 > datoanio || datoanio > 2100) {
                System.out.println("Fecha Incorrecta, Ingrese de nuevo la fecha");
            } else {
                System.out.println("Fecha Correcta");

            }
        } while (1 > datodia || datodia > 31 || 1 > datomes || datomes > 12 || 1900 > datoanio || datoanio > 2100);
        return fecha;

    }

    private String EstadoCivil(Scanner entrada) {

        String estadoC = "s";
        int temp;
        do {
            System.out.println("Ingrese el estado civil del cliente (ingrse el numero)"
                    + "\n 1) = Soltero(a)"
                    + "\n 2) = Casado(a)"
                    + "\n 3) = Viudo(a)"
                    + "\n 4) = Union libre"
                    + "\n 5) = Divorsiado(a)");

            temp = entrada.nextInt();

            switch (temp) {
                case 1:
                    estadoC = "Soltero(a)";
                    break;
                case 2:
                    estadoC = "Casado(a)";
                    break;
                case 3:
                    estadoC = "Viudo(a)";
                    break;
                case 4:
                    estadoC = "Union libre";
                    break;
                case 5:
                    estadoC = "Divorsiado(a)";
                    break;
                default:
                    System.out.println("No se reconoce ninguna la opcion. Ingrese una opcion valida");
                    break;
            }
        } while (temp < 1 || temp > 5);
        return estadoC;
    }

    private String IngresarLineasDeInformacion(BufferedReader Renglon) throws IOException {
        String Informacion;
        Informacion = Renglon.readLine();

        return Informacion;
    }

    public String ConseguirCuenta(String NumeroCuenta) { //NumeroCuenta="1322424"
        String Conseguido;
        String Conseguir;
        Conseguido = NumeroCuenta;
        for (int fila = 0; fila < ArrCuentas.size(); fila++) {
            for (int columnas = 0; columnas < ArrCuentas.get(fila).size(); columnas++) {
                Conseguir = ArrCuentas.get(fila).get(columnas).getNumeroCuenta();
                System.out.println(ArrCuentas.get(fila).get(columnas));
                if (NumeroCuenta.equals(Conseguir)) {
                    return Conseguido;
                }
            }

        }
        Conseguido = "No se encontro el numero de cuenta";
        return Conseguido;
    }

    

    private ArrayList<Cuenta> CrearArrayListCuenta() {
        ArrayList<Cuenta> ArCuentas = new ArrayList<>();
        int Crear;
        String numeroCuenta;
        String Descripcion;
        String beneficiarios;
        int Monto;
        System.out.println("¿Cuentas Cuentas desea crea?");
        System.out.print("---------> ");
        Crear = entrada.nextInt();
        
        for(int Cuentas=0; Cuentas < Crear; Cuentas++){
            //Falta implementar metodos de creacio de datos, adecuados
        System.out.println("Ingrese el porque desea  abrir la cuenta de banco: ");
        numeroCuenta = "139785249872";
        Descripcion = "Para tener un ahorro a futuro";
        beneficiarios = "Mario";
        Monto = 1000;
        cuentas = new Cuenta(
                numeroCuenta, 
                Descripcion, 
                beneficiarios, Monto);
        ArCuentas.add(cuentas);
        }
       return ArCuentas;
    }

}
