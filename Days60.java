
package pkg100dayscoding;

import java.util.Scanner;

public class Days60 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        int a = 0;
        String b;
        do{
            System.out.print("Masukan Angka: ");
            int c = input.nextInt();
            a += c;
            System.out.print("y/n");
            b = input.next();
        }while (b.equalsIgnoreCase("y"));
        System.out.print("total: "+ a);
        System.out.println(" ");        
    }
}
