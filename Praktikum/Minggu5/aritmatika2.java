/**
 * @author Doni Andrian
 * @version 19 Oktober 2021
 */

import java.util.Scanner;
public class aritmatika2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max,mid,min;
        


        if (a>b && a > c && b>c){
            max = a;
            mid = b;
            min = c;
        }else if(b > a && b>c && a > c){
            max = b;
            mid = a;
            min = c;
        }else if(a>b && a > c && c>b){
            max = a;
            min = b;
            mid = c;
        }else if(b > a && b>c && c > a){
            max = b;
            mid = c;
            min = a;
        }else if(c > a && c > b && a > b){
            max = c;
            mid = a;
            min = b;
        }else{
            max = c;
            mid = b;
            min = a;

        }
        

        int selisih = max - mid;
        int nilai = max + selisih;
        System.out.println(nilai);
        
    }
    
}
