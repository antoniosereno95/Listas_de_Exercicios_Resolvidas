
package Lista_11;

import java.util.Scanner;
public class exercicio_03 {
    public static void main(String[] args){
        
        /*
        Um banco concederá um crédito pessoal aos seus clientes de 
        acordo com seu saldo médio no último ano.
        Implemente uma função que receba como parâmetro o valor do saldo 
        médio do cliente no último ano,
        calcule e retorne o valor do crédito que será dado a ele. 
        O cálculo deve ser feito de acordo com a tabela
        abaixo. Para cada cliente, o programa principal deverá exibir 
        a seguinte frase: “Para um saldo médio igual
        a R$___, será dado um crédito de R$___.”
        
        Valor do Saldo Médio Valor do Crédito
        Até R$ 200,00 10% do saldo médio
        Acima de R$ 200,00 até R$ 300,00 20% do saldo médio
        Acima de R$ 300,00 até R$ 400,00 25% do saldo médio
        Acima de R$ 400,00 30% do saldo médio
        
        OBS1: Para o fornecimento do crédito, o saldo médio do cliente 
        não pode ser negativo ou nulo. Caso seja,
        deve ser informado ao cliente que ele não terá direito ao 
        benefício;
        OBS2: A quantidade de clientes que utilizarão o programa para 
        fazer o cálculo de seu crédito pessoal não é
        previamente conhecida. Desta forma, a cada cálculo realizado, 
        deve-se perguntar ao usuário se ele deseja
        efetuar um novo cálculo. A esta pergunta o usuário deverá 
        responder S ou N. O programa não deve aceitar
        nenhum outro valor de resposta.
        */
        
        Scanner input = new Scanner(System.in);
        
        double entrada, saldo;
        int chave = 1, chave2;
        char resposta;
        do{
            
            System.out.println("\nDigite o saldo medio do cliente:");
            entrada = input.nextDouble();
            if(entrada <= 0){
                System.out.println("o cliente não tem direito a benefícios\n");
            }else{
                saldo = F(entrada);
                System.out.println("Para um saldo médio igual a R$"+entrada+", será dado um crédito de R$"+saldo+".\n");
            }
            
            System.out.println("Voce deseja continuar o programa?(S/N)");
            do{
                resposta = input.next().charAt(0);
                
                if(resposta == 'S' || resposta == 'N'){
                    chave2 = 1;
                }else{
                    System.out.println("opçao invalida, tente novamente.");
                    chave2 = 0;
                }
            }while(chave2 == 0);
            
            if(resposta == 'S'){
                chave = 0;
            }else if(resposta == 'N'){
                System.out.println("Encerrando o programa, ate mais.");
                chave = 1;
            }
            
        }while(chave == 0);
        
    }
    public static double F(double entrada){
        double a = entrada;
        double beneficio = 0;
        
        if( a <= 200 ){
            beneficio = a*10/100;
            
        }else if(a > 200 && a <= 300){
            beneficio = a*20/100;
            
        }else if(a > 300 && a <= 400){
            beneficio = a*25/100;
            
        }else if(a > 400){
            beneficio = a*30/100;
        }
        
        return beneficio;
    }
}
