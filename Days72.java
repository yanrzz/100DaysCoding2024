
package pkg100dayscoding;
public class Days72 {
    public static void main(String[] args) {
        int a = c(10);
        System.out.println(a);
    }public static int c(int a){
        if(a > 0){
            return a +  c(a - 1);
        }else{
            return 0;
        }
    }
}
