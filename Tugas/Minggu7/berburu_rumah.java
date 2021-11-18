/**
 * @author Doni Andrian
 * @version 30 Oktober 2021
 * input ada 3 buah bilangan      
 * set currentsaving mula mula 0
 * hitung dpnya dengan mengalikan harga_rumah * 0.25
 * hitung gajibulanan dengan gaji/12
 * hitung portionsaved dengan gajibulanan * porsi;
 * lakukan looping selama currentsaving < dp
 * hitung timbalbalik dengan mengkalikan currentsaving dengan 0.04/12
 * setiap looping berjalan currentsaving akan terus bertambah dengan menambahkan timbalbalik + portionsaved
 * bulan akan terus bertambah setiap kali looping terjadi
 * output banyaknya bulan
 * 
 */
import java.util.Scanner;

public class berburu_rumah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input ada 3 buah bilangan real
        double gaji = input.nextDouble();
        double porsi = input.nextDouble();
        double harga_rumah = input.nextDouble();
        //inisialisasi
        double currentsaving = 0; //set currentsaving awal mula 0
        double dp = harga_rumah * 0.25; //hitung dpnya dengan mengalikan harga_rumah * 0.25
        double gajibulanan = gaji/12; //hitung gajibulanan dengan gaji/12

        double timbalbalik = 0; //set timbalbalik awal mula 0
        double portionsaved = gajibulanan * porsi; //hitung portionsaved dengan gajibulanan * porsi;
        double r = 0.04;
        int bulan = 0;
        //proses
        while (currentsaving < dp) {//lakukan looping selama currentsaving < dp
            
            timbalbalik = currentsaving * (r/12);//hitung timbalbalik dengan mengkalikan currentsaving dengan 0.04/12
                                                    
            currentsaving += timbalbalik + portionsaved; //setiap looping berjalan currentsaving akan terus bertambah dengan menambahkan timbalbalik + portionsaved
            bulan++;//bulan akan terus bertambah setiap kali looping terjadi



        }
        System.out.println(bulan);

        
    }
    
}
