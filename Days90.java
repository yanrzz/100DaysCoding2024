
package pkg100dayscoding;

import java.util.Scanner;

public class Days90 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai tugas: ");
        int a = input.nextInt();
        System.out.print("Nilai UTS: ");
        int b = input.nextInt();
        System.out.print("Nilai UAS: ");
        int c = input.nextInt();
        double d = (a * 0.30)+(b * 0.35)+(c * 0.35);
        System.out.println("nilai akhir: "+ d);
        if(d >= 75){
            System.out.println("Status:Lulus");
        }else{
            double e = 75 - d;
            System.out.println("Status:Tidak Lulus");
            System.out.println("Kekurangan nilai "+ e);
        }
    }
    
}
