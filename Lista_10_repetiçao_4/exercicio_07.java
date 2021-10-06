
package Lista_10_repetiçao_4;

import java.util.Scanner;
public class exercicio_07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        7 – Implemente um programa que solicite ao usuário 
        dois números inteiros. O programa deve forçar que o usuário 
        informe um segundo número maior que o primeiro. O programa 
        deve calcular e exibir:
        
            • A soma dos números pares do intervalo de números dado,
                    incluindo os números digitados;
            • O produto dos números ímpares desse intervalo, 
                    incluindo os números digitados.
        */
        
        int j , k ;
        
        System.out.println("digite o numero 1:");
        j = input.nextInt();
        if( j <= 0 ){
            do{
                System.out.println("erro! o numero precisa ser maior que 0.");
                j = input.nextInt();
            }while( j <= 0 );
        }
        
        System.out.println("digite o numero 2:");
        k = input.nextInt();
        if( k <= j ){
            do{
                System.out.println("erro! o numero 2 precisa ser maior que o numero 1.");
                k = input.nextInt();
            }while( k <= j );
        }
        
        int soma = 0 , produto = 1;
        for( int i = j ; i <= k ; i ++){
            
            soma += i;
            produto *= i;
            
        }
        
        System.out.println("soma = "+soma);
        System.out.println("produto = "+produto);
        
    }
}
