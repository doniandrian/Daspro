/**
 * pertama deklarasi input sebanyak 2 buah bilangan bulat
 * hitung kembalian dengan mengurangi total pembayaran - yang dibayarkan pembeli
 * hitung jumlahpecahan100 dengan membagi kembalian dengan 100 
 * hitung sisanya dengan menghitung kembalian mod 100  
 * hitung jumlah pecahan50 dengan membagi sisa dengan 50 
 * hitung sisanya lagi dengan menghitung  sisa - jumlahpecahan50*50
 * hitung jumlahpecahan25 dengan membagi sisaterakhir dengan 25
 * output kembalian,jumlahpecahan100, jumlahpecahan50, jumlahpecahan25
 * @author Doni Andrian
 * @version 1 oktober 2021
 */


import java.util.Scanner;
public class Koin_kembalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(); //input total pembelian
        int b = input.nextInt(); //input total pembayaran
        int kembalian = b -a; //hitung kembalian
        int jumlahpecahan100 = kembalian / 100;//hitung jumlahpecahan100
        int sisa = kembalian % 100; //hitung sisa
        int jumlahpecahan50 = sisa / 50; //hitung jumlahpecahan50
        int sisa2 = sisa - jumlahpecahan50*50; //hitung sisa2
        int jumlahpecahan25 = sisa2/25; //hitung jumlahpecahan25

        System.out.println("Kembalian: " + kembalian);
        System.out.println("Jumlah pecahan 100: " + jumlahpecahan100);
        System.out.println("Jumlah pecahan 50: " + jumlahpecahan50);
        System.out.println("Jumlah pecahan 25: " + jumlahpecahan25);

        
    }
    
}
