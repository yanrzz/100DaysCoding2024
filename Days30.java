
package pkg100dayscoding;
import java.math.BigDecimal;
public class Days30 {
    public static void main(String[] args) {
        // inisialisasi BigDecimal
        BigDecimal a = new BigDecimal("1.2345678909876576577577");
        BigDecimal b = new BigDecimal("1.23456789098765432");
        BigDecimal c = new BigDecimal("1.23456789098765432123");
        BigDecimal d = new BigDecimal("1.234567890987654321234");
        
       // operasi aritmatika
       BigDecimal jumlah = a.add (b); // penjumlahan (a+b)
       BigDecimal kurang = a.subtract (b); // pengurangan (b-a)
       BigDecimal kali = a.multiply (b); // perkalian (a*b)
    
       // hasil nya
       System.out.println("penjumlahan: "+ jumlah);
       System.out.println("pengurangan "+ kurang);
       System.out.println("perkalian: "+ kali);
       
    }
          
    
}
