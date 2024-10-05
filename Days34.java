
package pkg100dayscoding;
import java.util.Scanner;
public class Days34 {
    public static void main(String[] args) {
         Scanner a = new Scanner(System.in);
        String nama,kelas,nim;
        int angkatan;
        System.out.print("masukan nama: ");
       nama = a.nextLine();
        System.out.print("masukan kelas: ");
        kelas = a.nextLine();
        System.out.print("nim: ");
        nim = a.nextLine();
        System.out.print("angkata: ");
        angkatan = a.nextInt();
        System.out.println("nama saya "+ nama +" kelas "+ kelas +" nim "+ nim +" angkatan "+ angkatan);

    }
    
}
