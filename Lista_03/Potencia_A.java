
package Lista_03;

import java.util.Scanner;
public class Potencia_A {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double largura;
        double comprimento;
        double area;
        double potencia;
        
        largura = input.nextDouble();
        comprimento = input.nextDouble();
        
        area = largura * comprimento;
        
        potencia = area * 18;
        
        System.out.println(potencia);
    }
}
