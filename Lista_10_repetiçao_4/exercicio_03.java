
package Lista_10_repetiçao_4;

import java.util.Scanner;
public class exercicio_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        3 – Implemente um programa gerador de tabuada, 
        capaz de gerar a tabuada de qualquer número inteiro 
        entre 1 a 10. O usuário deve informar de qual número ele 
        deseja ver a tabuada. A saída deve ser conforme o exemplo 
        abaixo:
            Informe o número: 5
            Tabuada de 5
            5 x 1 = 5
            5 x 2 = 10
            5 x 3 = 15
            ...
            5 x 10 = 50
        */
        for(int i = 1 ; i < 11 ; i ++){
            System.out.println("5 X "+i+" = "+(i*5));
        }
        
    } 
}
