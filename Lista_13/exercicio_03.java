
package Lista_13;

import java.util.Scanner;
public class exercicio_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double numero1 , numero2 , numero3;
        double[] MM = new double[2];
        
        System.out.println("digite o primeiro numero: ");
        numero1 = input.nextDouble();
        System.out.println("digite o segundo numero: ");
        numero2 = input.nextDouble();
        System.out.println("digite o terceiro numero: ");
        numero3 = input.nextDouble();
        
        MM = MaiorMenor(numero1 , numero2 , numero3);
        
        System.out.println("O maior numero digitado foi o "+MM[1]+", e o menor numero digitado foi o "+MM[0]+".");
        
    }
    public static double[] MaiorMenor(double numero1 , double numero2 , double numero3){
        double maior = 0, menor = 0;
        double[] mm = new double[2];
        
        if(numero1 > numero2 && numero1 > numero3){
            maior = numero1;
            if(numero2 < numero3){
                menor = numero2;
            }else{
                menor = numero3;
            }
        }
        if(numero2 > numero1 && numero2 > numero3){
            maior = numero2;
            if(numero1 < numero3){
                menor = numero1;
            }else{
                menor = numero3;
            }
        }
        if(numero3 > numero1 && numero3 > numero2){
            maior = numero3;
            if(numero1 < numero2){
                menor = numero1;
            }else{
                menor = numero2;
            }
        }
        
        mm[0] = menor;
        mm[1] = maior;
        
        return mm;
    }
}
