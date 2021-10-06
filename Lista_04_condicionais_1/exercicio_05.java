
package Lista_04_condicionais_1;

import java.util.Scanner;
public class exercicio_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a , b ;
        double raiz;
        
        do{
            a = input.nextInt();
        }while(a==0);
        b = input.nextInt();
        
        raiz = (-b)/a;
        
        System.out.println("a raiz da equaçao é "+ raiz +"\n\n");
        System.out.printf(" %.2f\n", raiz);
    }
}
