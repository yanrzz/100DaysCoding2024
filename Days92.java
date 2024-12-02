
package pkg100dayscoding;

import java.util.Scanner;

public class Days92 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 2 * a - 1; j++) {
                if(j == i || j == 2 * a - 2 - i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
 
}
