
package Lista_05_condicionais_2;

import java.util.Scanner;
public class exercicio_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero;
        
        do{
            System.out.println("Digite um numero valido:");
            numero = input.nextInt();
            if(numero < 1 || numero > 9){
                System.out.println("O valor nao esta dentro da faixa parmitida");
            }
        } while(numero < 1 || numero > 9);
        
       if(numero >= 1 && numero <=9){
           System.out.println("O numero esta dentro da faixa permitida.");
       }
        
    }
}
