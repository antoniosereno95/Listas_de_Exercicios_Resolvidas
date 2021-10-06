
package Lista_12_e_QuestaoDesafio;

import java.util.Scanner;
public class exercicio_04 {
    public static void main(String[] args){
        /*
        4ª Questão: As raízes de uma equação do segundo grau, 
        da forma ax2+ bx + c = 0, podem ser calculadas através da 
        expressão X = -b + ou - sqrt(delta)/ 2*a , onde 
        delta = pow(b,2) - 4*a*c .
        Escreva um programa que solicite ao usuário os valores dos 
        coeficientes a, b e c e chame um procedimento que calcule 
        as raízes da equação. O procedimento deverá receber como 
        parâmetros de entrada os coeficientes a, b e c. 
        Se existirem raízes reais, o procedimento deverá se 
        encarregar de exibi-las na tela. Caso contrário, o 
        procedimento exibirá a mensagem “Não existem raízes reais”. 
        Para calcular o delta da equação, o procedimento deverá 
        fazer uso de uma função. A função deverá receber como 
        parâmetros de entrada os coeficientes a, b e c e deverá 
        calcular e retornar o valor do delta calculado. 
        OBS: O programa (main) deve permitir ao usuário calcular 
        as raízes de quantas equações ele desejar. O programador 
        poderá definir outros procedimentos e/ou funções, caso 
        julgue necessário.
        */
        Scanner input = new Scanner(System.in);
        int chave = 1;
        double a, b, c;
        do{
            System.out.println("Em uma funçao do segundo grau de forma ax2+ bx + c = 0.");
            System.out.println("digite o parametro a: ");
            int chave2 = 1;
            do{
                a = input.nextDouble();
                if( a == 0 ){
                    System.out.println("O parametro 'a' deve ser diferente de zero, tente novamente.");
                    chave2 = 0;
                }else{
                    chave2 = 1;
                }
            }while(chave2 ==0);
            System.out.println("digite o parametro b: ");
            b = input.nextDouble();
            System.out.println("digite o parametro c: ");
            c = input.nextDouble();
            
            Raizes(a, b, c);
            
            System.out.println("Deseja continuar no programa(S/N)");
            int chave3 = 1;
            char pergunta;
            do{
                pergunta = input.next().charAt(0);
                if(pergunta == 'S' || pergunta == 'N'){
                    chave3 = 1;
                }else{
                    chave3 = 0;
                    System.out.println("entrada invalida, tente novamente('S' ou 'N')");
                }
            }while(chave3 == 0);
            
            if(pergunta == 'S'){
                chave = 0;
            }else if(pergunta == 'N'){
                chave = 1;
            }
            
        }while(chave == 0);
        
    }
    public static double Delta(double a , double b , double c){
        double delta;
        
        delta = Math.pow(b,2) - 4*a*c;
        
        return delta;
    }
    public static double Raizes(double a , double b , double c){
        double raiz1 = 0, raiz2 = 0;
                
        double delta = Delta(a , b , c);
        if(delta < 0){
            System.out.println("A equaçao nao apresenta raizes reias.");
            
        }else{
            
            raiz1 = ((-b) + Math.sqrt(delta))/ 2*a;
            raiz2 = ((-b) - Math.sqrt(delta))/ 2*a;
            System.out.println("As raizes da equaçao sao: "+raiz1+" e "+raiz2+" .");
            
        }
        return 0;
    }
}
