
package pkg100dayscoding;

import java.util.ArrayList;
import java.util.Scanner;

public class Days89 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan kalimat: ");
        String a = input.nextLine();
        int b =0;
        ArrayList<Character> d = new ArrayList<>();
        for(char c : a.toCharArray()){
        d.add(c);
        if("aiueoAIUEO".indexOf(c) != -1){
        b++;
        }
        }
        System.out.println("Karakter: "+d);
        System.out.println("Jumlah huruf vokal: "+b);
    }
}


