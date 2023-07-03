
package exceptionarchivonoencontrado;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ExceptionArchivoNoEncontrado {

    public static void main(String[] args) {
        try {
            // Intentar abrir un archivo que no existe
            File file = new File("archivo.txt");
            Scanner scanner = new Scanner(file);
            
            // Leer el contenido del archivo línea por línea
            StringBuilder content = new StringBuilder();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                content.append(line).append("\n");
            }
            
            // Cerrar el scanner
            scanner.close();
            
            // Mostrar el contenido del archivo en un JOptionPane
            JOptionPane.showMessageDialog(null, "Contenido del archivo:\n" + content.toString(), "Archivo Encontrado", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException e) {
            // Manejar la excepción de archivo no encontrado
            JOptionPane.showMessageDialog(null, "El archivo no pudo ser encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
