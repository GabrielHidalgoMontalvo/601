
package exceptionerrormensaje;

import javax.swing.JOptionPane;

public class ExceptionErrorMensaje {

    public static void main(String[] args) {
        try {
            presionarEnter();
            JOptionPane.showMessageDialog(null, "Virus instalado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (VirusNoInstaladoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error: Virus no encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void presionarEnter() throws VirusNoInstaladoException {
        String input = JOptionPane.showInputDialog(null, "Presione Enter para instalar el virus:", "Mensaje", JOptionPane.QUESTION_MESSAGE);
        if (input != null && !input.equals("")) {
            throw new VirusNoInstaladoException("Virus no instalado.");
        }
    }
}

class VirusNoInstaladoException extends Exception {
    public VirusNoInstaladoException(String mensaje) {
        super(mensaje);
    }
}
