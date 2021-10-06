
package Lista_09_repetiçao_3;

import java.util.Scanner;
public class exercicio_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        /*
        2ªQuestão (desafio) - A sequência abaixo é conhecida como série de 
        Fibonacci. A série de Fibonacci tem aplicações na análise de mercados 
        financeiros, na ciência da computação e na teoria dos jogos. Implemente 
        um programa para exibir esta série até o seu trigésimo termo.
        
        Série de Fibonacci: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, …
        */
        
        /*
        algoritimo em c:
        printf("%d, ", numA);
	    num = numA + numB;
	    numB = numA;
	    numA = num;
	    i++;
        */
       
        int num, numA, numB, i;
	
	numA = 1; numB = 0; i = 0;
	while(i < 30){
	    
            System.out.print(numA+", ");
	    num = numA + numB;
	    numB = numA;
	    numA = num;
	    i++;
        }
        
        
    }
}
