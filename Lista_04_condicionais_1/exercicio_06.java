
package Lista_04_condicionais_1;

import java.util.Scanner;
public class exercicio_06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double sal_minimo;
        System.out.println("qual o valor do salario minimo?");
        sal_minimo = input.nextInt();
        
        double valor_hora_trab = sal_minimo*5/100;
        
        int quant_horas;
        System.out.println("qual o montante de horas trabalhadas no mes?");
        quant_horas = input.nextInt();
        
        double salario_bruto = quant_horas * valor_hora_trab;
        double salario_liquido;
        double imposto = salario_bruto*7.5/100;
        if(salario_bruto > 1500.0){
            salario_liquido = salario_bruto - imposto;
        }else{
            salario_liquido = salario_bruto;
        }
        
        System.out.println("salario bruto:"+salario_bruto+"\nimposto descontado: "+imposto+"\nsalario_liquido: "+salario_liquido);
        
    }
}
