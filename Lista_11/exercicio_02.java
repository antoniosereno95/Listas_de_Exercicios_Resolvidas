
package Lista_11;

import java.util.Scanner;
public class exercicio_02 {
    public static void main(String[] args){
       
        /*
        2ª) Implemente um programa para fazer conversão de temperaturas 
        em graus Fahrenheit para graus Celsius e
        vice-versa. O programa deverá apresentar os seguintes 
        subprogramas:
        (a) Função para converter temperaturas em graus Fahrenheit 
        para graus Celsius. Esta função receberá
        como parâmetro de entrada o valor da temperatura em graus 
        Fahrenheit a ser convertido e deverá
        calcular e retornar para o programa o valor correspondente 
        em graus Celsius. O programa se encarregará
        de exibir o resultado ao usuário.
        (b) Função para converter temperaturas em graus Celsius para 
        graus Fahrenheit. Esta função receberá como
        parâmetro de entrada o valor da temperatura em graus Celsius 
        a ser convertido e deverá calcular e
        retornar para o programa o valor correspondente em graus 
        Fahrenheit. O programa se encarregará de
        exibir o resultado ao usuário.
        OBS1: O programa deverá permitir que o usuário faça quantas 
        conversões desejar e só deverá terminar sua
        execução se o usuário solicitar.
        OBS2: Toda entrada e saída de dados deve ser feita pelo 
        programa principal.
        OBS3: Para as conversões, utilize as fórmulas abaixo:
        F = C *1.8 + 32
        c = (f - 32)/1.8
        */
        Scanner input = new Scanner(System.in);
        
        int escolha , chave = 1; 
        double resultado , entrada;
        
        do{
            escolha = Menu();
            
            if(escolha ==1 ){
                System.out.println("Digite o valor em graus a ser convertido para Fahrenheit:");
                entrada = input.nextDouble();
                resultado = GrausF(entrada);
                System.out.println("o valor "+entrada+" em graus equeivale a "+resultado+" em Fahrenheit.");
                
            }else if(escolha == 2){
                System.out.println("Digite o valor em Fahrenheit a ser convertido para graus:");
                entrada = input.nextDouble();
                resultado = FGraus(entrada);
                System.out.println("O valor "+entrada+" em Fahrenheit equivale a "+resultado+" em graus.");
            }else if(escolha == 3){
                System.out.println("Encerrando o programa, até mais.");
                chave = 0;
            }
        }while(chave == 1);
        
    }
    public static int Menu(){
        int escolha, chave;
        Scanner input = new Scanner(System.in);
        
        System.out.println(" *  *  * ");
        System.out.println("   Menu ");
        System.out.println("1 - Converter de Graus para Fahrenheit");
        System.out.println("2 - Converter de Fahrenheit para Graus");
        System.out.println("3 - Encerrar o programa");
        System.out.println(" *  *  * ");
        do{
            escolha = input.nextInt();
            if(escolha == 1 || escolha == 2 || escolha == 3){
                chave = 1;
            }else{
                System.out.println("opçao invalida, tente novamente.");
                chave = 0;
            }
        }while(chave == 0);
       
        return escolha;
    }
    public static double GrausF(double entrada){
        double c = entrada;
        double f;
        
        f = c *1.8 + 32;
        
        return f;
    }
    public static double FGraus(double entrada){
        double f = entrada;
        double c;
        
        c = (f - 32)/1.8;
        
        return c;
    }
    
}
