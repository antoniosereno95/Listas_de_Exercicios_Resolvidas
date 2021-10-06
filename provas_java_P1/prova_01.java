
package provas_java_P1;
import java.util.Scanner;
public class prova_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double  t , taxa;
        double valor;
        double meses;
        double valor_acumulado;
        
        System.out.println("digite a taxa mensal de rendimento do banco:(digite o numero inteiro da porcentagem e iremos fazer os calculos para facilitar sua vida =)) ");
        t = input.nextInt();
        taxa = t/100;
        
        System.out.println("por quantos meses a aplicaçao ira render: ");
        meses = input.nextInt();
        
        System.out.println("digite valor mensal que sera retirado automaticamente todo mes pelo banco: ");
        valor = input.nextDouble();
        
        valor_acumulado = valor * ( (Math.pow((1+taxa),meses) - 1) / taxa );
        
        System.out.println("O valor acumulado depois de "+meses+" meses, aplicando "+valor+" reais por mes a uma taxa de rendimento de "+t+" por cento ao mes, foi de: "+valor_acumulado+" .");
    }
}


