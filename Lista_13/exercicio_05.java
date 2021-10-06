
package Lista_13;

import java.util.Scanner;
public class exercicio_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int fator, resposta, opçao , potencia;
        double fatorial , numero , resultado;
        
        
        do{
            Menu();
            opçao = input.nextInt();
            if(opçao == 1){
                System.out.println("digite o fator:");
                fator = input.nextInt();
                while(fator < 0){
                    System.out.println("o fator deve ser maior ou igual a zero, tente novamente.");
                    fator = input.nextInt();
                }
                fatorial = Fatorial(fator);
                System.out.println("O fatorial é igual a: "+fatorial);
                
            }else if(opçao == 2){
                System.out.println("digite o numero a ser elevado:");
                numero = input.nextDouble();
                System.out.println("digite a potencia a qual o numero vai ser elevado:");
                potencia = input.nextInt();
                while(potencia < 0){
                    System.out.println("A potencia deve ser maior ou iguala zero.");
                    potencia = input.nextInt();
                }
                resultado = Potencia(numero , potencia);
                System.out.println("O resultado da potencia foi: "+resultado);
                
            }
            
            System.out.println("Deseja continuar a execuçao do programa?");
              System.out.println("digite 1 para Sim ou 2 para NÂO");
              resposta = input.nextInt();
              while(resposta != 1 && resposta != 2){
                  System.out.println("opçao invalida, tente novamente.");
                  resposta = input.nextInt();
              }
              if(resposta == 2){
                  System.out.println("Encerrando o programa, ate mais.");
              }  
        }while(resposta != 2);
        
    }
     public static void Menu(){
        System.out.println("***MENU***");
        System.out.println("1 - Calculo do FATORIAL");
        System.out.println("2 - Calculo do POTENCIA");
        System.out.println("Digite o numero da opçao escolhida:");
    }
     public static double Fatorial(int fator){
         double fatorial = fator;
         if(fator == 0){
             fatorial = 1;
             
         }else if(fator == 1){
             fatorial = 1;
             
         }else{
             for(int i = (fator-1) ; i > 1 ; i--){
                 fatorial = fatorial*i;
             }
             
         }
         return fatorial;
     }
     public static double Potencia(double numero , int potencia){
         double resultado = 0;
         if(potencia == 0){
             resultado = 1;
         }else if(potencia == 1){
             resultado = numero;
         }else{
             resultado = 1;
             for(int i = 0 ; i < potencia ; i++ ){
                 resultado = resultado * numero;
             }
         }
         
         return resultado;
     }
      
}
