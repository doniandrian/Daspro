/**
 * @author Doni Andrian
 * @version 26 Oktober 2021
 */
import java.util.Random;
import java.util.Scanner;
public class M070320020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int iqStandar = 40; 
        int iqTarget = sc.nextInt();
        int count = 0;

        do{
            iqStandar += 10 + rand.nextInt(41);
            count++;
        }
        while (iqStandar < iqTarget);
            
    
        
        System.out.println(count);


        
    }
    
}
