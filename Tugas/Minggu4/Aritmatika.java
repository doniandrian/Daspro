/**
 * 
 * 
 * 
 * @author Doni Andrian
 * @version 7 oktober 2021
 */

import java.util.Scanner;
public class Aritmatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if ((a+b) == c){
            System.out.println("ada");


        }else if((b-a == c)||(a-b == c)){
            System.out.println("ada");
        }else if(a*b == c){
            System.out.println("ada");

        }else if((a/b == c) || (b/a == c)){
            System.out.println("ada");

        }else{
            System.out.println("tidak ada");
        }
        
    }
    
}
