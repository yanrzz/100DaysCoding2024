
package pkg100dayscoding;
import java.math.BigInteger; // untuk menggunakan BigInteger, perlu import
public class Days29 {
    public static void main(String[] args) {
        // inisialisasi BigInteger
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("2");
        BigInteger c = new BigInteger("10");
        BigInteger d = new BigInteger("12");
       // operasi aritmatika
       BigInteger jumlah = a.add(b); // penjumlahan (a+b)
       BigInteger kurang = b.subtract(a); // pengurangan (b-a)
       BigInteger kali = a.multiply(c); // perkalian (a*b)
       BigInteger bagi = c.divide(b); // pembagian (b/a)
       // hasil nya
       System.out.println("penjumlahan: "+ jumlah);
       System.out.println("pengurangan "+ kurang);
       System.out.println("perkalian: "+ kali);
       System.out.println("pembagian: "+ bagi);
        
        
    }
    
}
