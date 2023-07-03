
package ejemplo3exceptionjava;

public class Ejemplo3ExceptionJava {
 
    public static void main(String[] args){
        try {
            float equis=5/0;
            System.out.println("Equis = " + equis);
        } catch (ArithmeticException e) {
            System.out.println("ERROR: División entre cero");
        }finally{
            System.out.println("A pesar de todo, se ejecuta el bloque finally");
        }
    }
}