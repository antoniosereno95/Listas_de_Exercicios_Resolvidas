
package Lista_05_condicionais_2;

import java.util.Scanner;
public class exercicio_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float a , b , c;
        double raiz1, raiz2, delta;
        
        System.out.println("digite o A da equaçao,AX2+BX+C=0:");
        a = input.nextFloat();
        System.out.println("digite o B da equaçao,AX2+BX+C=0:");
        b = input.nextFloat();
        System.out.println("digite o C da equaçao,AX2+BX+C=0:");
        c = input.nextFloat();
        
        delta = Math.pow( b , 2 ) -(4*a*c);
        
        if(delta < 0){
            System.out.println("A equaçao nao apresentas raizes reais.");
        }else if(delta == 0){
            raiz1 = (-b)/(2*a);
            System.out.printf("a equaçao apresenta duas raizes reais iguais de valor %.2f",raiz1);
        }else if(delta > 0){
            raiz1 = (-b + Math.sqrt(delta))/2*a;
            raiz2 = (-b - Math.sqrt(delta))/2*a;
            System.out.printf("a equaçao apresenta duas raizes reais de valor %.2f e %.2f ",raiz1 , raiz2);
        }
        
        
        
    }    
}
