
package Lista_07_repetiçao;

import java.util.Scanner;
public class exercicio_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] nota1 = new double[3];
        double[] nota2 = new double[3];
        double[] media = new double[3];
        
        for(int i = 0  ; i < nota1.length ; i++ ){
            
            System.out.println("Digite as notas do aluno "+(i+1)+" :");
            do{
            System.out.print("nota 1 do aluno "+(i+1)+": ");
            nota1[i] = input.nextDouble();
            if( nota1[i] > 10.0 || nota1[i] < 0.0 ){
                System.out.println("nota invalida, tente novamente.");
            }
            }while( nota1[i] > 10.0 || nota1[i] < 0.0 );

            do{
            System.out.print("nota 2 do aluno "+(i+1)+": ");
            nota2[i] = input.nextDouble();
            if( nota2[i] > 10.0 || nota2[i] < 0.0 ){
                System.out.println("nota invalida, tente novamente.");                                                                                      //assinado: antonio sereno =)
            }
            }while( nota2[i] > 10.0 || nota2[i] < 0.0 );
            
            media[i] = ( nota1[i] + nota2[i] ) / 2;
            
            System.out.print("\n");
            
        }
        
        int cont_aprovado = 0 , cont_reprovado = 0 , cont_recuperaçao = 0;
        
        for(int i = 0 ; i < media.length ; i++ ){
            if( media[i] >= 7.0 ){
                cont_aprovado++;
                System.out.println("O aluno "+(i+1)+" obteve média "+media[i]+" e está aprovado.");
            }else if( media[i] < 7.0 && media[i] >=3.0 ){
                cont_reprovado++;
                System.out.println("O aluno "+(i+1)+" obteve média "+media[i]+" e está recuperaçao.");
            }else if( media[i] < 3.0 ){
                cont_recuperaçao++;
                System.out.println("O aluno "+(i+1)+" obteve média "+media[i]+" e está reprovado.");
            }
        }
        
        double por_aprovado , por_recuperaçao , por_reprovado;
        
        por_aprovado = cont_aprovado*100/media.length;
        por_recuperaçao = cont_recuperaçao*100/media.length;
        por_reprovado = cont_reprovado*100/media.length;
        
        System.out.println("A porcentagem de alunos aporvados nesse semestre foi de "+ por_aprovado+" ,\na de alunos em recuperaçao foi de "+por_recuperaçao+" ,\ne a de alunos reprovados foi de "+por_reprovado+" .");
        
        double media_turma, soma_medias = 0;
        
        for(int i = 0 ; i < media.length ; i++){
            soma_medias += media[i];
        }
        
        media_turma = soma_medias/media.length;
        
        System.out.println("A media da turma no semestre foi de "+media_turma+" .");
        
    }
}
