
/**
 * @author Doni Andrian
 * @version 19 november 2021
 * pertama input ada 3 buah bilangan n, a , x
 * kemudian lakukan looping sebanyak n kali masukkan
 * deklarasi variabel hasil, temp,faktorial,dan temp2
 * lakukan looping kedua sebanyak a kali 
 * inisialisasi variabel hasil,temp,daktorial dan temp2 yang mula mula diawali dengan 
 * temp di set menjadi -1 dan selalu dikalikan setiap looping dengan dirinya sendiri untuk mengatahui perbedaan positif dan minusnya
 * lakukan perhitungan faktorialnya 
 * hitung temp2 untuk menyimpan hasil dari x pangkat
 * hasilnya adalah mengalikan temp1 dengan temp2 kemudian dibagi dengan faktorialnya
 * 
 */
import java.util.Scanner;
public class dodo_cosx {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(); //input
        //deklarasi variabel
        int a;
        float x;
        //proses
        for (int i = 0; i < n; i++) { // looping untuk melooping banyaknya test kasus
            x = sc.nextFloat();
            a = sc.nextInt();
            double hasil = 1;
            double temp = 1;
            double faktorial = 1;
            double temp2 = 1;
            for(int j = 1;j<a;j++){ //looping untuk melooping tes kasusnya
                temp *= -1; //untuk menentukan bilangan tersebut dikurangi atau ditambahkan awalnya di set -1 karena nilai dikurangi terlebih dahulu
                faktorial *= (2 * j -1) * (2* j); //hitung faktorialnya, perbedaan faktorialnya adalah 2 angka
                temp2 *= x * x; //untuk menghitung hasil dari x pangkat, setiap kali looping pangkat bertambah 2
                hasil += temp * temp2 / faktorial;//hitung hasilnya


            }
            System.out.printf("%.4f",hasil);
            System.out.println();


        }
        
    }
    
}
