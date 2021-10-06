
package Lista_04_condicionais_1;

import java.util.Scanner;
public class exercicio_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int idade;
        String resp = null;
        idade = input.nextInt();
        if(idade>=18){
            resp = "é";
            System.out.println("Esta pessoa tem "+idade+" anos e "+resp+" maior de idade.");
        }else{
           resp = "não é";
            System.out.println("Esta pessoa tem "+idade+" anos e "+resp+" maior de idade."); 
        }
        
    }
}
