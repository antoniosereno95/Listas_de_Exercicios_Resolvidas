
package Lista_14;

import java.util.Scanner;
public class exercicio_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        3 - Dois números inteiros são ditos primos entre si
        quando não existir um divisor maior do que 1 (um) que 
        divida ambos. Isto significa que o máximo divisor comum 
        dos primos entre si é igual a 1. Por exemplo, 12 e 13 são
        primos entre si; porém, 12 e 14 não o são porque ambos 
        são divisíveis por 2. Implemente uma função que receba 
        como parâmetro dois números inteiros positivos, ou seja, 
        maiores que zero, e decida se os números dados são primos 
        entre si. A função deve retornar true, se os números 
        forem primos entre si. Caso contrário, ela deve retornar 
        false. Implemente também o programa principal (main) que 
        utilizará a função. Os valores dos dois números devem ser
        fornecidos pelo usuário e validados no programa principal
        e a exibição do resultado também deve ocorrer no programa
        principal. OBS: O usuário poderá testar quantos números 
        desejar.
        */
        char resposta = 0;
        do{
           
            System.out.println("PRIMOS ENTRE SI");
            System.out.println("Digite o primeiro numero:");
            int numb1 = input.nextInt();
            System.out.println("Digite o segundo numero:");
            int numb2 = input.nextInt();
            
            boolean primos = PrimosEntreSi(numb1,numb2);
            
            if(primos == true){
                System.out.println("Os numeros sao primos entre si.");
            }else{
                System.out.println("Os numeros não sao primos entre si.");
            }
            
            System.out.println("\ndeseja continuar o programa?(S/N)");
            resposta = input.next().charAt(0);
            while(resposta != 'S' && resposta != 'N'){
                System.out.println("entrada invalida, tente novamente(S/N).");
                resposta = input.next().charAt(0);
            }
            System.out.print("\n");
        }while(resposta == 'S');
    }
    public static boolean PrimosEntreSi(int numb1 , int numb2){
        boolean resp = true;
        int maior , chave = 0;
        
        if(numb1 > numb2){
            maior = numb1;
        }else{
            maior = numb2;
        }
        
        for(int i = 2; i < maior ; i++){
            if(numb1%i == 0 && numb2%i == 0){
                chave = 1;
            }
        }
        
        if(chave == 1){
            resp = false;
        }
        
        return resp;
    }
}
