
package Lista_04_condicionais_1;

import java.util.Scanner;
public class exercicio_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numb;
        String resp = null;
        
        numb = input.nextInt();
        if(numb%2 == 0){
            resp = "o numero é par";
        }else{
            resp = "o numero nao é par";
        }
        System.out.println(resp);
        
    }    
}
