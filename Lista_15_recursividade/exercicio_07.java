
package Lista_15_recursividade;

import java.util.Scanner;
public class exercicio_07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("digite n1:");
        int n1 = input.nextInt();
        
        System.out.println("digite n2:");
        int n2 = input.nextInt();
        
        int res = Mult(n1,n2);
        System.out.println(res);
        
    } public static int Mult(int n1 , int n2){
        int mult;
        if(n2 == 1){
            return n1;
        }else{
            return mult = n1 + Mult(n1 , n2-1);
        }
    }
    
}
