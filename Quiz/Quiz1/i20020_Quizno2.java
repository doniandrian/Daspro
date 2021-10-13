/**
 * pertama ubah dahulu string ke integer menggunakan method Integer.parseInt
 * kemudian ubah ke unicode menggunakan prinf(%c)
 * @author Doni Andrian
 * @version 13 Oktober 2021
 */
import java.util.Scanner;
public class i20020_Quizno2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hex = input.next();
        
        int dec = Integer.parseInt(hex,16);
       
        System.out.printf("%c",dec);





    }


    
}
