
package Lista_01;

import java.util.Scanner;

public class Litros_De_Combustivel {
    
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        double consumo_conbustivel;
        double tempo_de_viajem;
        double velocidade_media;
        double distancia;
        double quilometros_por_litro;
        
        consumo_conbustivel = 0;
        distancia = 0;
        
        System.out.print("qual o consumo em quilometros por litro do carro? ");
        quilometros_por_litro = leitor.nextDouble();
        
        System.out.print("qual foi o tempo de viajem em horas? ");
        tempo_de_viajem = leitor.nextDouble();
        
        System.out.print("qual foi a velocidade media durante a viajem? ");
        velocidade_media = leitor.nextDouble();
        
        distancia = velocidade_media * tempo_de_viajem ;
        
        consumo_conbustivel = distancia / quilometros_por_litro;
        
        System.out.println("o consumo de conbustivel durante a viajem foi de " + consumo_conbustivel );
        
        
       
    }
    
}
