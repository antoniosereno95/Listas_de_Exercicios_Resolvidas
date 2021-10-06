
package Lista_16_recursividade;

import java.util.Scanner;
public class exercicio_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        Pode-se calcular o resto da divisão, MOD, de x por y, 
        dois números inteiros positivos, 
        usando-se a seguinte definição:
        
        MOD(x,y) = MOD(x - y, y) se x > y
        MOD(x,y) = x se x < y
        MOD(x,y) = 0 se x = y
        
        Implemente um programa para ler dois números inteiros (x e y) 
        e calcular x MOD y. Para o cálculo do MOD, 
        o programa deve utilizar uma função recursiva.
        */
        
        System.out.println("digite um valor para x: (x%y)");
        int x = input.nextInt();
        
        System.out.println("digite um valor para y: (x%y)");
        int y = input.nextInt();
        while(y==0){
            System.out.println("y deve ser diferente de zero pois nao se pode dividir um numero inteiro por ZERO");
            y = input.nextInt();
        }
        
        int res = MOD(x,y);
        System.out.println(res);
        
    }
    public static int MOD(int x , int y){
        
        if(x > y){
            return MOD(x-y , y);
            
        }else if(x < y){
            return x;
            
        }else{
            return 0;
            
        }
        
    }
}
