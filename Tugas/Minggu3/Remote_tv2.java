/**
 * idenya menggunakan mod untuk menghitung banyaknya tombol yang ditekan
 * pertama input bilangan bulat ada 6 buah
 * kemudian inisialisasi 3 variabel yaitu tombol1, tombol2, tombol3 sebagai integer
 * kemudian hitung banyaknya tombol yang harus ditekan dengan menggunakan rumus (100- awal + akhir) mod 100 karena angkanya siklik
 * output tombol1,tombol2,tombol3
 * @author Doni Andrian
 * @version 3 oktober 2021
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
        int tombol1 = 0; int tombol2=0; int tombol3=0; //deklarasi tombol1,tombol2,tombol3 sebagai integer
        

        //hitung jumlah tombol menggunakan rumus (100- awal + akhir) mod 100
        tombol1 = (100 - awal1 + akhir1)%100; //hitung jumlah pemencetan tombol1
        tombol2 = (100 - awal2 + akhir2)%100; //hitung jumlah pemencetan tombol2
        tombol3 = (100 - awal3 + akhir3)%100; //menghitung jumlah pemencetan tombol3 

        System.out.println(tombol1);
        System.out.println(tombol2);
        System.out.println(tombol3);




        
    }
    
}
