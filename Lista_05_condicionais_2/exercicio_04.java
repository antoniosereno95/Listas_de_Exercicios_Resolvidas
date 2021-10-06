
package Lista_05_condicionais_2;

import java.util.Scanner;
public class exercicio_04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double sal;
        double novo_sal;
        double dif;
        double aumento;
        
        System.out.println("digite o salario atual do jogador:");
        sal = input.nextDouble();
        
        if(sal<=1900){
            aumento = 20;
            dif = (aumento/100)*sal;
            novo_sal = sal + sal*(aumento/100);
            System.out.printf("O jogador terá aumento de R$ %.2f e passará a receber R$ %.2f .\n",dif , novo_sal);
        }else if(sal >1900 && sal <=3300){
            aumento = 15;
            dif = (aumento/100)*sal;
            novo_sal = sal + sal*(aumento/100);
            System.out.printf("O jogador terá aumento de R$ %.2f e passará a receber R$ %.2f .\n",dif , novo_sal);
        }else if(sal >3300 && sal<=5800){
            aumento = 10;
            dif = (aumento/100)*sal;
            novo_sal = sal + sal*(aumento/100);
            System.out.printf("O jogador terá aumento de R$ %.2f e passará a receber R$ %.2f .\n",dif , novo_sal);
        }else if(sal > 5800){
            aumento = 5;
            dif = (aumento/100)*sal;
            novo_sal = sal + sal*(aumento/100);
            System.out.printf("O jogador terá aumento de R$ %.2f e passará a receber R$ %.2f .\n",dif , novo_sal);
        }
        
    }
}
