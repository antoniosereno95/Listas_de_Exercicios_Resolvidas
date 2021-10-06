
package Lista_06_condicionais_3;

import java.util.Scanner;
public class exercicio_02 {
    public static void main(String[] args){
        Scanner input = new  Scanner(System.in);
        double qw; //quilowatt
        System.out.println("digite o numero de quilowatts usados no mes em questao:");
        qw = input.nextDouble();
        
        double conta = 0;
        double taxa = 3.5;
        
        if( qw < 10.0 ){
            conta = 7 + taxa;
        }else if( qw >= 10.0 ){
            conta = (qw * 1.4) + taxa;
        }
        
        System.out.printf("o valor da sua conta de energia deste mes totaliza um valor igual a: %.2f.\n" , conta);
        
    }
}
