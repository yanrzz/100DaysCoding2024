
package pkg100dayscoding;

import java.util.Scanner;

public class Days49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan angka");
        int a = input.nextInt();
        if(a >= 1 && a < 10){
            System.out.println("satuan");
        }else if(a >= 10 && a < 100){
            System.out.println("puluhan");
        }else if(a >= 100 && a <1000){
            System.out.println("ratusan");
        }else if(a >= 1000 && a <1000000){
            System.out.println("ribuan");  
        }
    }
 
}
