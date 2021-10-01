/**
 * idenya menggunakan branching untuk menentukan berapa banyak tombol yang harus ditekan
 * pertama input bilangan bulat ada 4 buah
 * jika awal1 lebih besar dari akhir1 maka tombol1 = 100 - awal1+akhir1
 * jika sebaliknya maka akhir1 - awal1
 * jika awal2 lebih besar dari akhir2 maka tombol2 = 100 - awal2+akhir2
 * jika sebaliknya maka akhir2 - awal2
 * kemudian jika awal3 > akhir3 maka tombo3 = tombol3 = 100 - awal3 + akhir3
 * jika sebaliknya maka tombol3 = akhir3 -awal3;
 * output tombol1,tombol2,tombol3
 * @author Doni Andrian
 * @version 1 oktober 2021
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
        int tombol1 = 0; //deklarasi tombol1
        int tombol2 = 0; //deklarasi tombol2
        int tombol3 = 0; //deklarasi tombol3

        if (awal1>akhir1){
            tombol1 = 100 - awal1 + akhir1; //hitung jumlah pemencetan tombol1

        }else{
            tombol1 = akhir1 - awal1;
        }
        if (awal2>akhir2){
            tombol2 = 100 - awal2 + akhir2; //hitung jumlah pemencetan tombol2

        }else{
            tombol2 = akhir2 - awal2; //jika akhir2>awal2

        }
        if (awal3>akhir3){
            tombol3 = 100 - awal3 + akhir3; //menghitung jumlah pemencetan tombol3 jika awal3>akhir3

        }else{
            tombol3 = akhir3 - awal3;//jika akhir3>awal3
        }
        
        System.out.println(tombol1);
        System.out.println(tombol2);
        System.out.println(tombol3);




        
    }
    
}
