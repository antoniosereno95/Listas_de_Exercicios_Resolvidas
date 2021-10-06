
package Lista_02;

import java.util.Scanner;
import java.lang.Math;
public class exercicio_C {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double altura;
        double diametro;
        double cilindro;
        double raio;
        double area_base;
        double area_corpo;
        double area_t;
        double litros_tinta;
        double latas;
        double latas_aredondado;
        double preço_total;
                
        diametro= input.nextDouble(); //4
        altura = input.nextDouble(); //1
        cilindro = input.nextDouble();//2
        
        raio = diametro/2; //2
        area_base = 3.14 * raio * raio; //12,56
        area_corpo = diametro * altura; //4
        
        area_t = area_corpo + 2*area_base; //29,12
        
        litros_tinta = area_t/3; //9,71
        
        latas = litros_tinta/5; //1,94
        
        System.out.println(latas);
        
        latas_aredondado = Math.round(latas); //2
        
        if(latas > latas_aredondado){
            latas_aredondado = latas_aredondado + 1;
        }
        System.out.println(latas_aredondado);
        
        preço_total  = latas_aredondado * 45; //90
        
        System.out.println("RS " + preço_total);
        
    }
}
