
package Lista_15_recursividade;

import java.util.Scanner;
public class exercicio_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        Implemente um programa para solicitar ao usuário um número N 
        inteiro e maior que zero e calcular e exibir a soma dos 
        números inteiros de 1 a N. 
        Para calcular a soma, o programa deve utilizar uma função recursiva. 
        Dica: soma (n) = n + soma (n-1).
        */
        int n;
        System.out.println("DIGITE UM NUMERO INTEIRO:");
        n = input.nextInt();
        
        int resultado = Soma(n);
        System.out.println(resultado);
    }
    public static int Soma(int n){
        int soma;
        if(n == 0){
            return 0;
        }else{
            return soma = n + Soma(n-1);
        }
    }
    
}
