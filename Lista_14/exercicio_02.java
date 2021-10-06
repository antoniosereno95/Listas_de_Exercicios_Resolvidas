
package Lista_14;

import java.util.Scanner;
public class exercicio_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        2 - Implemente um programa para, dada uma figura geométrica, 
        que pode ser um retângulo ou um círculo, e um ponto qualquer, 
        verificar se o ponto encontra-se dentro da figura. O programa 
        deve ter obrigatoriamente duas funções:
        (a) Uma função que recebe como parâmetros as coordenadas de um 
        retângulo (vértice superior esquerdo e vértice inferior direito) 
        e as coordenadas do ponto. A função deverá retornar true se 
        o ponto estiver dentro do retângulo. Caso contrário, deve 
        retornar false.
        (b) Uma função que recebe como parâmetros os dados de um círculo 
        (coordenadas do centro e comprimento do raio) e as coordenadas 
        do ponto. A função deverá retornar true se o ponto estiver 
        dentro do círculo. Caso contrário, deve retornar false.
        OBS1: O programa deverá forçar a entrada de valores positivos 
        para as coordenadas do retângulo, para os dados do círculo e para 
        as coordenadas do ponto.
        OBS2: O main deverá permitir que o usuário execute as funções dos 
        itens (a) e (b) quantas vezes desejar.
        Sugestão: Implemente uma função para calcular a distância entre 
        dois pontos. Esta função deverá ser utilizada pela função 
        do item (b).
        */
        int opçao;
        boolean dentro = false;
        do{
            Menu();
            opçao = input.nextInt();
            while(opçao<1 || opçao>3){
                System.out.println("opçao fora do intervalo de 1 a 3, tente novamente.");
                opçao = input.nextInt();
            }
            if(opçao == 3){
                System.out.println("Encerrando o programa, ate mais.");
            }else{
                if(opçao == 1){
                    
                    System.out.println("digite as coordenadas de um retângulo");
                    System.out.println("vértice superior esquerdo(x,y):");
                    double VSx = input.nextDouble();double VSy = input.nextDouble();
                    while(VSy<0 || VSx<0){System.out.println("as cooderanadas devem ser sempre numeros positivos, tente novamente.");VSx = input.nextDouble();VSy = input.nextDouble();}
                    
                    System.out.println("e vértice inferior direito(x,y):");
                    double VIx = input.nextDouble();double VIy = input.nextDouble();
                    while(VIy<0 || VIx<0){System.out.println("as cooderanadas devem ser sempre numeros positivos, tente novamente.");VIx = input.nextDouble();VIy = input.nextDouble();}
                    while(VIy>VSy || VIx>VSx){
                        System.out.println("as coordenadas do vertice inferior do retangulo devem estar a baixo da coordenasa do vertice superior do retangulo(devem apresentar valor menor e diferente das coordenadas do vertice superior), tente novamente");
                        VIx = input.nextDouble();VIy = input.nextDouble();
                    }
                    
                    System.out.println("digite as coordenadas do ponto(x,y):");
                    double Px = input.nextDouble();double Py = input.nextDouble();
                    while(Py<0 || Px<0){System.out.println("as cooderanadas devem ser sempre numeros positivos, tente novamente.");Px = input.nextDouble();Py = input.nextDouble();}
                    dentro = Retangulo(VSx , VSy , VIx , VIy , Px , Py);
                    
                }else if(opçao == 2){
                    
                    System.out.println("digite as coordenadas do centro do Circulo(x,y):");
                    double Cx = input.nextDouble();double Cy = input.nextDouble();
                    while(Cy<0 || Cx<0){System.out.println("as cooderanadas devem ser sempre numeros positivos, tente novamente.");Cx = input.nextDouble();Cy = input.nextDouble();}
                    
                    System.out.println("digite o raio da circunferencia:");
                    double raio = input.nextDouble();
                    while(raio<=0){System.out.println("o raio deve ser smepre maior que zero, tente novamente.");raio = input.nextDouble();}
                    
                    System.out.println("digite as coordenadas do ponto(x,y):");
                    double Px = input.nextDouble();double Py = input.nextDouble();
                    while(Py<0 || Px<0){System.out.println("as cooderanadas devem ser sempre numeros positivos, tente novamente.");}
                    dentro = Circulo(Cx , Cy , raio , Px , Py);
                    
                }
            }
            if(dentro == true){
                System.out.println("O ponto se encontra dentro do poligono.\n");
            }else{
                System.out.println("O ponto nao esta dentro do poligono.\n");
            }
        }while(opçao != 3);
    }
    public static void Menu(){
        System.out.println("***MENU***");
        System.out.println("1 - Calculo do ponto dentro do Retangulo.");
        System.out.println("2 - Calculo do ponto dentro do Circulo.");
        System.out.println("3 - Encerrar o programa.");
    }
    public static boolean Retangulo(double VSx , double VSy , double VIx , double VIy , double Px , double Py){
         boolean dentro = false;
         double chave1 = 0 , chave2 = 0;
         
         if( VSx>Px && VIx<Px ){
             chave1 = 1;
         }
         if( VSy>Py && VIy<Py ){
             chave2 = 1;
         }
         if(chave1 == 1 && chave2 == 1){
             dentro = true;
         }
        
         return dentro;
    }
    public static boolean Circulo(double Cx , double Cy , double raio , double Px , double Py){
        boolean dentro = false;
        double aux1 , aux2 , aux3 , aux4 , aux5 , aux6;
        
        aux1 = Cx - Px;
        aux2 = Cy - Py;
        aux3 = Math.pow(aux1 , 2);
        aux4 = Math.pow(aux2 , 2);
        aux5 = aux3 + aux4;
        aux6 = Math.sqrt(aux5);
        
        if(aux6 > raio){
            dentro = true;
        }
        return dentro;
    }
}
