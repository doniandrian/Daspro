/**
 * 
 * @author Doni Andrian
 * @version 11 oktober 2021
 */
import java.util.Scanner;
public class dodo_matoa_ajaib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long p = input.nextLong(); //input banyak daun
        long q = input.nextLong(); //input banyak ranting

        long n = p * q; //hitung banyaknya buah matoa
        System.out.println(n);
        
    }
    
}
