
package pkg100dayscoding;

import java.util.Scanner;

public class Days97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batas angka: ");
        int batas = scanner.nextInt();    
        boolean[] isPrima = new boolean[batas + 1];
        for (int i = 2; i <= batas; i++) {
            isPrima[i] = true;
        }
        for (int p = 2; p * p <= batas; p++) {
            if (isPrima[p]) {
                for (int i = p * p; i <= batas; i += p) {
                    isPrima[i] = false; 
                }
            }
        }
        System.out.println("Bilangan prima dari 1 hingga " + batas + " adalah:");
        for (int i = 2; i <= batas; i++) {
            if (isPrima[i]) {
                System.out.print(i + " ");
            }
        }
    
    }
 
}
