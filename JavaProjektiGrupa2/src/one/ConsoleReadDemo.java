
package one;

import java.util.Scanner;

public class ConsoleReadDemo {
    public static void main(String[] args) {
        System.out.println("Molim vas unesite neki broj");
        Scanner nasScanner=new Scanner (System.in);
         int uneseniBroj=nasScanner.nextInt();
         System.out.println("Hej,ti si unio broj: "+ uneseniBroj);
         
         
    }
    
}
