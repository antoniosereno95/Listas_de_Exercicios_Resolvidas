
package Lista_13;

import java.util.Scanner;
public class exercicio_04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double numero1 , numero2 , numero3;
        double[] MM = new double[3];
        
        System.out.println("digite o primeiro numero: ");
        numero1 = input.nextDouble();
        System.out.println("digite o segundo numero: ");
        numero2 = input.nextDouble();
        System.out.println("digite o terceiro numero: ");
        numero3 = input.nextDouble();
        
        MM = MaiorMenor(numero1 , numero2 , numero3);
        
        System.out.println("O menor numero digitado foi o "+MM[0]+", o valor mediano foi o "+MM[1]+" e o maior numero digitado foi o "+MM[2]);
        
    }
    public static double[] MaiorMenor(double numero1 , double numero2 , double numero3){
        double maior = 0, menor = 0, mediano = 0;
        double[] mm = new double[3];
        
        if(numero1 > numero2 && numero1 > numero3){
            maior = numero1;
            if(numero2 < numero3){
                menor = numero2;
                mediano = numero3;
            }else{
                menor = numero3;
                mediano = numero2;
            }
        }
        if(numero2 > numero1 && numero2 > numero3){
            maior = numero2;
            if(numero1 < numero3){
                menor = numero1;
                mediano = numero3;
            }else{
                menor = numero3;
                mediano = numero1;
            }
        }
        if(numero3 > numero1 && numero3 > numero2){
            maior = numero3;
            if(numero1 < numero2){
                menor = numero1;
                mediano = numero2;
            }else{
                menor = numero2;
                mediano = numero1;
            }
        }
        
        mm[0] = menor;
        mm[1] = mediano;
        mm[2] = maior;
        
        return mm;
    }
}
