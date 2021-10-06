package Lista_05_condicionais_2;

import java.util.Scanner;
public class exercicio_07 {
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
            
            if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                
                if(lado1 == lado2 && lado2 == lado3){
                System.out.println("os tres seguimentos formam um triangulo equilatero");
                }else{
                    System.out.println("os tres seguimentos formam um triangulo isoceles");
                }
            
            }else{
                System.out.println("os tres seguimentos formam um triangulo escaleno");
            }
            
        }else{
            System.out.println("os tres seguimentos nao formam um triangulo");
        }
        
    }
}

