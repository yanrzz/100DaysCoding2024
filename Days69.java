
package pkg100dayscoding;

import java.util.Scanner;

public class Days69 {
    public static void main(String[] args) {
       yy();
    }public static void yy(){
      Scanner input = new Scanner(System.in);
            System.out.print("N:");
            int a = input.nextInt();
            int b = yu(a);
            System.out.println(a + "*" + "3" + "="+ b);
            for (int i = 0 ; i < 3; i++) {
                for (int j = 0; j < a; j++) {
                 System.out.print("* ");
                }System.out.println();
            }
    }public static int yu(int x){
        return x * 3;
    }
    }
 

