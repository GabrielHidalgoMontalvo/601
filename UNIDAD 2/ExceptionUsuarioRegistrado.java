
package exceptionusuarioregistrado;

import javax.swing.JOptionPane;

public class ExceptionUsuarioRegistrado {
    public static void main(String[] args) {
        String nombreAlmacenado = "Juan"; // Nombre almacenado

        try {
            String nombreIngresado = obtenerNombre(); // Solicitar nombre al usuario
            verificarNombre(nombreIngresado, nombreAlmacenado); // Verificar si el nombre coincide
            JOptionPane.showMessageDialog(null, "Usuario correcto"); // Nombre correcto
        } catch (UsuarioIncorrectoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()); // Nombre incorrecto
        }
    }

    public static String obtenerNombre() {
        return JOptionPane.showInputDialog(null, "Ingrese su nombre:", "Verificación de usuario", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void verificarNombre(String nombreIngresado, String nombreAlmacenado) throws UsuarioIncorrectoException {
        if (!nombreIngresado.equals(nombreAlmacenado)) {
            throw new UsuarioIncorrectoException("Usuario incorrecto");
        }
    }
}

class UsuarioIncorrectoException extends Exception {
    public UsuarioIncorrectoException(String mensaje) {
        super(mensaje);
    }
}
