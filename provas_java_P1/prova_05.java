
package provas_java_P1;

import java.util.Scanner;
public class prova_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        Implemente um programa para calcular o produto dos números inteiros 
        no intervalo de A até B. A e B são números inteiros. 
        O valor de A deve ser maior que zero e o valor de B deve ser 
        maior que o valor de A.

        Exemplo: Se A = 2 e B = 10, então o valor gerado será o 
        produto 2 x 3 x 4 x 5 x 6 x 7 x 8 x 9 x 10 = 3.628.800

        O programa a ser implementado deverá ser composto pelos seguintes 
        métodos:
        (i) O método main que irá solicitar ao usuário os valores de A e B. 
        O main deverá forçar que o usuário forneça valores válidos para A e B. 
        O main deverá chamar a função definida no item (ii) para calcular 
        o produto dos números inteiros no intervalo de A até B. 
        O main deverá exibir o resultado fornecido pela função.
        (ii) Uma função que deverá receber como parâmetro o início 
        e o fim de um intervalo. Esta função deverá calcular e 
        retornar o produto dos números inteiros no intervalo fornecido.
        */
        System.out.println("digite um valor para A, no intervalo fechado [A:B]:");
        int a = input.nextInt();
        while(a <= 0){
            System.out.println("valor invalido, a deve ser miao que ZERO, tente novamente");
            a = input.nextInt();
        }
        System.out.println("digite um valor para B:([A:B])");
        int b = input.nextInt();
        while(b < a){
            System.out.println("o valor de B deve ser menor que o valor de A, tente novamente");
            b = input.nextInt();
        }
        
        int res = ImprimeMult(a,b);
        System.out.println(res);
        
    }    
    public static int ImprimeMult(int a , int b){
        if(a <= b){
           
            return a * ImprimeMult(a+1, b);
        }else {
            return 1;
        }
    }
}
