
package pkg100dayscoding;

import java.util.Scanner;

public class Days58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai awal: ");
        int a = input.nextInt();
        System.out.print("Masukan nilai akhir: ");
        int b = input.nextInt();
        while(a >= b){
        System.out.print(a+" ");
        a--;    
        }
        
    }
}
