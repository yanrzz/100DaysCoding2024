
package pkg100dayscoding;

import java.util.Scanner;

public class Days57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan nilai awal: ");
        int a = input.nextInt();
        System.out.print("masukan nilai akhir: ");
        int b = input.nextInt();
        while(a <= b){
            System.out.print(a+" ");
            a++;
        }
    }
}
