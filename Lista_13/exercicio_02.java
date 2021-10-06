
package Lista_13;

import java.util.Scanner;
public class exercicio_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double reta1 = 0 , reta2 = 0 , reta3 = 0 , resposta;
        boolean ehtriangulo;
        String tipo_triangulo;
        
        do{
            System.out.println("Digite 3 seguimentos de reta:");
            System.out.println("seguimento de reta 1:");
            reta1 = input.nextDouble();
            while(reta1 <= 0){
                System.out.println("*os seguimentos precisam ser maior que zero.");
                reta1 = input.nextDouble();
            }
            System.out.println("seguimento de reta 2:");
            reta2 = input.nextDouble();
            while(reta2 <= 0){
                System.out.println("*os seguimentos precisam ser maior que zero.");
                reta2 = input.nextDouble();
            }
            System.out.println("seguimento de reta 3:");
            reta3 = input.nextDouble();
            while(reta3 <= 0){
                System.out.println("*os seguimentos precisam ser maior que zero.");
                reta3 = input.nextDouble();
            }
            
            ehtriangulo = Ehtriangulo(reta1 , reta2 , reta3);
            if(ehtriangulo == false){
                System.out.println("OS seguimentos de reta digitados nao formam um trinagulo.");
            
            }else if(ehtriangulo == true){
                tipo_triangulo = Tipotriangulo(reta1 , reta2 , reta3 );
                System.out.println("Os seguimentos digitaods formam um triangulo de tipo "+tipo_triangulo);
                
            } 
            
            System.out.println("Deseja continuar a execuçao do programa?");
            System.out.println("digite 1 para Sim ou 2 para NÂO");
            resposta = input.nextDouble();
            while(resposta != 1 && resposta != 2){
                System.out.println("opçao invalida, tente novamente.");
                resposta = input.nextDouble();
            }
            if(resposta == 2){
                System.out.println("Encerrando o programa, ate mais.");
            }
        }while(resposta != 2);
        
    }
    public static boolean Ehtriangulo(double reta1 , double reta2 , double reta3){
        boolean aux;
        if(reta1 < reta2 + reta3 && reta2 < reta1 + reta3 && reta3 < reta1 + reta2){
            aux = true;
        }else{
            aux = false;
        }
        return aux;
    }
    public static String Tipotriangulo(double reta1 , double reta2 , double reta3){
        String tipo = null;
        if(reta1 != reta2 && reta1 != reta3 && reta3 != reta2){
            tipo = "escaleno";
        }
        if(reta1 == reta2 || reta1 == reta3 || reta3 == reta2){
            if(reta1 == reta2 && reta2 == reta3){
                tipo = "equilatero";
            }else{
                tipo = "isoceles";
            }
        }
        
        return tipo;
    }
}
