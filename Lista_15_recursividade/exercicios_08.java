
package Lista_15_recursividade;

import java.util.Scanner;
public class exercicios_08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        Implemente um programa para ler dois números X (real) 
        e Y (inteiro e maior ou igual azero) e calcular XY. 
        Para calcular XY, o programa deve utilizar uma função recursiva.
        Lembre-se que:
                         |  1,se Y = 0;
                        |
        POWER (X, Y) - |    X, se Y = 1;
                        |
                         |  X * POWER(X , Y-1);
        */
        
        int x , y ;
        System.out.println("Digite o um valor para X, POWER(X,Y).");
        x = input.nextInt();
        System.out.println("digite um valor para Y:");
        y = input.nextInt();
        while(y < 0){
            System.out.println("valor invalido, Y deve ser maior ou igual a ZERO:");
            y = input.nextInt();
        }
        
        int resultado = POWER(x,y);
        System.out.println(resultado);
        
    }
    public static int POWER(int x , int y){
        int res = 0;
        
        if(y == 0){
            res = 0;
            
        }else if(y == 1){
            res = x;
            
        }else{
            res = x * POWER(x , y-1);
            
        }
        
        return res;
    }
    
}
