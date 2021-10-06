package Lista_13;

import java.util.Scanner;
public class exercicio_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int opçao = 0;
        double comprimento = 0 , altura = 0 , largura = 0 , volume = 0;
        
        while(opçao != 5){
            Menu();
            opçao = input.nextInt();
            while(opçao < 1 || opçao > 5){
                System.out.println("opçao invalida, tente novamente [1 a 5]");
                opçao = input.nextInt();
            }
            if(opçao == 1){
                System.out.println("Volume do cubo:");
                System.out.println("digite o valor da aresta/lado do cubo:");
                comprimento = input.nextDouble();
                volume = Cubo(comprimento);
                System.out.println("O volume do CUBO em questao é igual a: "+volume);
                
            }else if(opçao == 2){
                System.out.println("Volume da Esfera");
                System.out.println("digite o valor do raio da esfera:");
                comprimento = input.nextDouble();
                volume = Esfera(comprimento);
                System.out.println("O volume do ESFERA em questao é igual a: "+volume);
                
            }else if(opçao == 3){
                System.out.println("Volume do Cilindro");
                System.out.println("digite o valor da altura do cilindro: ");
                altura = input.nextDouble();
                System.out.println("digite o valor do raio da base do cilindro: ");
                comprimento = input.nextDouble();
                volume = Cilindro(altura,comprimento);
                System.out.println("O volume do CILINDRO em questao é igual a: "+volume);
                
            }else if(opçao == 4){
                System.out.println("Volume do Paralelepipedo");
                System.out.println("digite o valor da altura do solido:");
                altura = input.nextDouble();
                System.out.println("digite o valor do comprimento do solido:");
                comprimento = input.nextDouble();
                System.out.println("digite o valor da largura do solido:");
                largura = input.nextDouble();
                volume = Paralelepipado(altura, comprimento , largura);
                System.out.println("O volume do PARALELEPIPADO em questao é igual a: "+volume);
                
            }else if(opçao == 5){
                System.out.println("Encarrando o programa, ate mais.");
            }
            
        }
        
    }
    public static void Menu(){
        System.out.println("***MENU***");
        System.out.println("1 - Calculo do volume do CUBO");
        System.out.println("2 - Calculo do volume da ESFERA");
        System.out.println("3 - Calculo do volume do CILINDRO");
        System.out.println("4 - Calculo do volume do PARALELEPIPADO");
        System.out.println("5 - Encerrar o programa");
        System.out.print("Digite o numero da opçao escolhida:");
    }
    public static double Cubo(double lado){
        double volume;
        volume = Math.pow(3, lado);
        return volume;
    }
    public static double Esfera(double raio){
        double volume;
        volume = (4/3) * 3.14 * Math.pow(3, raio);
        return volume;
    }
    public static double Cilindro(double altura , double raio){
        double volume;
        volume = 3.14 * altura * Math.pow(2, raio);
        return volume;
    }
    public static double Paralelepipado(double altura , double comprimento , double largura){
        double volume;
        volume = altura * comprimento * largura;
        return volume;
    }
    
}
