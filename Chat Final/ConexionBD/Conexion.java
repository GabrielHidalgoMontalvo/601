package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost/chat";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static Connection connection = null;

    public static Connection getInstance() {
        if (connection == null) {
            connection = obtenerConexion();
        }
        return connection;
    }

    private static Connection obtenerConexion() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado a la base de datos");
        } catch (ClassNotFoundException e) {
            mostrarMensajeError("Error al cargar el controlador JDBC: " + e.getMessage());
        } catch (SQLException e) {
            mostrarMensajeError("Error al conectar a la base de datos: " + e.getMessage());
        }

        return connection;
    }

    private static void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error de conexión", JOptionPane.ERROR_MESSAGE);
    }
}
