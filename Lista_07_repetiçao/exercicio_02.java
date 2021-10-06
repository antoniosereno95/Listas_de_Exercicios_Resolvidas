
package Lista_07_repetiçao;

import java.util.Scanner;
public class exercicio_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] nota1 = new double[30];
        double[] nota2 = new double[30];
        double[] media = new double[30];
        
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
                System.out.println("nota invalida, tente novamente.");
            }
            }while( nota2[i] > 10.0 || nota2[i] < 0.0 );
            
            media[i] = ( nota1[i] + nota2[i] ) / 2;
            
            System.out.print("\n");
        }
        
        for(int i = 0 ; i < media.length ; i++ ){
            if( media[i] >= 7.0 ){
                System.out.println("O aluno "+(i+1)+" obteve média "+media[i]+" e está aprovado.");
            }else if( media[i] < 7.0 && media[i] >=3.0 ){
                System.out.println("O aluno "+(i+1)+" obteve média "+media[i]+" e está recuperaçao.");
            }else if( media[i] < 3.0 ){
                System.out.println("O aluno "+(i+1)+" obteve média "+media[i]+" e está reprovado.");
            }
        }
        
    }
}
