
package Lista_02;

import java.util.Scanner;
public class exercicio_D {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x1;
        int y1;
        int altura;
        int largura;
        
        x1 = input.nextInt();
        y1 = input.nextInt();
        altura = input.nextInt();
        largura = input.nextInt();
        
        System.out.println("  " + "("+x1+","+y1+")" + "    " +"("+(x1+largura)+","+y1+")" + "\n" + "  " + "("+x1+","+(y1-altura)+")" + "    " +"("+(x1+largura)+","+(y1-altura)+")");
    }
}
