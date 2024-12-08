
package pkg100dayscoding;
import java.util.Scanner;
public class Days98 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai x: ");
        int x = input.nextInt();
        System.out.print("Masukkan nilai y: ");
        int y = input.nextInt();
        int jumlah = 0;
        System.out.print("Bilangan genap dari " + x + " sampai " + y + " adalah: ");
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                jumlah += i;
            }
        }
        
        System.out.println("\nJumlah bilangan genap: " + jumlah);
    }
}
