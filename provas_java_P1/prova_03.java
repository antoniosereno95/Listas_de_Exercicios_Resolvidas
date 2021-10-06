
package provas_java_P1;
import java.util.Scanner;
public class prova_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int idade , soma_idade_like = 0 , cont_pessoas_dislike = 0 , menor_idade = 999999999;
        double media_idade_like = 0 , por_pessoas_dislike = 0 ;
        char opniao ;
        int chave;
        
        
        int numemo_participantes = 300;
        for(int i = 0; i < numemo_participantes; i++){
            
            System.out.println("digite a idade do individuo "+(i+1)+":");   
            idade = input.nextInt();
            if(idade <18 || idade >65){
                do{
                    System.out.println("erro, idade fora do limite(18 a 65)");
                    idade = input.nextInt();
                }while(idade <18 || idade >65);
            }
            
            System.out.println("Oque o individuo "+(i+1)+" achou do produto?");
            opniao = input.next().charAt(0);
            if(opniao == 'A' ||opniao == 'B' ||opniao == 'C' ||opniao == 'D' ||opniao == 'E'){
                chave = 2;
            }else{ 
                
                /*  professora, desculpe por essa aberraçao aqui, 
                    mas eu ja havia feito algunas questoes desse tipo 
                    e elas so funcionavao dessa forma, nao quis tentar a sore na prova =),
                    aguado a resoluçao da prova para poder aprender um metodo mais simples 
                    e que use menos memoria
                */
                
                do{
                    System.out.println("erra, letra errada(A , B , C , D , E)");
                    opniao = input.next().charAt(0);
                    if(opniao == 'A' ||opniao == 'B' ||opniao == 'C' ||opniao == 'D' ||opniao == 'E'){
                        chave = 2; //novamente o mesmo metodo feio mas que funciona =).
                    }else{
                        chave = 0; 
                    }
                }while(chave == 0);
            }
            
            if(opniao == 'A' || opniao =='B'){
               soma_idade_like += idade ;
            }
            
            if(opniao == 'D' || opniao =='E'){
               cont_pessoas_dislike++;
            }
            
             if(idade < menor_idade){
                menor_idade = idade;
            }
            
        }
        
        media_idade_like = soma_idade_like / numemo_participantes;
        
        
        por_pessoas_dislike = (cont_pessoas_dislike * 100) / numemo_participantes;
        
        
        System.out.println("A média de idade das pessoas que gostaram do produto foi de: "+ media_idade_like);
        System.out.println("O percentual de pessoas que não gostaram do produto foi de: "+por_pessoas_dislike);
        System.out.println("A idade da pessoa mais jovem que participou da pesquisa foi de: "+menor_idade);
        
        
    }
}
