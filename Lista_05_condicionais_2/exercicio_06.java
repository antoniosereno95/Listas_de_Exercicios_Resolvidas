
package Lista_05_condicionais_2;

import java.util.Scanner;
public class exercicio_06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double lado1 , lado2 , lado3;
        int i;
        
        lado1= input.nextDouble();
        lado2= input.nextDouble();
        lado3= input.nextDouble();
        
        i = 0;
        if(lado1 > lado2 + lado3){
            i = 2;
        }
        if(lado2 > lado1 + lado3){
            i = 2;
        }
        if(lado3 > lado2 + lado1){
            i = 2;
        }
        
        if( i == 0 ){
            System.out.println("os tres seguimentos formam um triangulo");
        }else{
            System.out.println("os tres seguimentos nao formam um triangulo");
        }
    }
}
