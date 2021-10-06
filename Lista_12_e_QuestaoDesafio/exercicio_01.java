
package Lista_12_e_QuestaoDesafio;

import java.util.Scanner;
public class exercicio_01 {
    public static void main(String[] args){
        
        /*
        1ª Questão: Implemente um programa para fazer conversão de 
        um tempo expresso em horas e minutos para um tempo expresso 
        apenas em minutos e vice-versa. O programa deverá apresentar 
        os seguintes métodos:
    (a) Função para converter um tempo expresso em horas e minutos para 
        um tempo expresso apenas em minutos. Esta função receberá 
        como parâmetro o tempo expresso em horas e minutos a ser 
        convertido e deverá calcular e retornar para o programa o 
        valor correspondente do tempo em minutos. O programa se 
        encarregará de exibir o resultado ao usuário.
        Exemplo de chamada da função: 
        totalMinutos = tempoEmMinutos(hora, minutos);
    (b) Procedimento para converter um tempo expresso em minutos 
        para um tempo expresso em horas e minutos. Este procedimento 
        receberá como parâmetro, passado por valor, o tempo expresso 
        em minutos a ser convertido, deverá calcular e exibir o 
        tempo correspondente expresso em horas e minutos.
        Exemplo de chamada do procedimento: 
        tempoEmHorasEMinutos(minutos);
    OBS1: Toda entrada de dados deve ser feita pelo programa principal.
    OBS2: O programa (main) deverá ter um menu principal que permita 
        ao usuário executar os métodos quantas vezes desejar e só 
        deverá terminar sua execução se o usuário solicitar.
            */
        
        Scanner input = new Scanner(System.in);
        int chave = 0, chave2 , escolha , hora , minuto;
        int resultado;
        
        do{
            
            System.out.println("*** Menu ***");
            System.out.println("1 - converter horas e minutos em minutos.");
            System.out.println("2 - converter minutos em horas e minutos.");
            System.out.println("3 - encerrar o programa.");
            
            do{
                escolha = input.nextInt();
                if(escolha == 1 || escolha == 2 || escolha == 3){
                    chave2 = 1;
                }else{
                    System.out.println("opçao invalida.tente novamente");
                    chave2 = 0;
                }
            }while(chave2 == 0);
            
            if(escolha == 1){
                
                chave = 0;
                System.out.println("digite o numero de horas:");
                hora = input.nextInt();
                System.out.println("digite o numero de monutos:");
                minuto = input.nextInt();
                
                resultado = tempoEmMinutos(hora, minuto);
                System.out.println("O tempo correspondente em minutos é: "+resultado);
                
            }else if(escolha == 2){
                int res[] = new int[2];
                chave = 0;
                System.out.println("digite o numero de minutos:");
                minuto = input.nextInt();
                
                res = tempoEmHorasEMinutos(minuto);
                if(res[0] == 0){
                    System.out.println("O tempo correspondente em horas e minutos é: 00:"+res[1]);
                }else{
                   System.out.println("O tempo correspondente em horas e minutos é: "+res[0]+":"+res[1]); 
                }
                
            }else if(escolha == 3){
                
                System.out.println("Encerrando o programa, ate mais.");
                chave = 1;
                
            }
            
        }while(chave == 0);
        
    }
    
    public static int tempoEmMinutos(int hora , int minuto ){
        int resposta;
        
        resposta = hora*60 + minuto;
        
        return resposta;
    }
    
    public static int[] tempoEmHorasEMinutos(int minuto){
        int resposta[] = new int[2];
        int resto;
        int horas, minutos;
        
        resto = minuto%60;
        minutos = resto;
        horas =(int)(minuto/60);
        
        resposta[0] = horas;
        resposta[1] = minutos;
        
        return resposta;
    }
    
}
