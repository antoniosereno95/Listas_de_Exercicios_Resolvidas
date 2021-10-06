
package Lista_04_condicionais_1;

import java.util.Scanner;
public class exercicio_07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int ano;
        System.out.println("qual o ano de fabricaçao do carro: ");
        ano = input.nextInt();
        System.out.println("qual o preço de tabela do carro: ");
        double preço;
        preço = input.nextDouble();
        
        double imposto = 0;
        if(ano < 2000){
            imposto = preço *1/100;
        }else if(ano >= 2000){
            imposto = preço * 1.5/100;
        }
        System.out.println("o carro de ano de fabriçaca "+ano+" e preço de tabela igual a "+preço+" tera um imposto de transferencia igual a: "+ imposto);
    }
}
