
package Lista_08_repetiçao_2;

import java.util.Scanner;
public class exercicio_02 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       //Implemente um programa para exibir todos os números inteiros positivos 
       //e menores que 500 que quando divididos por 9 deixam resto 4.
       int numero = 0;
        System.out.println("Os numeros sao: ");
       for(int i = 0 ; i < 500 ; i++){
           if(numero%2 == 0 && numero%9 == 4){
               System.out.println(numero+" ");
           }
           numero++;
       }
       
    }   
}
