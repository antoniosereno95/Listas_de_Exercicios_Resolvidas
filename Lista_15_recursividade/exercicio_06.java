
package Lista_15_recursividade;

import java.util.Scanner;
public class exercicio_06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        Escreva uma função recursiva, 
        public static int somaSerie (int i, int j, int k), 
        que calcula e retorna a soma da série de valores do 
        intervalo fechado [i,j], com incremento k. 
        Ex.: somaSerie (3, 12, 2) irá retornar 35 (3 + 5 + 7 + 9 + 11). 
        Implemente um programa para solicitar ao usuário 
        o valor de i, j e k. O programa deverá forçar que os
        valores de i e k sejam maiores ou igual a um. 
        E j seja maior que i.
        */
        
        int i, j , k;
        System.out.println("Em um intervalo fechado [i,j] com encremento k");
        System.out.println("Digite um valor para i:");
        i = input.nextInt();
        while(i<=0){
            System.out.println("o valor de i deve ser maior ou igual a 1, tente novamente.");
            i = input.nextInt();
        }
        System.out.println("digite um valor para j:");
        j = input.nextInt();
        while( j<i || j<=0 ){
            System.out.println("o valor de j deve ser maior ou igual a 1 e maior que o valor de 'i', tente novamente.");
            j = input.nextInt();
        }
        System.out.println("Digite um valor para k:");
        k = input.nextInt();
        while(i<=0){
            System.out.println("o valor de k deve ser maior ou igual a 1, tente novamente.");
            k = input.nextInt();
        }
        
        int soma;
        
        soma = somaSerie(i , j , k);
        
        System.out.println(soma);
       
        
    }
     public static int somaSerie (int i, int j, int k){
         if(i <= j){
             return  i + somaSerie( i+k , j , k);
         }else{
             return  0;
         }
         
     }
     
}
