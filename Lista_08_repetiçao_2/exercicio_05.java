
package Lista_08_repetiçao_2;

import java.util.Scanner;
public class exercicio_05 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       /*
       Em um lugar chamado Paraíso Feliz, para votar em uma eleição,
       uma pessoa deve ter idade entre 18 e 90 anos. No Paraíso Feliz 
       moram apenas 100 pessoas. Implemente um programa para solicitar ao
       usuário a idade de cada pessoa e determinar se esta pessoa pode ou 
       não votar. Para cada pessoa, o programa deve exibir a seguinte frase: 
       “Esta pessoa tem ________ anos e [pode / não pode] votar.” Ao final, 
       o programa deve exibir o total e o percentual de votantes e não 
       votantes. OBS: O programa deve forçar a digitação de idades no 
       intervalo de 1 a 120.
       */
       
       int populaçao = 10;
       int idade;
       int soma_vota = 0 , soma_nao_vota = 0;
       
       for(int i = 0 ; i < populaçao ; i ++){
           System.out.println("Digite a idade da pessoa:");
           idade = input.nextInt();
           if(idade>18 && idade<90){
               soma_vota++;
               System.out.println("Esta pessoa tem "+idade+" anos e pode votar.");
           }else{
               soma_nao_vota++;
               System.out.println("Esta pessoa tem "+idade+" anos e nao pode votar.");
           }
       }
       
       double por_vota , por_nao_vota;
       
       por_vota = soma_vota*100 / populaçao;
       por_nao_vota = soma_nao_vota*100 / populaçao;
       
       System.out.println("O total de pessoas que votaram foi "+soma_vota+" e a porcentagem de pessoas que votaram é de "+por_vota);
       
       System.out.println("O total de pessoas que votaram foi "+soma_nao_vota+" e a porcentagem de pessoas que votaram é de "+por_nao_vota);
       
    }
}
