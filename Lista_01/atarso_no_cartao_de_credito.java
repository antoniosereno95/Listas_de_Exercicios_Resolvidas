
package Lista_01;

import java.util.Scanner;

public class atarso_no_cartao_de_credito {
    
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        
        double valor_conta , dias_de_atraso , valor_multa_dia , percentual_juros;
        double valor_multa, juros, valor_total_a_pagar;
        
        System.out.print("digite o valor da conta: ");
        valor_conta = scanf.nextDouble();
        
        System.out.print("digite o total de dias de atraso: ");
        dias_de_atraso = scanf.nextDouble();
        
        System.out.print("digite o valor da multa por dia: ");
        valor_multa_dia = scanf.nextDouble();
        
        System.out.print("digite o percentual de juros: ");
        percentual_juros = scanf.nextDouble();
        
        valor_multa = dias_de_atraso * valor_multa_dia;
       
        juros = valor_conta * dias_de_atraso * (percentual_juros / 100);
        
        valor_total_a_pagar = valor_conta + valor_multa + juros;
        
        System.out.println("O valor da multa por " + dias_de_atraso + " dias de atraso eh R$ " + valor_multa + "\nO valor dos juros a ser pago por " + dias_de_atraso + " dias de atraso eh R$ " + juros + "\nO valor total da conta a ser pago ja com multa e juros eh R$ " + valor_total_a_pagar);
        
        
        
                
    }
    
}
