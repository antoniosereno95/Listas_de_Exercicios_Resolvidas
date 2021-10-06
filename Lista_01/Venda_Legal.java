
package Lista_01;

import java.util.Scanner;

public class Venda_Legal {
    
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        double valor_original_do_produto;
        double porcentagem_de_desconto;
        double valor_do_desconto;
        double valor_pos_desconto;
        
        System.out.print("qual o valor do produto? ");
        valor_original_do_produto = leitor.nextDouble();
        
        System.out.print("qual a porcentagem de desconto? ");
        porcentagem_de_desconto = leitor.nextDouble();
        
        valor_do_desconto = (valor_original_do_produto * porcentagem_de_desconto) / 100;
        
        valor_pos_desconto = valor_original_do_produto - valor_do_desconto;
        
        System.out.println("Preco original do produto: " + valor_original_do_produto + "\nPreço final do produto eh: " + valor_pos_desconto + "\nQuanto voce esta economizando: " + valor_do_desconto);
     
    }
    
}
