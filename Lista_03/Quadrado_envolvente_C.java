
package Lista_03;

import java.util.Scanner;
public class Quadrado_envolvente_C {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x1;
        double y1;
        double x4;
        double y4;
        double lado;
        double raio;
        double c1;
        double c2;
        
        System.out.print("digite as coordenadas do ponto superior esquerdo(x ,enter, y): ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.print("digite as coordenadas do ponto inferior direito(x ,enter, y): ");
        x4 = input.nextDouble();
        y4 = input.nextDouble();
        
        lado = y1 - y4;
        
        raio = (y1 - y4)/2;
        
        c1 = x4 - raio;
        c2= y1 - raio;
        
        System.out.println(raio + "  " +  "(" + c1 + "," + c2 + ")");
    }
}
