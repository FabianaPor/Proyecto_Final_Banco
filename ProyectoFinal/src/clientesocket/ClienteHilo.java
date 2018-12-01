/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientesocket;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Emilson
 */
public class ClienteHilo extends Thread {

    protected Socket socket;
    protected ObjectOutputStream salidaDatos;
    protected ObjectInputStream entradaDatos;

    public ClienteHilo() {
    }

    // conectarse al servidor y procesar mensajes del servidor
    private void ejecutarCliente() {
        // conectarse al servidor, obtener flujos, procesar la conexi�n
        try {
            if (conectarAServidor("127.0.0.1")) { // Paso 1: crear un socket para realizar la conexion
                obtenerFlujos();      // Paso 2: obtener los flujos de entrada y salida
                procesarConexion(); // Paso 3: procesar la conexion                
            }
        } // el servidor cerro la conexion
        catch (EOFException excepcionEOF) {
            mostrarMensaje("Se produjo un error en la conexion con el servidor, el error es: "
                    + excepcionEOF.toString());
        } // procesar los problemas que pueden ocurrir al comunicarse con el servidor
        catch (IOException excepcionES) {
            mostrarMensaje("Se produjo un error en la comunicacion con el servidor, el error es: "
                    + excepcionES.toString());
        } finally {
            cerrarConexion(); // Paso 4: cerrar la conexion
        }

    } // fin del metodo ejecutarCliente

    // conectarse al servidor
    private boolean conectarAServidor(String host) {
        try {
            mostrarMensaje("Intentando realizar conexion\n");
            // crear Socket para realizar la conexion con el servidor
            socket = new Socket(InetAddress.getByName(host), 10578);

            // mostrar la informacion de la conexion en la consola del cliente
            mostrarMensaje("Conectado a: " + socket.getInetAddress().getHostName());
            return true;
        } catch (IOException ex) {
            mostrarMensaje("No se pudo establecer la conexion con el servidor, el error es: " + ex.toString());
            return false;
        }
    }

    // obtener flujos para enviar y recibir datos
    private void obtenerFlujos() throws IOException {
        // establecer flujo de salida para los objetos que se envian al servidor
        salidaDatos = new ObjectOutputStream(socket.getOutputStream());
        salidaDatos.flush(); // vaciar buffer de salida para enviar informacion de encabezado

        // establecer flujo de entrada para los objetos que se reciben por parte del servidor
        entradaDatos = new ObjectInputStream(socket.getInputStream());
    }

    // procesar la conexion con el servidor
    private void procesarConexion() throws IOException {
        String mensajeRespuesta = "";
        Scanner sc = new Scanner(System.in);
        do { // procesar mensajes recibidos del servidor
            // leer mensaje y mostrarlo en pantalla
            try {
                mostrarMensaje("Escriba el mensaje que desea enviar al servidor");
                enviarMensaje(sc.nextLine());
                mensajeRespuesta = (String) entradaDatos.readObject();
                mostrarMensaje("Servidor devuelve el mensaje: " + mensajeRespuesta);
            } // atrapar los problemas que pueden ocurrir al leer del servidor
            catch (ClassNotFoundException excepcionClaseNoEncontrada) {
                mostrarMensaje("\nSe recibio un objeto de tipo desconocido, el error es: "
                        + excepcionClaseNoEncontrada.toString());
            }
        } while (!mensajeRespuesta.equals("TERMINAR"));
        mostrarMensaje("FIN DEL CICLO CLIENTE");
    } // fin del metodo procesarConexion

    // enviar mensaje al servidor
    private void enviarMensaje(String mensaje) {
        // enviar objeto al servidor
        try {
            salidaDatos.writeObject(mensaje);
            salidaDatos.flush();
        } // procesar los problemas que pueden ocurrir al enviar el objeto
        catch (IOException excepcionES) {
            mostrarMensaje("\nError al enviar el mensaje al servidor, el error es: "
                    + excepcionES.toString());
        }
    }

    // cerrar flujos y socket
    private void cerrarConexion() {
        try {
            salidaDatos.close();
            entradaDatos.close();
            socket.close();
        } catch (IOException excepcionES) {
            mostrarMensaje("Se produjo un error al cerrar la conexion con el servidor, "
                    + "el error es: " + excepcionES.toString());
        }
    }

    private void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public void run() {
        ejecutarCliente();
    }
}
