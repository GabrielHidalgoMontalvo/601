// Hecho en clase
package pkg2.v1.trifit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V1TRIFIT {
    public static void main(String[] args) throws IOException {
        
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        
        int numero;
        float mult3;
        float mult5;
        
        System.out.println("Dame el numero: ");
        numero=Integer.parseInt(bufEntrada.readLine());
        
        mult3=numero%3;
        mult5=numero%5;
        
        if(mult3==0){
            System.out.println("TRI");
        }
        if(mult5==0){
            System.out.println("FIV");
        }
        if (mult3==0 && mult5==0){
            System.out.println("TRIFIV");
        }
    }
    
}
