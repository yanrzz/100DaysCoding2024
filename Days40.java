package pkg100dayscoding;
import java.util.Scanner;
public class Days40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=======soal1========");
        System.out.print("Masukan umur anda: ");
        byte umur = input.nextByte();
        System.out.println("Umur anda adalah "+ umur +" th ");
        System.out.println("=======soal2========");
        System.out.print("masukan tinggi Badan: ");
        String tb = input.next();
        int a = Integer.parseInt(tb);
        System.out.println("TInggi badan anda adalah "+ tb +"cm");
        System.out.println("========soal3=========");
        System.out.print("masukan angka: ");
        int b = input.nextInt();
        System.out.print("Masukan angka: ");
        int c = input.nextInt();
        int d = b += c;
        int e = b -= c;
        System.out.println("Jumlah nilai pertama dan kedua "+ d);
        System.out.println("hasil pengurangan nilai pertama dan kedua "+ e);
        System.out.println("========soal4==========");
        System.out.println("hasil penjumlaha "+ d );
        System.out.println("apakah hasil penjumlahan lebih besar 2 "+ (d > 2));
        System.out.println("hasil pengurangan "+ e);
        System.out.println("apakah hasil pengurangan lebih kecil "+ (2 < 2));
        
        
    }
}
    

