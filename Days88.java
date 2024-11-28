
package pkg100dayscoding;

import java.util.Scanner;

public class Days88 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama: ");
        String a = input.nextLine();
        System.out.print("Jabatan: ");
        String b = input.nextLine();
        System.out.print("Lama kerja:");
        int c = input.nextInt();
        System.out.print("Jumlah anak");
        int d = input.nextInt();
        int e = 0;
        double f = 0;
        int g = 50000*d;
        if(b.equalsIgnoreCase("manajer")){
            e = 1000000;
        }else if(b.equalsIgnoreCase("supervisor")){
            e = 700000;
        }else if(b.equalsIgnoreCase("staf")){
            e = 500000;
            return;
        }
        if(c >= 2 && c <= 4){
            f = e * 0.1;
        }else if(c >= 5){
            f = e * 0.2;
        }
        if(d < 2){
            g = 0;
        }
        double i = e + f + g;
        System.out.println("=====================");
        System.out.println("Nama: " + a);
        System.out.println("Jabatan: " + b);
        System.out.println("Gaji pokok: " + e);
        System.out.println("Bonus: " + f);
        System.out.println("Tunjangan anak: " + g);
        System.out.println("Total gaji: " + i);
        }

  }

