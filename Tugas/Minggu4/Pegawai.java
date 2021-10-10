/**
 * input ada 3 buah bilangan real real
 * jika hari kerja sama dengan banyaknya kehadiran pegawai maka gaji ditambahkan 10%
 * jika jumlah keharidan kurang dari banyaknya hari kerja maka gaji dikurangi percen kehadiran
 * @author Doni Andrian
 * @version 8 Oktober 2021
 */

import java.util.Scanner;
public class Pegawai {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double A = input.nextDouble(); //input banyaknya hari kerja
        double B = input.nextDouble(); //input banyaknya kehadiran pegawai
        double C = input.nextDouble(); //input gaji pokok
        //deklarasi variabel
        double gaji = 0;
        double bonus = 0;
        double kehadiran = 0;
        

        if (A == B){ //jika banyaknya hari kerja sama dengan banyaknya kehadiran pegawai
            bonus = (10.0/100.0) * C; // hitung bonus
            gaji = C + bonus; //gaji + bonus
            
            System.out.printf("%.2f",gaji);


        }else if(B < A){  //jika banyaknya kehadiran lebih kecil dari banyaknya hari kerja
            kehadiran = (B/A)*100; //hitung berapa percen kehadiran
            gaji = (kehadiran/100) * C; //kurangi gaji dengan percen kehadiran
            System.out.printf("%.2f",gaji);
        


        }
        
    }   
    
}
