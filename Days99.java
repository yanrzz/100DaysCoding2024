
package pkg100dayscoding;
import java.util.Scanner;
public class Days99 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = input.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();
        double hasil = 0;
        switch(operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                if(angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                } else {
                    System.out.println("Tidak bisa di bagi nol");
                }
                break;
                
            default:
                System.out.println("masukan operator yang valid");
        }
    }
}

