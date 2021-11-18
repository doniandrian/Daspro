/**
 * @author Doni Andrian
 * @version 29 Oktober 2021
 * pertama masukan input kata
 * deklarasi variabel temp untuk menyimpan kata 
 * selama temp bukan stop maka looping terus
 * jika turnleft awal2 ++ 
 * jika turnright awal1 --
 * jika forward awal2 ++
 */
import java.util.Scanner;
public class turtle {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String kata1 = input.next();
        String kata2;
        int awal1 = 0;
        int awal2 = 0;
        String temp = kata1;
        int count = 0;

        while (!temp.equals("stop") && count < 1000) {
            if (temp.equals("turnLeft")){
                awal2 --;
                ;
            }else if(temp.equals("turnRight")){
                
                awal1 ++;
            }else if (temp.equals("foward")){
                awal2 ++;
                
            }else if (temp.equals("turnRight")){
                awal2--;
            }
                
            
            kata2 = input.next();
            temp = kata2;
            count++;



        }
        System.out.println(awal1 +" " + awal2);   
        
    }
    
}

