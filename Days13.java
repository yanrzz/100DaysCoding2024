
package pkg100dayscoding;
public class Days13 {
    public static void main(String[] args) {
        final String nama = "Yusran";
        int tahunLahir;
        tahunLahir = 2006;
        double tinggiBadan;
        tinggiBadan = 170.3;
        System.out.println("nama :"+ nama);
        System.out.println("tahun :"+ tahunLahir);
        System.out.println("tinggi :"+ tinggiBadan +"cm");
        // setelah update
        tinggiBadan = 170.4;
        tahunLahir = 2007;
        System.out.println("=========");
        System.out.println("nama "+ nama);
        System.out.println("tahun :"+ tahunLahir);
        System.out.println("tinggi :"+ tinggiBadan + "cm");
        // memakai printf
        System.out.println("=======");
        System.out.printf("nama %s%ntahunlahir %d%ntinggi %f%s ","Yusran",2006,170.4,"cm");
    }
    
}
