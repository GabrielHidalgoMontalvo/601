package pkg5.v4trifiv;

import funciones.funcionMultiplo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V4TRIFIV {
    public static void main(String[] args) throws IOException {
        //Declaración de variable
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        //Creo objeto
        funcionMultiplo mult=new funcionMultiplo();
        //Entrada de datos
        System.out.println("Dame el número");
        numero=Integer.parseInt(bufEntrada.readLine());
        
        //Salida de datos
        System.out.println(mult.retornaMultiplo(numero));
    }
    
}
