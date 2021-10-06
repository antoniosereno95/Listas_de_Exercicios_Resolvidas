
package Lista_16_recursividade;

import java.util.Scanner;
public class exercicio_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        Escreva um procedimento recursivo, 
        public static void imprimeSerie (int i, int j, int k), 
        que imprime na tela a série de valores do intervalo [i,j], 
        com incremento k. Ex.: imprimeSerie (3, 12, 2) irá exibir 
        os números 3, 5, 7, 9, 11. 
        Escreva um programa para solicitar ao usuário o 
        valor de i, j e k. O programa deverá forçar que os
        valores de i, j e k sejam maiores ou igual a um.
        E j seja maior que i.
        */
       
        System.out.println("digite um valor de i:");
        int i = input.nextInt();
        while(i<1){
            System.out.println("valor invalido, digite um valor igual ou maior que 1.");
            i = input.nextInt();
        }
        
        System.out.println("digite um valor de j:");
        int j = input.nextInt();
        while(j<1 || j<i){
            System.out.println("valor invalido, digite um valor igual ou maior que 1e maior que o valor digitado para 'i'.");
            j = input.nextInt();
        }
        
        System.out.println("digite um valor de k:");
        int k = input.nextInt();
        while(k<1){
            System.out.println("valor invalido, digite um valor igual ou maior que 1.");
            k = input.nextInt();
        }
        
        imprimeSerie ( i,  j,  k);
        
    }
    public static void imprimeSerie (int i, int j, int k){
        if( i <= j ){
            
            System.out.print(i +" ");
            imprimeSerie( i+k ,  j,  k);
        }
    }
    
}
