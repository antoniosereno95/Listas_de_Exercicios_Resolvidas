
package provas_java_P1;

import java.util.Scanner;
public class prova_04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // a tem que ser forçado a ser DIFERENTE de zero
        System.out.println("EQUAÇAO DO SEGUNDP GRAU");
        System.out.println(" ax2 + bx + c ");
        
        double a , b , c;
        System.out.println("digite um valor para a:");
        a = input.nextDouble();
        while(a == 0){
            System.out.println("o valor de 'a' deve ser diferente de zero, tente novamente.");
            a = input.nextDouble();
        }
        
        System.out.println("digite um valor para b:");
        b = input.nextDouble();
        
        System.out.println("digite um valor para c:");
        c = input.nextDouble();
        
        double delta = Delta(a , b , c);
        if(delta < 0){
            System.out.println("a equaçao nao apresenta raizes reias.");
            
        }else{
            Raiz(a , b , c , delta);
        }
    }
    public static double Delta(double a , double b , double c){
        double delta = 0;
        double b_pow = 0;
        
        b_pow = Math.pow(b, 2);
        delta = b_pow - 4*c*a;
        
        return delta;
    }
    public static void Raiz(double a , double b , double c , double delta){
        double raiz1 , raiz2;
        
        raiz1 = ( -b + Math.sqrt(delta) )/(2*a);
        
        raiz2 = ( -b - Math.sqrt(delta) )/(2*a);
        
        if(raiz1 == raiz2){
            System.out.println("A equaçao apresenta uma unica raiz real igual a "+raiz1);
            
        }else{
            System.out.println("A equaçao apresenta duas raizes reias a qual a primeira tem valor igual a "+raiz1+" ,e a segunda tem valor iguala a "+raiz2);
            
        }
    }
    
}
