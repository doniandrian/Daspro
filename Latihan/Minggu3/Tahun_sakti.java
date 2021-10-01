package Minggu3;
/**
 * pertama ambil angka pertama dengan membagi tahun dengan angka 1000
 * kedua ambil angka kedua dengan tahun mod 10000 lalu dibagi 100
 * ketiga ambil angka ketiga dengan tahun mod 1000 kemudia dibagi 10
 * keempat ambil angka terakhir dengan tahun mod 10;
 * terakhir jumlahkan semua angka tersebut dan simpan di variabel hasil dam tampilkan
 * @author Doni Andrian
 * @version 29 September 2021
 */
import java.util.Scanner;
public class Tahun_sakti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //inisialisasi scanner
        int tahun = input.nextInt();  // input
        int angka1 = tahun / 1000;  //ambil angka pertama
        int angka2 = (tahun % 1000) /100; //ambil angka kedua
        int angka3 = (tahun % 100) /10; //ambil angka ketiga
        int angka4 = tahun % 10; // ambil angka keempat
        int hasil = angka1 + angka2 + angka3 + angka4; //jumlahkan semua angka
        System.out.println(hasil);

        
    
    }
    
}
