package Minggu3;
/**
 * idenya adalah menggunakan pythagoras
 * pertama hitung panjang r1 dan r2 dengan mengurangi titik kedua dengan yang pertama (y2-y1) dan (x2-x1)
 * kemudian hitung akarnya dengan panjang_r1^2 + panjang_r2^2 lalu cari akarnya menggunakan method Math.sqrt
 * kemudian hasilnya dibagi 3 karena jarak tiap lampu 3 meter
 * @author Doni Andrian
 * @version 29 Sep 2021
 */
import java.util.Scanner;
public class lampu_jalan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        int panjang_r1 = y2 - y1;  //cari panjang r1
        int panjang_r2 = x2 - x1;  //cari panjang r2
        int jumlahpanjang = (panjang_r1*panjang_r1) + (panjang_r2*panjang_r2); //cari r1^2 + r2^2

        int akar = (int) Math.sqrt(jumlahpanjang); //cari akarnya menggunakan method Math.sqrt()
        int hasil = (akar / 3) + 1;  //hasilnya dibagi 3

        System.out.println("Jumlah lampu: " + hasil);





        
    }
    
}
