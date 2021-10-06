
package Lista_02;

import java.util.Scanner;
public class exercicio_A {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double nota1;
        double nota2;
        double nota3;
        double nota_f;
        
        nota1 = input.nextDouble();
        nota2 = input.nextDouble();
        nota3 = input.nextDouble();
        
        nota_f = (3*nota1 + nota2*2 + nota3*5)/10;
        
        System.out.println(nota_f);
    }
}
