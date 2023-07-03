
package ejemplo4exceptionjava;

public class Ejemplo4ExceptionJava {
 
    public static void main(String[] args){
        try {
            int division = miMetodo(10,0);
            System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println("Excepción aritmética arrojada");
        }
    }
    
    public static int miMetodo(int a, int b) throws ArithmeticException{ //Metodo anexo, con el disparador de la excepción indicando el tipo
        int c=a/b;
        return c;
    }
}