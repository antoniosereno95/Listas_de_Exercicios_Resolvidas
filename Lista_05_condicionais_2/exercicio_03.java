
package Lista_05_condicionais_2;

import java.util.Scanner;
public class exercicio_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int h_extra , h_faltou;
        
        System.out.println("digite o numero de horas extras trabalhadas:");
        h_extra = input.nextInt();
        System.out.println("digite o numero de horas que o funcionario faltou:");
        h_faltou = input.nextInt();
        
        double premio = h_extra - (2/3)*h_faltou;
        
        if(premio > 40){
            System.out.println("O funcionário receberá R$200 de gratificação de Natal.");
        }else if(premio > 30 && premio <= 40){
            System.out.println("O funcionário receberá R$175 de gratificação de Natal.");
        }else if(premio > 20 && premio <= 30){
            System.out.println("O funcionário receberá R$150 de gratificação de Natal.");
        }else if(premio > 10 && premio <= 20){
            System.out.println("O funcionário receberá R$125 de gratificação de Natal.");
        }else if(premio <= 10){
            System.out.println("O funcionário receberá R$100 de gratificação de Natal.");
        }
        
    }
}
