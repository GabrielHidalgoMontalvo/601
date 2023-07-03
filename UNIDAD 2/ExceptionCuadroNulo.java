
package exceptioncuadronulo;

import javax.swing.JOptionPane;

public class ExceptionCuadroNulo {

    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un texto mediante el cuadro de diálogo
        String texto = JOptionPane.showInputDialog(null, "Ingrese un texto:", "Cuadro de texto", JOptionPane.INFORMATION_MESSAGE);

        try {
            // Verificar si el texto ingresado está vacío
            if (texto == null || texto.isEmpty()) {
                // Lanzar una excepción personalizada ValorNoNuloException
                throw new ValorNuloException("Valor nulo");
            } else {
                // Mostrar un mensaje indicando que se ingresó un valor válido
                JOptionPane.showMessageDialog(null, "Bien hecho", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (ValorNuloException ex) {
            // Capturar y manejar la excepción ValorNuloException
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


class ValorNuloException extends Exception {
    public ValorNuloException(String mensaje) {
        super(mensaje);
    }
}
