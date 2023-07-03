
package exception1multiplosde2;

import javax.swing.JOptionPane;

public class Exception1Multiplosde2 {

    public static void main(String[] args) {
        try {
            double x = obtenerNumero(); // Llama al método obtenerNumero para solicitar un número al usuario
            if (x % 2 == 0) {
                JOptionPane.showMessageDialog(null, "Es múltiplo de 2"); // Muestra un mensaje si el número es múltiplo de 2
            } else {
                JOptionPane.showMessageDialog(null, "No es múltiplo de 2"); // Muestra un mensaje si el número no es múltiplo de 2
            }
        } catch (ValorNuloOCeroException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()); // Captura la excepción ValorNuloOCeroException y muestra el mensaje de error correspondiente
        } catch (NumeroNoEnteroException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()); // Captura la excepción NumeroNoEnteroException y muestra el mensaje de error correspondiente
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Formato de número incorrecto (no entero)"); // Captura la excepción NumberFormatException y muestra un mensaje de error por formato de número incorrecto
        }
    }

    public static double obtenerNumero() throws ValorNuloOCeroException, NumeroNoEnteroException {
        String input = JOptionPane.showInputDialog(null, "Ingrese un número:", "Ingrese un número múltiplo de 2", 3); // Solicita al usuario que ingrese un número utilizando un cuadro de diálogo JOptionPane
        if (input == null || input.equals("")) {
            throw new ValorNuloOCeroException("Valor nulo"); // Lanza la excepción ValorNuloOCeroException si el valor ingresado es nulo o vacío
        }
        double x;
        try {
            x = Double.parseDouble(input); // Intenta convertir la entrada en un número decimal
        } catch (NumberFormatException e) {
            throw new NumeroNoEnteroException("El número no es válido"); // Lanza la excepción NumeroNoEnteroException si el valor ingresado no es válido
        }
        return x; // Devuelve el número ingresado
    }
}

class ValorNuloOCeroException extends Exception {
    public ValorNuloOCeroException(String mensaje) {
        super(mensaje);
    }
}

class NumeroNoEnteroException extends Exception {
    public NumeroNoEnteroException(String mensaje) {
        super(mensaje);
    }
}
