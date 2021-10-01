/**
 * 
 */

import java.util.Scanner;
public class Remote_tv2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int awal1 = input.nextInt();
        int akhir1 = input.nextInt();
        int awal2 = input.nextInt();
        int akhir2 = input.nextInt();
        int awal3 = input.nextInt();
        int akhir3 = input.nextInt();

        int tombol1 = Math.abs(akhir1 - awal1);
        int tombol2 = 100 + (awal2 - akhir2);
        int tombol3 = 100 + awal3 + akhir3;
        System.out.println(tombol1);
        System.out.println(tombol2);
        System.out.println(tombol3);




        
    }
    
}
