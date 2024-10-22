
package pkg100dayscoding;

import java.util.Scanner;

public class Days51 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("masukan hurud (L/P) : ");
     String pil = input.nextLine();
     switch(pil){
         case"L":
             System.out.println("Laki-laki");
             break;
         case"P":
             System.out.println("Perempuan");
             break;
         default:
             System.out.println("Pilihan Salah");
             break;
      }
    }
}
