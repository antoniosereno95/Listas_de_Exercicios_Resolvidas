
package Lista_12_e_QuestaoDesafio;

import java.util.Scanner;
public class exercicio_02 {
    public static void main(String[] args){
      /*
      2ª Questão: Implemente um programa para determinar e exibir o 
      conceito de cada um dos 60 alunos de uma turma em uma determinada 
      disciplina. Para cada aluno da turma, o programa deverá solicitar 
      a nota da primeira e a da segunda avaliação, calcular a média e 
      determinar o conceito. Para tal, o programa deverá ser composto 
      pelos seguintes métodos:
    (a) Uma função que recebe a média de um aluno como parâmetro e 
      retorna o seu conceito, conforme a tabela abaixo:
            
            Média             Conceito
            0,0 ≤ média < 5,0   ‘D’
            5,0 ≤ média < 7,0   ‘C’
            7,0 ≤ média < 9,0   ‘B’
            9,0 ≤ média ≤ 10,0  ‘A’
      
    (b) Um procedimento que receba a nota da primeira e a nota da 
      segunda avaliação, passadas como parâmetro, calcule a média 
      do aluno (média aritmética simples) e determine o seu conceito
      (utilizado a função definida no item (a)). Ao final, 
      o procedimento deverá exibir a média e o conceito do aluno.
      
    (c) O método main deverá, para cada aluno da turma, solicitar 
      que seja digitada a nota da primeira e a da segunda avaliação e,
      utilizando o procedimento definido no item (b), calcular e 
      exibir a média e o conceito do referido aluno. 
      Lembre-se que a turma possui 60 alunos.
      
    OBS1: O programa deverá forçar a digitação de notas no 
      intervalo fechado de 0,0 (zero) a 10,0 (dez).
    OBS2: O programador é livre para definir outros procedimentos 
      ou funções, caso julgue necessário.
      */
        Scanner input = new Scanner(System.in);
        double nota1 , nota2;
      
        for(int i = 0 ; i < 2 ; i ++){
          
          if( i > 0 ){
            System.out.print("\n");
          }
          System.out.println("Digite as notas do aluno "+(i+1));
          System.out.print("prova 1: ");
                int chave = 1;
                do{
                    nota1 = input.nextDouble();
                    if(nota1>=0.0 && nota1<=10.0){
                        chave = 1;
                    }else{
                        System.out.println("nota 1 invalida, tente novamente.");
                        chave = 0;
                    }
                }while(chave == 0);
          
          System.out.print("prova 2: ");
                chave = 1;
                do{
                    nota2 = input.nextDouble();
                    if(nota2>=0.0 && nota2<=10.0){
                        chave = 1;
                    }else{
                        System.out.println("nota 2 invalida, tente novamente.");
                        chave = 0;
                    }
                }while(chave == 0);
          
          MediaEConceito(nota1,nota2);
          if(i == 59){
              System.out.print("\n");
          } 
        }
    }
  
    public static char Conceito(double media){
        char c = 0;
        
        if(media >= 0 && media < 5){
            c = 'D';

        }else if(media >= 5 && media < 7){
            c = 'C';

        }else if(media >= 7 && media < 9){
            c = 'B';

        }else if(media >= 9 && media <= 10){
            c = 'A';

        }
        
        return c;
    }
  
    public static double MediaEConceito(double nota1 , double nota2){
        double media;
        char c;

        media = (nota1 + nota2) / 2;

        System.out.printf("a media do aluno foi %.1f", media);

        c = Conceito(media);

        System.out.printf(" e o conceito recebido foi %c \n", c);

        return 0;
    }
}
