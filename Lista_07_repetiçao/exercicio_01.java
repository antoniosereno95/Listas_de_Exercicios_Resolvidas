
package Lista_07_repetiçao;

import java.util.Scanner;
public class exercicio_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double nota1= 0 , nota2= 0;
        
        System.out.println("Digite as notas do aluno:");
        do{
        System.out.print("nota1: ");
        nota1 = input.nextDouble();
        if( nota1 > 10.0 || nota1 < 0.0 ){
            System.out.println("nota invalida, tente novamente.");
        }
        }while( nota1 > 10.0 || nota1 < 0.0 );
        
        do{
        System.out.print("nota2: ");
        nota2 = input.nextDouble();
        if( nota2 > 10.0 || nota2 < 0.0 ){
            System.out.println("nota invalida, tente novamente.");
        }
        }while( nota2 > 10.0 || nota2 < 0.0 );
        
        double media = ( nota1 + nota2 ) / 2;
        
        if( media >= 7.0 ){
            System.out.println("O aluno obteve média "+media+" e está aprovado.");
        }else if( media < 7.0 && media >=3.0 ){
            System.out.println("O aluno obteve média "+media+" e está recuperaçao.");
        }else if( media < 3.0 ){
            System.out.println("O aluno obteve média "+media+" e está reprovado.");
        }
        
    }
}
