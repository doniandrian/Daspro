/**
 * @author Doni Andrian
 * @version 26 Oktober 2021
 */
import java.util.Random;
import java.util.Scanner;
public class M070220020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int iqStandar = 40; 
        int iqTarget = sc.nextInt();
        int count = 0;

        while (iqStandar < iqTarget){
            iqStandar += 10 + rand.nextInt(41);
            count++;

        }
        System.out.println(count);


        
    }
    
}
