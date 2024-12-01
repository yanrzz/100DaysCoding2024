
package pkg100dayscoding;

import java.util.Scanner;

public class Days91 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        while(true){
            System.out.print("Masukan bilangan: ");
            int a = input.nextInt();
            if(a %2 == 0){
                System.out.println("Genap");
            }else{
                System.out.println("You and I, end");
                break;
            }
        }
    }
}
