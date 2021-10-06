
package Lista_12_e_QuestaoDesafio;

import java.util.Scanner;
public class exercicio_03 {
    public static void main(String[] args){
        /*
        3ª Questão: Imagine que para as semifinais da Copa do 
        Mundo Fifa 2020 irão as seguintes seleções: 
        
        A- Brasil, B- França, C – Uruguai e D – Japão. 
        
        Nos jogos das semifinais, Brasil jogaria com Japão e 
        França jogaria com Uruguai. Implemente um programa para, 
        dado o placar dos dois jogos das semifinais, informar quais 
        seleções irão disputar a grande final e quais seleções 
        irão disputar o 3º lugar. Para tal, o programa deverá ter 
        os seguintes subprograma:
        
        (a) O main irá solicitar ao usuário que informe o placar 
        dos dois jogos, ou seja, quantos gols cada time fez. 
        O programa deverá forçar que sejam informadas quantidades 
        de gols maiores ou iguais a zero. Lembre-se que não é possível 
        ter empate nas semifinais. De posse do placar validado dos 
        dois jogos, o programa deverá chamar o procedimento definido 
        no item (b) para informar o nome das seleções que irão disputar 
        a grande final e o nome das seleções irão disputar o 3º lugar.
        (b) Um procedimento que receba, como parâmetro, o placar dos 
        dois jogos das semifinais e irá informar ao usuário o nome 
        das seleções que irão disputar a grande final e o nome das 
        seleções irão disputar o 3º lugar. Para saber quem ganhou um 
        jogo, o procedimento deverá fazer uso, OBRIGATORIAMENTE, 
        da função definida no item (c).
        (c) Uma função que recebe como parâmetro o placar de um jogo 
        e retorna 1, se o primeiro time tiver ganho o jogo, ou 2, 
        se o segundo time tiver ganho o jogo.
        
        OBS: O programador é livre para definir outros procedimentos 
        ou funções, caso julgue necessário.
        */
        
        Scanner input = new Scanner(System.in);
        //Brasil jogaria com Japão e França jogaria com Uruguai
        
        int gol1 , gol2 , gol3 , gol4 , chave = 1;
        
        System.out.println("No jogo BRASIL X JAPÃO");
        int chaveM = 1;
        do{
            System.out.print("quantos gols foram marcados pelo Brasil: ");
                do{
                    gol1 = input.nextInt();
                    if(gol1 >=0){
                        chave = 1;
                    }else{
                        System.out.println("O saldo de gols deve ser um numero positivo.");
                        chave = 0;
                    }
                }while(chave == 0);
            System.out.print("quantos gols foram marcados pelo japão: ");
                do{
                    gol2 = input.nextInt();
                    if(gol2 >=0){
                        chave = 1;
                    }else{
                        System.out.println("O saldo de gols deve ser um numero positivo.");
                        chave = 0;
                    }
                }while(chave == 0);

            if(gol1 == gol2){
                System.out.println("Alguem deve sair do jogo vencedor, tente colocar o placar dos penaltis, ou coloque um placar valido.");
                chaveM = 0;
            }else{
                chaveM = 1;
            }
            
        }while(chaveM == 0);    
            
        System.out.println("No jogo FRANÇA X URUGUAI");
        chaveM = 1;
        do{
            System.out.print("quantos gols foram marcados pelo França: ");
                do{
                    gol3 = input.nextInt();
                    if(gol3 >=0){
                        chave = 1;
                    }else{
                        System.out.println("O saldo de gols deve ser um numero positivo.");
                        chave = 0;
                    }
                }while(chave == 0);
            System.out.print("quantos gols foram marcados pelo Uruguai: ");
                do{
                    gol4 = input.nextInt();
                    if(gol4 >=0){
                        chave = 1;
                    }else{
                        System.out.println("O saldo de gols deve ser um numero positivo.");
                        chave = 0;
                    }
                }while(chave == 0);

                if(gol3 == gol4){
                    System.out.println("Alguem deve sair do jogo vencedor, tente colocar o placar dos penaltis, ou coloque um placar valido.");
                    chaveM = 0;
                }else{
                    chaveM = 1;
                }
        }while(chaveM == 0);
        
        String[] resposta = new String[2];
        resposta = FinalDaCopa(gol1,gol2,gol3,gol4);
        
        System.out.print("A grande final sera: "+resposta[0]);
        System.out.println(" e a disputa pelo terceiro lugar sera: "+resposta[1]);
        
        
    }
    
    public static int Vencedor(int gol , int gol2){//funçao (c) do cabecalho.
        int resultado;
        
        if(gol > gol2){
            resultado = 1;
        }else{
            resultado = 2;
        }
        
        return resultado;
    }
    
    public static String[] FinalDaCopa(int gol1, int gol2 , int gol3 , int gol4){
        int jogo_B_J , jogo_F_U;
        
        String final_1 = null;
        String final_2 = null;
        String ter_1 = null;
        String ter_2 = null;
        
        jogo_B_J = Vencedor(gol1,gol2);
        jogo_F_U = Vencedor(gol3,gol4);
        
        if(jogo_B_J == 1){
            //brasil
            final_1 = "BRASIL";
            ter_1 = "JAPAO";
        }else if(jogo_B_J == 2){
            //japao 
            final_1 = "JAPAO";
            ter_1 = "BRASIL";
        }
        
        if(jogo_F_U == 1){
            //frança
            final_2 = "FRANÇA";
            ter_2 = "URUGUAI";
        }else if(jogo_F_U == 2){
            //uruguai
            final_2 = "FRANÇA";
            ter_2 = "URUGUAI";
        }
        
        String grande_final;
        String terceiro_lugar;
        
        grande_final = final_1 + " X ";
        terceiro_lugar = ter_1 + " X ";
        
        grande_final = grande_final.concat(final_2);
        terceiro_lugar = terceiro_lugar.concat(ter_2);
        
        String[] resposta = new String[2];
        
        resposta[0] = grande_final;
        resposta[1] = terceiro_lugar;
        
        return resposta;
    }
    
    
}
