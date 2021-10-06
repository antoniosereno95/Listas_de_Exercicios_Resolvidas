
package Lista_07_repetiçao;

import java.util.Scanner;
public class monitoria {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double nota1 , nota2;
        double media , soma_notas = 0;
        double soma_media = 0 ;
        int contador_aprovado=0 , contador_recuperaçao=0 , contador_reprovado=0 ;
        double maior_media = 0 , menor_media = 999999999;
        
        for(int i = 0 ; i < 30 ; i++){
            
            System.out.println("digite a nota 1 do aluno "+i);
            nota1 = input.nextDouble();
            if(nota1<0 || nota1>10){
                do{
                    System.out.println("nota 1 invalida, tente novamente");
                    nota1 = input.nextDouble();
                }while(nota1<0 || nota1>10);
            }

            System.out.println("digite a nota 2");
            nota2 = input.nextDouble();
            if(nota2<0 || nota2>10){
                do{
                    System.out.println("nota 1 invalida, tente novamente");
                     nota2 = input.nextDouble();
                }while(nota2<0 || nota2>10);
            }

            media = (nota1 + nota2)/2;
            
            //PARTE NOVA DO PROGRAMA
            if(media > maior_media){
                maior_media = media;
            }
            if(media < menor_media){
                menor_media = media;
            }
            //PARTE NOVA DO PROGRAMA

            soma_media = soma_media + media;

            if( media >= 7.0 ){
                contador_aprovado++;
                System.out.println("O aluno obteve média "+media+" e está aprovado.");
            }else if( media < 7.0 && media >=3.0 ){
                contador_recuperaçao++;
                System.out.println("O aluno obteve média "+media+" e está recuperaçao.");
            }else if( media < 3.0 ){
                contador_reprovado++;
                System.out.println("O aluno obteve média "+media+" e está reprovado.");
            }
        
        }
        
        double media_da_sala = 0;
        media_da_sala = soma_media / 30;
        System.out.println("media da sala "+media_da_sala);
        
        //PARTE NOVA DO PROGRAMA
        System.out.println("A maior media da sala foi "+maior_media+" , e a menor media foi de "+menor_media+" .");
            
        //PARTE NOVA DO PROGRAMA
        
        double por_aprovados = 0 , por_reprovados = 0 , por_recuperaçao = 0;
        
        por_aprovados = contador_aprovado * 100/30;
        System.out.println("porcentagem aprovados "+por_aprovados);
        
        por_reprovados =  contador_reprovado * 100/30;
        System.out.println("porcentagem reprovados "+por_reprovados);
        
        por_recuperaçao = contador_recuperaçao * 100/30;
        System.out.println("porcentagem recuperaçao "+por_recuperaçao);
        
    }
}
