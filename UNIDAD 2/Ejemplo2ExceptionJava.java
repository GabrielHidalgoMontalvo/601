
package ejemplo2exceptionjava;

import javax.swing.JOptionPane;

public class Ejemplo2ExceptionJava {
    public static void main(String[] args){
        int x, y;
        try {
            x=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número 1:", "Solicito datos",3));
            y=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número 2:", "Solicito datos",3));
            JOptionPane.showMessageDialog(null, "La división de "+x+"/"+y+" es: "+(x/y), "Mostrando resultado",1);
        } catch (NumberFormatException n) {
            System.out.println(n.getMessage()+" No es un número ENTERO");
        }catch (ArithmeticException a) {
            System.out.println(a.getMessage()+" No se puede dividir entre CERO (0)");
        } 
    }
}