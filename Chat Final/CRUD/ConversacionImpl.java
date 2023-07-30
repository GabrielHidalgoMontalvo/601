package CRUD;

import ConexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConversacionImpl implements Conversacion {

    @Override
    public void registrarConversacion1(String mensaje) {
        String fecha = obtenerFechaActual(); // Obtenemos la fecha actual

        try (Connection conexion = Conexion.getInstance();
                PreparedStatement consulta = conexion.prepareStatement("INSERT INTO mensajes (chat1, fecha_cliente1) VALUES (?, ?)")) {

            consulta.setString(1, mensaje);
            consulta.setString(2, fecha);
            consulta.executeUpdate();

            System.out.println("Conversación registrada correctamente.");
        } catch (SQLException error) {
            System.out.println("Error al insertar mensaje en la base de datos: " + error.getMessage());
        }
    }

    @Override
    public void registrarConversacion2(String mensaje) {
        Date fecha = new Date(); // Obtenemos la fecha actual

        try (Connection conexion = Conexion.getInstance();
                PreparedStatement consulta = conexion.prepareStatement("INSERT INTO mensajes (chat2, fecha_cliente2) VALUES (?, ?)")) {

            consulta.setString(1, mensaje);
            consulta.setTimestamp(2, new java.sql.Timestamp(fecha.getTime()));
            consulta.executeUpdate();

            System.out.println("Conversación 2 registrada correctamente.");
        } catch (SQLException error) {
            System.out.println("Error al insertar mensaje en la base de datos: " + error.getMessage());
        }
    }

    private String obtenerFechaActual() {
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatoFecha.format(fechaActual);
    }
}
