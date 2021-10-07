/**
 * 
 * @author Doni Andrian
 * @version 6 Oktober 2021
 */
import java.util.Scanner;
public class Jam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jam = input.nextInt();
        int h = 0;

        if (jam<12){
            System.out.println(jam+" a.m.");

        }else{
            h = jam -12;
            System.out.println(h +" p.m.");
        }
        
        
        
        // if (jam>12){
        //     h = jam - 12;

        //     System.out.println(h+ " p.m.");
        // }
        
        // else if(jam == 12){
        //     System.out.println(jam + " p.m.");
        // }
        // else if (jam <12 && jam > 0){
        //     System.out.println(jam + " a.m.");
        // }else if (jam==0){
           
        //     System.out.println(h + " a.m.");
        // }
    }
    
}
