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
public class TranferenciasEntreCuentas {

    public void TranferirEntreCuentas(Scanner entrada, BufferedReader Renglon, Deposito depositos, RetiroDeEfectivo ObjRetiro, CrearCliente crearClientes) {
        //int Cuenta1=1;
        //int Cuenta2;
        int ConseguirMonto1 = ObjRetiro.ConseguirMontoCuentaDeRetiro(crearClientes);
      depositos.RealizarDepositoCuenta(ConseguirMonto1, crearClientes);
    }

}
