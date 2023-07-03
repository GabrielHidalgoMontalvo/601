
package exceptiongeneroinvalido;

import javax.swing.JOptionPane;

public class ExceptionGeneroInvalido {

    public static void main(String[] args) {
        try {
            String genero = obtenerGenero();
            JOptionPane.showMessageDialog(null, "Género ingresado: " + genero, "Información de Género", JOptionPane.INFORMATION_MESSAGE);
        } catch (GeneroInvalidoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error: Género Inválido", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static String obtenerGenero() throws GeneroInvalidoException {
        String genero = JOptionPane.showInputDialog(null, "Ingrese su género:", "Ingrese su Género", JOptionPane.QUESTION_MESSAGE);
        if (genero == null || (!genero.equalsIgnoreCase("masculino") && !genero.equalsIgnoreCase("femenino"))) {
            throw new GeneroInvalidoException("Género inválido");
        }
        return genero.toLowerCase();
    }
}

class GeneroInvalidoException extends Exception {
    public GeneroInvalidoException(String mensaje) {
        super(mensaje);
    }
}
