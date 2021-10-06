
package Lista_16_recursividade;

import java.util.Scanner;
public class exercicio_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        Implemente um procedimento recursivo que receba um
        número inteiro, par e positivo N e imprima todos os
        números pares de 0 até N em ordem decrescente. 
        Escreva um programa para solicitar ao usuário o valor de N. 
        O programa deverá forçar que o valor de N seja 
        maior que zero e par.
        */
        System.out.println("digite um numero par:");
        int n = input.nextInt();
        while( n<=0 || n%2!=0 ){
            System.out.println("numero invalido, o numero deve ser maior que zero e tbm deve ser PAR.");
            n = input.nextInt();
            
        }
        
        imprime(n);
        
    }
    public static void imprime(int n){
        if(n >= 0){
            System.out.print(n +" ");
            imprime(n-2);
        }
        
    }
    
}
