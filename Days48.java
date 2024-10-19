
package pkg100dayscoding;

import java.util.Scanner;

public class Days48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan angka "); 
        int a = input.nextInt();
        if(a > 0 && a <= 12){
            System.out.println("anak-anak ");
            return;
        }if(a > 12 && a <= 17){
            System.out.println("remaja");
            return;
        }if(a >= 18 && a <= 59 ){
            System.out.println("Dewasa"); 
        }else{
            System.out.println("lansia");  
          }
        }
    }
 
