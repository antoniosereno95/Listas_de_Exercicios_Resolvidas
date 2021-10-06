package Lista_06_condicionais_3;

import java.util.Scanner;
public class exercicio_01 {
    public static void main(String[] args){
        Scanner input = new  Scanner(System.in);
        
        System.out.println("digite um numero:");
        double numero;
        numero = input.nextDouble();
        
        if(numero >=1 && numero <=9){
           System.out.println("O valor está dentro da faixa permitida.");
        }else{
           System.out.println("O valor não está dentro da faixa permitida.");
        }
        
    }
}
