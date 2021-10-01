/**
 * pertama deklarasi variabel input
 * kemudian input kecepatan dan waktu (double)
 * hitung keliling lingkaran dengan rumus phi*2*r
 * convert waktu dari menit ke detik
 * hitung jarak yang ditempuh dengan kecepatan * waktu_detik
 * hitung banyak putaran dengan membagi jarak dengan keliling 
 * @author Doni Andrian
 * @version 1 oktober 2021
 * 
 */

import java.util.Scanner;
public class Speedwom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kecepatan = input.nextDouble(); //input kecepatan
        double waktu = input.nextDouble(); // input waktu
        

        double keliling = 3.14 * 2 * 70; //hitung keliling lingkaran
        double waktu_detik = waktu * 60; //convert waktu menit ke detik
        double jarak = kecepatan * waktu_detik; //hitung jarak tempuh
        double putaran = jarak / keliling; //hitung banyaknya putaran

        System.out.printf("Banyaknya putaran lintasan: %.2f",putaran);

        
    }
    
}
