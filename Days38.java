
package pkg100dayscoding;

import java.util.Scanner;

public class Days38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("masukan a: ");
        a = input.nextInt();
        System.out.print("Masukan b: ");
        b = input.nextInt();
        a *= b;
        System.out.println("hasil perkalian "+ a);
        a %= b;
        System.out.println("hasil modulus "+ a);
        
        
    }
}
