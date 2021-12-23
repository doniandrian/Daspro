/**
 * @author Doni Andrian
 * @version 20 dec 2021
 */
import java.util.Scanner;

public class permainan_mencari_angka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];//buat array 2d baru dengan panjang baris n dan panjang kolom m
        for (int i = 0; i < n; i++) {//looping untuk input value ke dalam array 2d
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int p = sc.nextInt();//input banyaknya kasus pertanyaan
        int l = 0;
        while (l < p) {//looping sebanyak kasus
            int a = sc.nextInt();
            cekangka(a, n, m, matrix);//panggil method cekangkakolom
            l++;

        }

    }

    public static int hitung_digit(int a) { //method untuk menghitung banyak digit dari pertanyaan, akan mengembalikan int
        int count = 0;
        if (a != 0) {
            while (a != 0) {
                a /= 10;
                count++;
            }

        } else {
            count = 1;
        }

        return count;
    }

    public static String cariangka(int a) {
        //method ini digunakan untuk memasukan pertanyaan yang berupa integer kedalam string
        int count = hitung_digit(a);//panggil method hitung-digit
        int bagi = (int) ((Math.pow(10, count - 1))); // hitugng banyaknya angka pembaginya
        int mod = 10;
        String angka = "";

       
        for (int i = 0; i < count; i++) {// angka diabil dari angka terdepan

            angka += (a / bagi) % mod;
            bagi = bagi / 10;

        }
        return angka;
    }

    public static void cekangka(int a, int n, int m, int[][] matrix) {
        //method untuk mencari angka apakah ada didalam array atau tidak, akan mengembalikan string
        // angka Bilangan yang dianggap valid adalah yang terbentuk dari digit-digit yang berderet dari kiri-ke-kanan dan atas-ke- bawah saja

       
        String angka = cariangka(a);

        
        boolean hasil = false;
        
        String temp1 = "";
        //cek ke samping
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < m; j++) {
                temp1 += matrix[i][j]; //masukkan baris dari matrix kedalam string temp1 untuk dicek apakah mengandung kasus yang ditanyakan

            }
            if (temp1.contains(angka)) {//jika ada maka print ada
                System.out.println("ada");
                hasil = true;
                break;
            } else {
                temp1 = "";//jika tidak temp1 akan direset kembali dan lanjut ke baris matrix berikutnya
            }

        }
        
        if (hasil == false) {//jika pertanyaan yang dimaksud tidak ada di baris maka cari dibagian kolom
            // cekkebawah
            String temp2 = "";
            boolean hasil2 = false;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) { 
                    temp2 += matrix[j][i]; //masuukan value di komlom matrix ke temp2 untuk dicek apakah mengandung kasus yang ditanyakan
                }
                if (temp2.contains(angka)) {
                    System.out.println("ada");
                    hasil2 = true;
                    break;
                } else {
                    temp2 = "";
                }
            }
            if (hasil2 == false) {
                System.out.println("tidak ada");
            }

        }
    }

}
