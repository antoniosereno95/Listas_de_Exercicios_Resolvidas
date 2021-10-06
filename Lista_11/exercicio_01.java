
package Lista_11;

import java.util.Scanner;
public class exercicio_01 {
   public static void main(String[] args){
       /*
       1ª) Implemente um programa para fazer conversão
       de dólar-real e real-dólar. O programa deverá ter os
       seguintes subprogramas:
        (a) Função para converter real em dólar. Esta função 
        receberá como parâmetro de entrada o valor em real a
        ser convertido e deverá calcular e retornar para o 
        programa o valor correspondente em dólar. 
        O programa se encarregará de exibir o resultado ao usuário.
       (b) Função para converter dólar em real. Esta função 
        receberá como parâmetro de entrada o valor em dólar
        a ser convertido e deverá calcular e retornar para 
        o programa o valor correspondente em real. O
        programa se encarregará de exibir o resultado ao usuário.
        OBS1: O programa deverá permitir que o usuário faça 
        quantas conversões desejar e só deverá terminar sua
        execução se o usuário solicitar.
        OBS2: Toda entrada e saída de dados deve ser feita pelo 
        programa principal.
        OBS3: Para simplificar, utilize o seguinte fator de 
       conversão: 1 dólar = 2.5384 reais
       */
       Scanner input = new Scanner(System.in);
       int escolha;
       int chave = 1;
       double i;
       do{
            i = 0;
            escolha = Menu();
       
            if(escolha == 1){
                double valor = 0 ;
                System.out.println("Digite o valor em reais a ser convertido para Dolar:");
                valor = input.nextDouble();
                
                i = RealDolar(valor);
                System.out.println("A quantia "+valor+" em dolar é de: "+i);
                
            }else if(escolha == 2){
                double valor = 0;
                System.out.println("Digite o valor em dolar a ser convertido para Real:");
                valor = input.nextDouble();
                
                i = DolarReal(valor);
                System.out.println("A quantia "+valor+" em real é de: "+i);

            }else if(escolha == 3){
               System.out.println("Encerrando o Programa, ate mais.");
               chave = 0;
            } 
       
       }while(chave == 1);
       
   } 
   
   public static int Menu(){
       Scanner input = new Scanner(System.in);
       
       System.out.println("  *  *  *");
       System.out.println("  MENU");
       System.out.println("Digite o numero correspondente a opçao desejada: ");
       System.out.println("1- Conversão REAL PARA DOLAR ");
       System.out.println("2- Conversão DOLAR PARA REAL ");
       System.out.println("3- Encerrar programa ");
       System.out.println("  *  *  *");
       
       int opçao , chave = 1;
       
       System.out.println("Qual sua escolha?");
       do{
           opçao = input.nextInt();
           if(opçao == 1 || opçao == 2 || opçao == 3){
               chave = 1;
           }else {
               System.out.println("Opçao Invalida.");
               chave = 0;
           }
       }while(chave == 0);
       
       return opçao;
   } 
   
   public static double RealDolar(double valor){
    //1 dólar = 2.5384 reais
        double valor_f;
        valor_f = valor / 2.5384 ;
        return valor_f;
    }

    public static double DolarReal(double valor){
        //1 dólar = 2.5384 reais
            double valor_f;
            valor_f = valor * 2.5384 ;
            return valor_f; 
    }
   
}

