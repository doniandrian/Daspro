/**
 * @author Doni Andrian
 * @version 21 Oktober 2021
 */
import java.util.Scanner;
public class Wombat_tv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sekarang = input.nextInt();
        int tujuan  = input.nextInt();
        input.close();
        //deklarasi variabel
        int rentang1, rentang2,tombol;

        //operasi
        if (sekarang>tujuan){
            rentang1 = sekarang-tujuan;
            rentang2 = 100 + tujuan - sekarang;
        }else{
            rentang1 = tujuan-sekarang;
            rentang2 = 100 + sekarang-tujuan;

        }
        if ((sekarang != tujuan) && (Math.abs(sekarang-tujuan)!= 50)){
            if (sekarang<tujuan){
                if (rentang1>=rentang2){
                    tombol = rentang2;
                    System.out.println(tombol + " Turun");
    
                }else{
                    tombol = rentang1;
                    System.out.println(tombol + " Naik");
    
                }
            }else{
                if (rentang1>=rentang2){
                    tombol = rentang2;
                    System.out.println(tombol + " Naik");
    
                }else{
                    tombol = rentang1;
                    System.out.println(tombol + " Turun");
    
                 }

            }
        
        


        

        
        }
    
    
    }

}
