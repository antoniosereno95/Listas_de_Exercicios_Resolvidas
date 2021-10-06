
package Lista_08_repetiçao_2;

import java.util.Scanner;
public class exercicio_03 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       /*
       Implemente um programa que receba do usuário valores inteiros e
       positivos e que calcule e exiba o maior e o menor valor do conjunto. 
       Considere que:
        • Para encerrar a entrada de dados, deve ser digitado o valor zero;
        • Para valores negativos, deve ser emitida uma mensagem informando 
       que só serão aceitos números positivos;
        • Os valores negativos ou iguais a zero não entrarão nos cálculos.
       */
       int numero;
       int maior = 0 , menor = 999999999;
        System.out.println("Digite os numeros(*maiores que zero):");
       do{
           
           numero = input.nextInt();
           
           if(numero != 0){
                if(numero < 0){

                    do{
                        System.out.println("numero invalido, tente novamente.");
                        numero = input.nextInt();
                    }while(numero < 0);

                }

                if(numero > maior){
                    maior = numero;

                }
                if(numero < menor){
                    menor = numero;

                }
           }
           
       }while(numero != 0);
       
        System.out.println("O maior numero foi "+maior+" , e o menor foi "+menor+" .");
       
    }
}
