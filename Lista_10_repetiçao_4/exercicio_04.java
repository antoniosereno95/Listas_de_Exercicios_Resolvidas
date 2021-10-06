
package Lista_10_repetiçao_4;

import java.util.Scanner;
public class exercicio_04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        4 - Implemente um programa para gerar e exibir os 25 
        primeiros termos da seguinte série: 1,4,7,10,13,16,…
        */
        
        int j = 1;
        for(int i = 0 ; i < 25 ; i++){
            System.out.println(j);
            j = j + 3;
        }
        
    }
}
