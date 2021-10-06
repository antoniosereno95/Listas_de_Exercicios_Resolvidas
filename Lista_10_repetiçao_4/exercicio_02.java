
package Lista_10_repetiçao_4;

import java.util.Scanner;
public class exercicio_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        /*
        2 - Implemente um programa para exibir todos os números 
        inteiros positivos e menores que 500 que quando divididos 
        por 9 deixam resto 4.
        */
        
        for(int i = 0 ; i < 500 ; i ++){
            if(i%9 == 4){
                System.out.println(i);
            }
            
        }
        
    }
}
