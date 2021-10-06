
package Lista_04_condicionais_1;

import java.util.Scanner;
public class exercicio_08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double peso =0;
        double altura;
        double peso_usuario;
        System.out.println("peso: ");
        peso_usuario = input.nextDouble();
        System.out.println("altura: ");
        altura = input.nextDouble();
        char sexo;//(masculino / feminino)
        System.out.println("sexo: ");
        sexo = input.next().charAt(0);
        
        if(sexo == 'm'){
            peso = (72.7 * altura) - 58;
        }
        if(sexo == 'f'){
            peso = (62.1 * altura) - 44.7;
        }    
        System.out.println("o seu peso ideal é: "+peso);
        double diferença = 0;
        if(peso > peso_usuario){
            diferença = peso - peso_usuario;
            System.out.println("o seu peso esta mais baixo que o peso ideal e vc deve engordar um total de: "+diferença);
        }
        if(peso < peso_usuario){
            diferença = peso_usuario - peso;
            System.out.println("o seu peso esta mais alto que o peso ideal e vc deve emagrecer um total de: "+diferença);
        }
    }
}
