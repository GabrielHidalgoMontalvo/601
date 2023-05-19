package pkg4.v3trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V3TRIFIV {
    public static void main(String[] args) throws IOException { 
        //Entrada de datos
        int numero;
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dame el número");
        numero = Integer.parseInt(bufEntrada.readLine());
        
        //Salida de datos
        System.out.println(retornaMultiplo(numero));
    }
    public static String retornaMultiplo (int num){
        //Salida de datos
        int mult3;
        int mult5;
        
        //Procesar datos
        mult3=num%3;
        mult5=num%5;
        
        if(mult3==0 && mult5==0) {
            return "TRIFIV";
        }
        else if (mult3==0){
            return "TRI";
        }
        else {
            return "FIV";
        
        }
    }
}

    

    

