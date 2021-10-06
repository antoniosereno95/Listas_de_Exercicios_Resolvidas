
package Lista_09_repetiçao_3;

import java.util.Scanner;
public class exercicio_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        /*
        1ªQuestão - Implemente um programa para solicitar ao usuário a idade 
        (de 1 a 120), o peso (de 3 a 300), a altura (0.5 a 2.5), a cor dos 
        olhos (A para azul, P para preto, V para verde e C para castanho) 
        e a cor dos cabelos (P para preto, C para Castanho, L para Louro e 
        R para ruivo) de um grupo de pessoas.
        
        A quantidade de pessoas do grupo deve ser informada pelo usuário no início 
        do programa e deve ser, no mínimo, um.
        O programa deve calcular e exibir:
        • A quantidade de pessoas com idade superior a 50 anos e peso inferior 
        a 60 quilos;
        • A média das idades das pessoas com altura inferior a 1,50m;
        • A percentagem de pessoas com olhos azuis entre todas as pessoas 
        analisadas;
        • A quantidade de pessoas ruivas e que não possuem olhos azuis;
        • O peso da pessoa mais magra;
        • A altura da pessoa mais alta.
        OBS: Para todas as entradas de dados, o programa deve forçar o 
        usuário a digitar valores válidos.
        */
        
        int idade;
        double peso;
        double altura;
        char olhos;
        char cabelo;
        int grupo;
        
        System.out.println("digite o numero de pessoas no grupo em questao:");
        grupo = input.nextInt();
        if(grupo < 1){
            while(grupo < 1){
                System.out.println("numero invalido tente novamente(maior ou igual a 1).");
                grupo = input.nextInt();
            }
        }
        
        int cont_pessoa_50_60 = 0;
        int cont_idade_altura_menor_15 = 0;
        double soma_idade = 0;
        double media_idade_altura_menor_15;
        int cont_olhos_azuis = 0;
        double por_olhos_azuis;
        int cont_ruivo_nao_azul = 0 ;
        double mais_magra = Integer.MAX_VALUE;
        double mais_alta = Integer.MIN_VALUE ;
        
        for(int i = 0 ; i < grupo ; i++){
            
            System.out.println("digite a idade do individou "+(i+1)+" :");
            idade = input.nextInt();
            if(idade<1 || idade>120){
                while(idade<1 || idade>120){
                    System.out.println("idade invalida tente novamente(1 a 120).");
                    idade = input.nextInt();
                }
            }
            
            
            System.out.println("digite o peso do individou "+(i+1)+" :");
            peso = input.nextDouble();
            if(peso< 3 || peso >300){
                while(peso< 3 || peso >300){
                    System.out.println("peso invalido tente novamente(3 a 300).");
                    peso = input.nextDouble();
                }
            }
            
            
            System.out.println("digite a altura do individou "+(i+1)+" :");
            altura = input.nextDouble();
            if( altura < 0.5 || altura > 2.5){
                while(altura < 0.5 || altura > 2.5){
                    System.out.println("altura invalida tente novamente(0.5 a 2.5 metros).");
                    altura = input.nextDouble();
                }
            }
            
            int chave;
            System.out.println("digite a cor dos olhos do individou "+(i+1)+" :");
            olhos = input.next().charAt(0);
            //olhos = Character.toUpperCase(olhos); **nao esta funcionando
            if(olhos == 'A' || olhos == 'P' || olhos == 'V' || olhos == 'C'){
                chave = 1; // valor desnecesario mas o programa so funciona assim com esse if.
            }else{
                do{
                    System.out.println("cor do olho invalida tente novamente(A para azul, P para preto, V para verde e C para castanho).");
                    olhos = input.next().charAt(0);
                    //olhos = Character.toUpperCase(olhos); **nao esta funcionando
                    if(olhos == 'A' || olhos == 'P' || olhos == 'V' || olhos == 'C'){
                        chave = 1;
                    }else{
                        chave = 0;
                    }
                }while(chave == 0);
            }
            
            
            System.out.println("digite a cor dos cabelos do individou "+(i+1)+" :");
            cabelo = input.next().charAt(0);
            //cabelo = Character.toUpperCase(cabelo); **nao esta funcionando
            if(cabelo == 'P' || cabelo == 'C' || cabelo == 'L' || cabelo == 'R'){
                chave = 1; // valor desnecesario mas o programa so funciona assim com esse if.
            }else{
                do{
                    System.out.println("cor do olho invalida tente novamente(A para azul, P para preto, V para verde e C para castanho).");
                    cabelo = input.next().charAt(0);
                    //cabelo = Character.toUpperCase(cabelo); **nao esta funcionando
                    if(cabelo == 'P' || cabelo == 'C' || cabelo == 'L' || cabelo == 'R'){
                        chave = 1;
                    }else{
                        chave = 0;
                    }
                }while(chave == 0);
            }
            
            
            //calculos especificos
            if(idade > 50 && peso < 60){
               cont_pessoa_50_60++;
            }
            
            if(altura < 1.5){
                cont_idade_altura_menor_15++;
                soma_idade += idade; 
            }
            
            if(olhos == 'A'){
                cont_olhos_azuis++;
            }
            
            if(cabelo == 'R' && olhos != 'A'){
                cont_ruivo_nao_azul++;
            }
            
            if(peso < mais_magra){
                mais_magra = peso;
            }
            
            if(altura > mais_alta){
                mais_alta = altura;
            }
            
        }
        
        media_idade_altura_menor_15 = soma_idade / cont_idade_altura_menor_15;
        
        por_olhos_azuis = cont_olhos_azuis*100 / grupo;
        
        
        System.out.println("A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos é: "+cont_pessoa_50_60);
        
        System.out.println("A média das idades das pessoas com altura inferior a 1,50m foi de: "+media_idade_altura_menor_15);
        
        System.out.println("A percentagem de pessoas com olhos azuis entre todas as pessoas analisadas foi de: "+por_olhos_azuis);
        
        System.out.println("A quantidade de pessoas ruivas e que não possuem olhos azuis é de: "+cont_ruivo_nao_azul);
        
        System.out.println("O peso da pessoa mais magra é: "+mais_magra);
        
        System.out.println("A altura da pessoa mais alta é: "+mais_alta);
        
    }
}

