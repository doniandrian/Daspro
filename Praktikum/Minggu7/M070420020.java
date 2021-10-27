/**
 * @author Doni Andrian
 * @version 26 Oktober 2021
 */
import java.util.Scanner;
import java.util.Random;

public class M070420020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int iq = 40; 
        int jumlahlatian = sc.nextInt();
        


        for (int i = 0;true; i++) {
            iq += 10 + rand.nextInt(41);
            
        }
        
        System.out.println(iq);

    }
    
}
