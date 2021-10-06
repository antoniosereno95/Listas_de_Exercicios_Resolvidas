
package Lista_15_recursividade;

import java.util.Scanner;
public class exercicio_04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        Escreva um procedimento recursivo, public static void 
        imprimeCrescente (int n), que
        exibe na tela os números inteiros positivos menores ou
        iguais a n. Ex.:
        imprimeCrescente (5) irá exibir os números 1, 2, 3, 4, 5.
        Implemente um programa
        (mian) para solicitar ao usuário o valor de n e exibir 
        a sequência de números
        correspondentes utilizando o procedimento imprimeCrescente. 
        O programa deverá forçar que o valor de n seja maior 
        ou igual a um.
        */
        
        int n;
        System.out.println("DIGITE UM NUMERO INTEIRO:");
        n = input.nextInt();
        
        ImprimeCrescente(n);
        
    }
    public static void ImprimedeCrescente(int n){
        int k = 0;
        if(k == n){
            System.out.print(n+".");
            
        }else{
            System.out.print(k + " ");
            ImprimedeCrescente(k + 1);
        }
    }
    
    public static void ImprimeCrescente(int n){
        if(n>0){
           ImprimeCrescente(n-1);
            /* colocando a recursividade antes do printf o programa 
            cria uma pilha de processos e so depois que a pilha acabar vem 
            a ser processado o printf, esete fazendo o caminho inverso e 
            impriminto "ao contrario" que nesse caso se torna de forma 
            crescente.
            */
           System.out.println(n + " ");
        }
    }
    
}
