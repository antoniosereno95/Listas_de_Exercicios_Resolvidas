
package Lista_02;

import java.util.Scanner;
public class exercicio_B {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double diametro;
        double altura;
        double volume;
        double raio;
        double resp;
        
        diametro = input.nextDouble();
        altura = input.nextDouble();
        
        raio = diametro/2;
        
        System.out.println(raio);
        
        volume = altura * 3.14 * raio * raio;
        
        System.out.println(volume + " 10^6");
        
        resp = volume * 1000 * 1000;
        
        System.out.println(resp);
    }
}
