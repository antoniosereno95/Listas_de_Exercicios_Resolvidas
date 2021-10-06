
package Lista_04_condicionais_1;

import java.util.Scanner;
public class exercicio_04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m , n , maior =0 ;
        
        m = input.nextInt();
        n = input.nextInt();
        
        if(m>n){
            maior = m ;
        }else if(n>m){
            maior = n;
        }else if(m == n){
            System.out.println("os numeros sao iguais.");
        }
        
        if(m!=n){
            System.out.println("o maior numero digitado é "+maior);
        }
        
    }
}
