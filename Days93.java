
package pkg100dayscoding;

import java.util.Scanner;

public class Days93 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < (a - i - 1); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print(" ");
            }
            if(i > 0){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
