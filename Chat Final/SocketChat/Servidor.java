package SocketChat;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;

public class Servidor extends Observable implements Runnable {

    private int puerto;

    public Servidor(int puerto) {
        this.puerto = puerto;
    }

    @Override
    public void run() {
        ServerSocket servidor = null;

        try {
            servidor = new ServerSocket(puerto);
            System.out.println("Servidor iniciado");

            // Ciclo escucha para recibir clientes
            while (true) {
                Socket socket = servidor.accept();
                System.out.println("Cliente conectado");

                // Iniciar un hilo para manejar el cliente
                new Thread(() -> manejarCliente(socket)).start();
            }
        } catch (Exception error) {
            System.out.println(error);
        }
    }

    private void manejarCliente(Socket socket) {
        try {
            DataInputStream entrada = new DataInputStream(socket.getInputStream());

            while (true) {
                String mensaje = entrada.readUTF();
                System.out.println(mensaje);

                // Notificar los cambios del cliente
                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();
            }
        } catch (Exception error) {
            System.out.println("Cliente desconectado");
        }
    }
}
