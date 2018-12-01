
package fechateclado;
import java.io.*;


public class FechaTeclado {

    
    public static void main(String[] args)throws IOException {
        String fecha;
        String dia,mes,anio;
        int posicion;
        int datodia,datomes,datoanio;
        BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese La Fecha (dd/mm/aa):");
        
        fecha=teclado.readLine();
        posicion=fecha.indexOf("-");
        dia=fecha.substring(0,posicion);
        fecha=fecha.substring(posicion+1);
        posicion=fecha.indexOf("-");
        mes=fecha.substring(0,posicion);
        fecha=fecha.substring(posicion+1);
        anio=fecha;
        
        datodia=Integer.parseInt(dia);
        datomes=Integer.parseInt(mes);
        datoanio=Integer.parseInt(anio);
        
        if(1>datodia || datodia>31 || 1>datomes || datomes>12 || 1900>datoanio || datoanio>2019){
           System.out.println("Fecha Incorrecta");
        }
        else
        {
          System.out.println("Fecha Correcta");
        }
        
        
    }
    
}
