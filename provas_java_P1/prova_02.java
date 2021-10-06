
package provas_java_P1;
import java.util.Scanner;
public class prova_02 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       double valor_compra;
       int opçao;
       
       System.out.println("Digite o valor total da compra:");
       valor_compra = input.nextDouble();
       System.out.println("digite a opçao de pagamento:(de 1 a 5)");
       opçao = input.nextInt();
       
       if(opçao == 1){
           System.out.println("PAGAMENTO A VISTA");
           double desconto;
           double valor_pago;
           
           desconto = valor_compra*15/100;
           valor_pago = valor_compra - desconto;
           
           System.out.printf("Valor total da compra: %.2f\nValor final da compra(valor a pagar): %.2f\nDesconto: %.2f\n", valor_compra , valor_pago , desconto);
           
       }else if(opçao == 2){
           System.out.println("CHEQUE PRE-DATADO");
           double desconto = valor_compra * 10/100;
           double valor_pago = valor_compra - desconto;
           
           System.out.printf("Valor total da compra: %.2f\nValor final da compra(valor a pagar): %.2f\nDesconto: %.2f\n", valor_compra , valor_pago , desconto);
           
       }else if(opçao == 3){
           System.out.println("PAGAMENTO PARCELADO EM 3 VEZES");
           double desconto = valor_compra * 5/100;
           double valor_pago = valor_compra - desconto;
           double parcela = valor_pago / 3;
           
           System.out.printf("Valor total da compra: %.2f\nValor final da compra(valor a pagar): %.2f\nDesconto: %.2f\nValor da parcela: %.2f\nQuantidade de parcelas: 3\n", valor_compra , valor_pago , desconto , parcela);
           
       }else if(opçao == 4){
           System.out.println("PAGAMENTO PARCELADO EM 6 VEZES");
           double valor_pago = valor_compra;
           double parcela = valor_pago / 6;
           
           System.out.printf("Valor total da compra: %.2f\nValor final da compra(valor a pagar): %.2f\nDesconto: 0.0\nValor da parcela: %.2f\nQuantidade de parcelas: 6\n", valor_compra , valor_pago , parcela);
       
       }else if(opçao == 5){
           System.out.println("PAGAMENTO PARCELADO EM 12 VEZES");
           double juros = valor_compra * 8/100;
           double valor_pago = valor_compra + juros;
           double parcela = valor_pago / 12;
           
           System.out.printf("Valor total da compra: %.2f\nValor final da compra(valor a pagar): %.2f\nJuros: %.2f\nValor da parcela: %.2f\nQuantidade de parcelas: 12\n", valor_compra , valor_pago ,juros, parcela);
       
       }
       
    }
}
