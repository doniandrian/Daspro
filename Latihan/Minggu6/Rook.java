/**
 * @author Doni Andrian
 * @version 21 Oktober 2021
 */

import java.util.Scanner;
public class Rook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        input.close();

        //cek sah atau tidak

        if (x1 == x2 || y1 == y2){
            //cek ke arah mana benteng bergerak
            if (x1>x2 && y1==y2){
                System.out.println("Kiri");
            }else if((x1<x2 && y1 == y2)){
                System.out.println("Kanan");

            }else if(y1<y2 && x1==x2){
                System.out.println("Maju");
            }else{
                System.out.println("Mundur");
            }

        }else{
            System.out.println("Tidak sah");
        }





    }
    
}
