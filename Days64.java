
package pkg100dayscoding;
public class Days64 {
    public static void main(String[] args) { 
        yusran:
        for (int i = 1; i <= 10; i++) {
            if(i == 6){
                break yusran;
         }System.out.print(i);
        }
        System.out.println(" ");
        sran:
        for (int j = 1; j <= 15; j++) {
            if(j == 4){
              break sran; 
            }System.out.print(j);
        }System.out.println(" ");
    }
}
