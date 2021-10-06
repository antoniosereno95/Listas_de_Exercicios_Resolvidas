
package Lista_04_condicionais_1;

import java.util.Scanner;
public class exercicio_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m , n;
        
        m = input.nextInt();
        n = input.nextInt();
        if(m%n == 0){
           System.out.println(m+" é dividivel por "+n);
        }else{
           System.out.println(m+" nao é divisivel por "+n);
        }
        
    }
}
