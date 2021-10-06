
package Lista_10_repetiçao_4;

import java.util.Scanner;
public class exercicio_06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        6 - Implemente um programa para ler N números inteiros maiores 
        que zero e calcular e exibir a soma dos números lidos. 
        No programa, N (que representa a quantidade de números a 
        serem lidos) é um valor informado pelo usuário.
        OBS: Para ser válido, N deve ser maior que zero. O programa
        deve forçar que o usuário informe um valor de N válido.
        */
        
        //nao sei se essa erra a questao ou eu interpretei errado =)
       
        int n ;
        System.out.println("Digite um numero de numeros a serem digitados:");
        n = input.nextInt();
        if(n <= 0){
            do{
                System.out.println("erro, tente novamente.");
                n = input.nextInt();
            }while(n <= 0);
        }
        
        int soma = 0;
        for(int i = 1 ; i <= n ; i++){
            
        System.out.println("Digite o numero "+i+":");
        int k;
        k = input.nextInt();
        if(k <= 0){
            do{
                System.out.println("erro, tente novamente.");
                k = input.nextInt();
            }while(k <= 0);
        } 
        
        soma += k;
        
        }
        System.out.println(soma);
        
    }
}
