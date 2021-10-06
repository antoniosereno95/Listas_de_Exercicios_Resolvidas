
package Lista_16_recursividade;

import java.util.Scanner;
public class exercicio_04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        Defina um procedimento recursivo para, dado um número natural n, 
        imprimi-lo em base binária. Escreva um programa para solicitar 
        ao usuário o valor de n. O programa deverá forçar que o valor 
        de n seja maior ou igual a um.
        */ 
        
        System.out.println("digite um numero inteiro:");
        int n = input.nextInt();
        while(n<=1){
            System.out.println("o numero deve ser maior igual a 1");
            n = input.nextInt();
            
        }
        
        Binario(n);
        
    }
    public static void Binario(int n){
       
        if( n/2 != 0 ){
            Binario(n/2);
            
        }
        System.out.print( n%2 + " " );
    }
        
}
