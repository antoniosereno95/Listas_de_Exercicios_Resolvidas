
package Lista_06_condicionais_3;

import java.util.Scanner;
public class exercicio_03 {
    public static void main(String[] args){
        Scanner input = new  Scanner(System.in);
        double cr;
        String resp = null;
        System.out.println("digite o CR do aluno em questao:");
        cr = input.nextDouble();
        
        if(cr>=9.0){
          resp = "Altamente recomendado" ; 
        }else if(cr>=8.0 && cr<9.0){
            resp = "Fortemente recomendado";
        }else if(cr>=7.0 && cr <8.0){
            resp = "Recomendado";
        }else if(cr<7.0){
            resp = "Não recomendado";
        }
        
        System.out.println("Este aluno é "+resp+".");
    }
}
