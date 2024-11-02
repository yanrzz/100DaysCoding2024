
package pkg100dayscoding;
import java.util.Scanner;
public class Days62 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        while(true){
            int a = input.nextInt();
             if(a == 0){
                System.out.println("tidak ada kelipatan "+k);
                break;
            }
            if(a %k == 0){
                System.out.println(a+"adalah kelipatan"+k);
               break;
        }
        
    }
    }
}