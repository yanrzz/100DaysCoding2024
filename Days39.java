
package pkg100dayscoding;

import java.util.Scanner;

public class Days39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai a: ");
        int a = input.nextInt();
        a %= 10;
        System.out.println("modulus dari a "+ a);
    }
 
}
