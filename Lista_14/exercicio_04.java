
package Lista_14;

import java.util.Scanner;
public class exercicio_04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        4 - A sequência abaixo é conhecida como série de Fibonacci 
        e é muito utilizada no mercado financeiro e em aplicações 
        computacionais. Implemente um programa para solicitar ao 
        usuário um número inteiro N > 1 e chamar um procedimento 
        que irá exibir a série de Fibonacci até o seu N-ésimo termo. 
        O procedimento deverá receber N como parâmetro.
        Série de Fibonacci: 1,1,2,3,5,8,13,21,34,55,…
        OBS: O programador poderá definir outros procedimentos e/ou
        funções caso julgue necessário.
        */
        System.out.println("Digite o numero de termos que deseja que sejam impressos da serie de Fibonacci:");
        int numero = input.nextInt();
        while(numero < 1){
            System.out.println("entrada invalida, o numero deve ser maior que 1.");
            numero = input.nextInt();
        }
        Fibonacci(numero);
    }
    public static void Fibonacci(int numb){
        int a = 1 , b = 0 , aux;
        for(int i = 0 ; i < numb ; i++){
            System.out.print( a + " ");
            aux = a;
            a = a + b;
            b = aux;
        }
    }    
}
