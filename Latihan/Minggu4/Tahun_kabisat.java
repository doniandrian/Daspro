/**
 * 
 * @author Doni Andrian
 * @version 6 Oktober 2021
 */

import java.util.Scanner;
public class Tahun_kabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tahun = input.nextInt();

        if (tahun % 400 == 0){
            System.out.println("Kabisat");

        }else if(tahun%100==0){
            System.out.println("Bukan Kabisat");
        }else if(tahun % 4==0){
            System.out.println("Kabisat");

        }else{
            System.out.println("Bukan Kabisat");
        }
        

    }
    
}
