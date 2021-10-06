
package Lista_14;

import java.util.Scanner;
public class exercicio_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        1 - Implementar um programa que solicita ao usuário um valor
        em metros e exibe os valores correspondentes em quilômetro,
        hectômetro, decâmetro, decímetros, centímetros e milímetros.
        Para tal, o programa deverá implementar seis funções de 
        conversão que recebam como parâmetro o valor em metros e 
        retornem o valor na unidade correspondente. O programa 
        deverá ter um menu principal que permita ao usuário escolher 
        qual conversão deseja realizar. Implemente um procedimento 
        para a exibição do menu. Além disso, o programa deverá ter 
        um loop principal que permita ao usuário repetir a execução 
        do programa quantas vezes desejar.
        */
        int opçao = 0;
        double resposta = 0;
        do{
            Menu();
            opçao = input.nextInt();
            while(opçao<1 || opçao>7){
                System.out.println("opçao fora do intervalo de 1 a 7, tente novamente.");
                opçao = input.nextInt();
            }
            if(opçao == 7){
                System.out.println("Encerrando o programa, ate mais.");
            }else{
                System.out.println("Digite o valor em METROS a serem convertidos:");
                double metro = input.nextDouble();
                if(opçao == 1){
                    resposta = Quilometro(metro);
                    System.out.println(resposta);
                }else if(opçao == 2){
                    resposta = Hectometro(metro);
                    System.out.println(resposta);
                }else if(opçao == 3){
                    resposta = Decametro(metro);
                    System.out.println(resposta);
                }else if(opçao == 4){
                    resposta = Decimetro(metro);
                    System.out.println(resposta);
                }else if(opçao == 5){
                    resposta = Centimetro(metro);
                    System.out.println(resposta);
                }else if(opçao == 6){
                    resposta = Milimetro(metro);
                    System.out.println(resposta);
                }
            }
        }while(opçao != 7);
    }
    public static void Menu(){
        System.out.println("*** MENU ***");
        System.out.println("1 - conversao para quilometros");
        System.out.println("2 - conversao para hectrometro");
        System.out.println("3 - conversao para decametro");
        System.out.println("4 - conversao para decimetros");
        System.out.println("5 - conversao para cetimentros");
        System.out.println("6 - conversao para milimetros");
        System.out.println("7 - Encerrar o programa");
        System.out.println("digite a opçao escolhida:");
    }
    public static double Quilometro(double metro){
        double quilometros;
        quilometros = metro / 1000;
        return quilometros;
    }
    public static double Hectometro(double metro){
        double hecto;
        hecto = metro / 100;
        return hecto;
    }
    public static double Decametro(double metro){
        double deca;
        deca = metro / 10;
        return deca;
    }
    public static double Decimetro(double metro){
        double deci;
        deci = metro * 10;
        return deci;
    }
    public static double Centimetro(double metro){
        double centi;
        centi = metro *100;
        return centi;
    }
    public static double Milimetro(double metro){
        double mili;
        mili = metro * 1000;
        return mili;
    }
}
