
package Lista_05_condicionais_2;

import java.util.Scanner;
public class exercicio_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float nota1 , nota2;
        System.out.println("digite a nota 1 do aluno:");
        nota1 = input.nextFloat();
        System.out.println("digite a nota 2 do aluno:");
        nota2 = input.nextFloat();
        
        double media = (nota1 + nota2)/2;
        
        if(media>=7.0){
            System.out.printf("o aluno obteve a media %.2f e esta aprovado",media);
        }else if(media>=3.0 && media<7.0){
            System.out.printf("o aluno obteve a media %.2f e esta em prova final",media);
        }else if(media<3.0){
            System.out.printf("o aluno obteve a media %.2f e esta reprovado",media);
        }
    }
}
