
package Lista_16_recursividade;

import java.util.Scanner;
public class exercicio_06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um numero:");
        int n = input.nextInt();
        
        Piramide(n);
        
    }
    public static void Piramide( int n ){
        if( n > 0){
            Piramide(n-1);
            Serie(n);
            System.out.println("");
        }
    }
    public static void Serie( int k ){
        if( k > 0 ){
            Serie(k - 1);
            System.out.print(k + " ");
        }
    } 
}
