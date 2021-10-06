
package Lista_10_repetiçao_4;

import java.util.Scanner;
public class exercicio_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        5 - Implemente um programa para calcular e exibir a soma 
        dos N primeiros números inteiros maiores que zero, onde N 
        (quantidade de números a serem somados) é um valor informado
        pelo usuário.
        OBS: Para ser válido, N deve ser maior que zero. O programa deve 
        forçar que o usuário informe um valor de N válido.
        */
        int n ;
        System.out.println("Digite um numero:");
        n = input.nextInt();
        if(n <= 0){
            while(n <= 0){
                n = input.nextInt();
            }
        }
        
        int soma = 0;
        for(int i = 1 ; i <= n ; i++){
            soma += i;
        }
        System.out.println(soma);
    }
}
