/**
 * 
 * 
 * @author Doni Andrian
 * @version 19 Oktober 2021
 */
import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tanggal1 = input.nextInt();
        int bulan1 = input.nextInt();
        int tahun1 = input.nextInt();
        int tanggal2 = input.nextInt();
        int bulan2 = input.nextInt();
        int tahun2 = input.nextInt();

        int selisihtahun =tahun1 - tahun2; 
        int selisihbulan = bulan1 - bulan2;
        int selisihtanggal = tanggal1 - tanggal2;

        if ( selisihtahun > 0){
            if (selisihbulan > 0){
                System.out.println(selisihtahun);
            }else if(selisihbulan < 0){
                selisihtahun = selisihtahun -1;
                System.out.println(selisihtahun);
            }else{
                if (selisihtanggal>=0){
                    System.out.println(selisihtahun);
                }else{
                    selisihtahun = selisihtahun -1;
                    System.out.println(selisihtahun);
                }
            }
        }else{
            System.out.println(0);
        }




        
    }
    
}
