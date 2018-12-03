/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasePrincipal;

import empleadosocket.EmpleadoHilo;

/**
 *
 * @author Emilson
 */
public class EmpleadoSocket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpleadoHilo cliente=new EmpleadoHilo();
        cliente.start();
        
      
       
    }
    
}
