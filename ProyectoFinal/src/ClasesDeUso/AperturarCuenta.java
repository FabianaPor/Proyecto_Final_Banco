
package ClasesDeUso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AperturarCuenta {

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
    
    public void Menu(Scanner entrada, BufferedReader Renglon) throws IOException {
        int cuentaOpc;
      
        System.out.println("Ya tiene cuenta activa:"
                + "\n 1) Si"
                + "\n 2) No"
                + "\n 3) Salir de Apertura de cuenta");
        do {
            
            cuentaOpc = entrada.nextInt();
            if (cuentaOpc < 1 || cuentaOpc > 3) {
                System.out.println("Ingrese un numero entre 1 y 3");
            }
        } while (cuentaOpc < 1 || cuentaOpc > 3);
        OpcionCuentas(cuentaOpc, entrada, Datos, Renglon);
        
    }
    
    
    public void MenuAutomatico(Scanner entrada, BufferedReader Renglon) throws IOException {
        int cuentaOpc;
        System.out.println("Ya tiene cuenta activa:"
                + "\n 1) Si"
                + "\n 2) No"
                + "\n 3) Salir de Apertura de cuenta");
        do {
            cuentaOpc = 2;

            //cuentaOpc = entrada.nextInt();
            if (cuentaOpc < 1 || cuentaOpc > 3) {
                System.out.println("Ingrese un numero entre 1 y 3");
            }
        } while (cuentaOpc < 1 || cuentaOpc > 3);
        OpcionCuentas(cuentaOpc, entrada, Datos, Renglon);
        
    }
    
    public void OpcionCuentas(int almacenador, Scanner entrada, String Datos, BufferedReader Renglon) throws IOException {
        
        switch (almacenador) {
            case 1:
                AbriCuentaExistente(entrada, Datos);
                break;
            case 2:
                AbriCuentaNoExistente(entrada, Datos, Renglon);
                break;
            case 3:
                System.out.println("Se ha salido del sistema");
                break;
        }
        
    }    

    public void AbriCuentaNueva(Scanner entrada) {
    }
    
    private void AbriCuentaExistente(Scanner entrada, String Datos) {
        //Descripsion del porque
        //realizar el numero de cuenta
        //Beneficiario
        /*
            Nombre completo
            genero
            fecha de nacimiento
            #telefono
         */
    }
    
    
    private void AbriCuentaNoExistente(Scanner entrada, String Datos, BufferedReader Renglon) throws IOException {
        
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
        ArCuentas.add(cuentas);
        System.out.println("****** Los datos del primer cliente es:  " + ArCuentas.get(0).getNumeroCuenta());

        
        

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
    public String ConseguirCuenta(String Conseguir, String NumeroCuenta){
        for(int I=0; I<2; I++){
        Aclientes.add((Cliente) Hilos.get(I));
         System.out.println("-----");
       // Conseguir = Aclientes.get(I).getCuentas().getNumeroCuenta();
         Conseguir = Aclientes.get(I).getAcuentas().get(I).getNumeroCuenta();
            System.out.println("La variable Conseguir es: " + Conseguir );
            System.out.println("La variable NumeroCuenta es: " + NumeroCuenta );
            System.out.println(Aclientes.get(I));
            if (NumeroCuenta.equals(Conseguir)){
                System.out.println("*************************************************");
            return Conseguir;
            }
        }
        Conseguir = "Cuenta no encontrada";
        return Conseguir;
    }
    
}
