
package Lista_01;

import java.util.Scanner;
// esssa funçao importa o scanner em java
public class Area_Do_Triangulo {
    
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        //esse é o ponteiro que aponta para a funçao scanner
        
        double base;
        double altura;
        double area;
        
        System.out.print("digite a altura do triangulo: ");
        altura = leitor.nextDouble();
        
        System.out.print("digite a base do triangulo: ");
        base = leitor.nextDouble();
        
        area = ( base * altura ) / 2;
        
        System.out.println("A area do triangulo eh: " + area);
      
    }
    
}
