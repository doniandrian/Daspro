import java.util.Scanner;

public class Minggu3 {
    public static void main(String[] args) {

        //mengecek nama akhir apakah sama 
        Scanner input = new Scanner(System.in);
        String nama1 = input.next();
        String nama2 = input.next();
        int len1 = nama1.length();
        int len2 = nama2.length();
        String namaakhir1 = nama1.substring(len1-6);
        String namaakhir2 = nama1.substring(len2-6);
        boolean hasil = namaakhir1.equals(namaakhir2);
        System.out.println(hasil);

        //pr


        System.out.print("banyaknya siswa yang ikut ujian: ");
        double n = input.nextDouble();
        System.out.print("rata awal: ");
        double rata_awal = input.nextDouble();
        System.out.print("banyak siswa susulan: ");
        double susulan = input.nextDouble();
        System.out.print("rata_akhir: ");
        double rata_akhir = input.nextDouble();

        double jumlah_nilai_awal = n * rata_awal;
        double jumlah_seluruh_anak = n + susulan;
        double jumlah_nilai_susulan = (rata_akhir * jumlah_seluruh_anak) - jumlah_nilai_awal;
        double rata_susulan = jumlah_nilai_susulan / susulan;

        System.out.println(rata_susulan);




    

        
    }   

    
}
