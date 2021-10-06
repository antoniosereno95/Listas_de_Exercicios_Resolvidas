
package Lista_12_e_QuestaoDesafio;

import java.util.Scanner;
import java.security.SecureRandom;
public class Desafio_ponto_extra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        int numero_aleatorio , quantidade_de_jogos = 0 , chances = 1 , resposta;
        char resposta_continuacao_do_jogo = 0;
        
        do{
            numero_aleatorio = random.nextInt(100) + 1;
            int opçao = Menu(quantidade_de_jogos);
            if(opçao == 1){
                chances = 10;
            }else if(opçao == 2){
                chances = 8;
            }else if(opçao == 3){
                chances = 5;
            }
            
            int maior_n = 100 , menor_n = 1 , n_de_chances = 1;
            while(chances != 0){
                
                System.out.println("digite um numero entre "+menor_n+" e "+maior_n+".");
                System.out.print("Valor digitado: ");
                resposta = input.nextInt();
                while(resposta <= menor_n || resposta >= maior_n){
                    System.out.println("O valor digitado esta fora do intervalo, tente novamente.");
                    resposta = input.nextInt();
                }
                
                if(resposta == numero_aleatorio){
                    System.out.println("Parabens! Voce acertou com "+n_de_chances+" tentativas!");
                    chances = 0;
                }else{
                    System.out.println("Tente outra vez.");
                    if(resposta > numero_aleatorio ){
                        maior_n = resposta;
                    }else if(resposta < numero_aleatorio){
                        menor_n = resposta;
                    }
                    if(resposta == (numero_aleatorio - 1) || resposta == (numero_aleatorio +1) ){
                        System.out.println("Voce esta QUENTE!");
                    }
                    chances = chances - 1;
                    n_de_chances = n_de_chances + 1;
                }
            }
            resposta_continuacao_do_jogo = Continuacao();
            if(resposta_continuacao_do_jogo == 'S'){
                quantidade_de_jogos++;
            }
        }while(resposta_continuacao_do_jogo == 'S');
        
    }
    public static int Menu(int quantidade_de_jogos){
        Scanner input = new Scanner(System.in);
        int op = 0;
        
        System.out.println("BEM VINDO AO JOGO!");
        if(quantidade_de_jogos == 0){
        System.out.println("CONTEXTO: Voce tera uma certa quantidade de chances para\npoder acertar uma senha gerada aleatoriamente entra 0 e 100. ");
        }
        System.out.println("Escolha a dificuldade desejada:");
        System.out.println("  1 - Fácil, voce tera 10 tentativas.");
        System.out.println("  2 - Medio, voce tera 8 tentativas.");
        System.out.println("  3 - Facil, voce tera 5 tentativas.");
        System.out.print("digite o indice da dificuldade escolhida: ");
        op = input.nextInt();
        while(op != 1 && op != 2 && op != 3){
            System.out.println("escolha invalida, tente novamente(1 , 2 ou 3).");
            op = input.nextInt();
        }
        return op;
    }
    public static char Continuacao(){
        Scanner input = new Scanner(System.in);
        char escolha;
        
        System.out.println("VOCE ACABA DE CONCLUIR UMA RODADA DO JOGO\nDESEJA CONTINAR?('S' PARA SIM, OU 'N' PARA NAO.)");
        escolha = input.next().charAt(0);
        while(escolha != 'S' && escolha != 'N'){
            System.out.println("entrada incorreta(S ou N)");
            escolha = input.next().charAt(0);
        }
        if(escolha == 'N'){
            System.out.println("Encerrando o programa, até a proxima.");
        }
        
        return escolha;
    }
}
