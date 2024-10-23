
package pkg100dayscoding;

import java.util.Scanner;

public class Days52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan angka");
        int a = input.nextInt();
        String hasil = a %2 == 0 ?"genap ":"ganjil";
        System.out.println(hasil);

    }
}
