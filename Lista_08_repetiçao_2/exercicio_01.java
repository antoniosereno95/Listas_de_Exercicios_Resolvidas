
package Lista_08_repetiçao_2;

import java.util.Scanner;
public class exercicio_01 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
        double numero = 1 , cubo;
        for(int i = 0 ; i < 25 ; i++){
            cubo = Math.pow(numero, 3);
            System.out.println("O cubo de "+numero+" é: "+cubo);
            numero++;
        }
        
    }
}
