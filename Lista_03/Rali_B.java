
package Lista_03;

import java.util.Scanner;
public class Rali_B {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double velocidade;
        double distancia;
        double tempo;
        int minutos;
        int horas;
        int segundos;
        
        distancia = input.nextDouble();
        velocidade = input.nextDouble();
        
        tempo = distancia / velocidade;
        
        horas = (int)tempo;
        
        minutos = (int)(tempo*60 - horas*60);
        
        segundos = (int)(tempo*60*60 - horas*60*60 - minutos*60);
        
        System.out.println(horas + ":" + minutos + ":" + segundos + ".");
    }
}
