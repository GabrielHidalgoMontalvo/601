package SocketChat;

import java.io.*;
import java.net.Socket;

public class Cliente implements Runnable {

    private int puerto;
    private String mensaje;

    public Cliente(int puerto, String mensaje) {
        this.puerto = puerto;
        this.mensaje = mensaje;
    }

    @Override
    public void run() {

        final String Host = "127.0.0.1";
        DataOutputStream salida;

        try {
            Socket socket = new Socket(Host, puerto);
            salida = new DataOutputStream(socket.getOutputStream());

            salida.writeUTF(mensaje);

        } catch (Exception error) {
            System.out.println(error);
        }
    }

}
