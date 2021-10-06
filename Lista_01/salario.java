
package Lista_01;

import java.util.Scanner;

public class salario {

public static void main(String[] args){
    Scanner scanf = new Scanner(System.in);
    
    double salario_minimo , horas_trabalhadas , num_dependentes , horas_extras;
    double valor_hora_trabalhada, valor_hora_extra , salario_mes , salario_familia, salario_bruto , irrf , salario_liquido;
    
    System.out.print("digite o salario minimo: ");
    salario_minimo = scanf.nextDouble();
    
    System.out.print("digite o total de horas trabalhadas: ");
    horas_trabalhadas = scanf.nextDouble();
    
    System.out.print("digite o numero de dependentes: ");
    num_dependentes = scanf.nextDouble();
    
    System.out.print("digete a quantdade de horas extras trabalhadas: ");
    horas_extras = scanf.nextDouble();
    
    valor_hora_trabalhada = salario_minimo / 10;
    
    valor_hora_extra = (3 * valor_hora_trabalhada) / 2;
    
    salario_mes = valor_hora_trabalhada * horas_trabalhadas;
    
    salario_familia = salario_minimo * (5/100);
    
    salario_bruto = salario_mes + (valor_hora_extra * horas_extras) + (salario_familia * num_dependentes);
    
    irrf = (salario_bruto * 10) / 100;
    
    salario_liquido = salario_bruto - irrf;
    
    
    System.out.println(salario_liquido);
    
}

}