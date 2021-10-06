
package Lista_10_repetiçao_4;

import java.util.Scanner;
public class exericio_08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        8 – O fatorial de um número inteiro é definido segundo a 
        regra abaixo:
                    |-
                   |   1, se N = 0 ou N = 1
        Fatorial -|    (N) = N * (N-1) * (N-2) * ... * 2 * 1, se N > 1
                   |   Não existe, se N < 0 
                    |-
        Implemente um programa para ler um número inteiro qualquer e
        calcular e exibir o seu fatorial, se ele existir.          
        */          
        
        int fatorial;
        
        System.out.println("digite o numero:");
        fatorial = input.nextInt();
        
        if(fatorial > 1){
            
            for(int i = (fatorial-1) ; i > 0 ; i--){
                fatorial *= i;
            }
            
        }else if( fatorial == 0 || fatorial == 1){
            
            fatorial = 1;
            
        }else{
            
            fatorial = -1;
            
        }
        
        if(fatorial > 0){
            System.out.println("fatorial = "+fatorial);
        }else{
            System.out.println("fatorial nao existe");
        }
        
        
    }
}
