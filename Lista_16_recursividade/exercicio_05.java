
package Lista_16_recursividade;

import java.util.Scanner;
public class exercicio_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        Implemente um programa para obter do usuário um número inteiro 
        maior que zero que representa o número de linhas de uma pirâmide. 
        O programa deverá gerar e exibir uma pirâmide de números segundo o
        exemplo abaixo.
        
        Exemplo: Caso o usuário digite o número 5, o programa deverá exibir
        a seguinte pirâmide:
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
        
        OBS: Para exibir a pirâmide, implemente um procedimento recursivo 
        que recebe como parâmetro o número de linhas da pirâmide 
        (informado pelo usuário no main). Dica: Para exibir uma 
        linha da pirâmide, este procedimento deverá chamar um outro 
        procedimento recursivo que exibe os números inteiros de 1 até N,
        onde N é o tamanho da linha.
        */
        System.out.println("Digite um numero:");
        int n = input.nextInt();
        
        Piramide(n);
        
    }
    public static void Piramide( int n ){
        if( n > 0){
            Serie(n);
            System.out.println("");
            Piramide(n-1);
        }
    }
    public static void Serie( int k ){
        if( k > 0 ){
            Serie(k - 1);
            System.out.print(k + " ");
        }
    } 
}
