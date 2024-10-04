
package pkg100dayscoding;

public class Days33 {
    public static void main(String[] args) {
       // int ke double 
        int a = 100;
        double b = a;
        System.out.println("nilai double "+ b);
        // double ke int
        int c = (int) b;
        System.out.println("nilai int " + c);
        // int ke string
        String d = String.valueOf(c);
        System.out.println("nilai string "+ d);
        System.out.println("menambahkan angka dua di string "+ (d + 2));
                
    }
    
}
