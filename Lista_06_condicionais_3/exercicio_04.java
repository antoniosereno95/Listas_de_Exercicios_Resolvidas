
package Lista_06_condicionais_3;

import java.util.Scanner;
public class exercicio_04 {
    public static void main(String[] args){
        Scanner input = new  Scanner(System.in);
        
        int idade;
        double peso;
        double cada_gota_mg = 25; //mg
        int numb_gotas = 0;
        
        System.out.println("digite a idade do paciente:");
        idade = input.nextInt();
        System.out.println("digite o peso do paciente:");
        peso = input.nextDouble();
        
        if(idade >= 12){
            if(peso >= 60.0){
                numb_gotas = (int) (1000 / cada_gota_mg);
            }else if(peso < 60.0){
                numb_gotas = (int) (875 / cada_gota_mg);
            }
        }else if(idade < 12){
            if(peso >= 5.0 && peso <=9.0){
                numb_gotas = (int) (125 / cada_gota_mg);
            }
            if(peso >= 9.1 && peso <= 16.0){
                numb_gotas = (int) (250 / cada_gota_mg);
            }
            if(peso >= 16.1 && peso <=24.0 ){
                numb_gotas = (int) (375 / cada_gota_mg);
            }
            if(peso >= 24.1 && peso <= 30.0 ){
                numb_gotas = (int) (500 / cada_gota_mg);
            }
            if(peso > 30.0){
                numb_gotas = (int) (750 / cada_gota_mg);
            }
        }
        
        System.out.println("O paciente em questao tera de tomar "+numb_gotas+" gotas do remedio prescrito.");
        
    }
}
