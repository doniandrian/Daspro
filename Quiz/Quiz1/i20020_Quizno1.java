/**
 * pertama masukan ada 6 input bilangan real
 * kemudian hitung bobot nilai uts * (i/100)
 * kemudian hitung bobot nilai uas * (j/100)
 * hitung rata rata nilau tugas dan hitung bobotnya dengan rata rata tugas * (k/100)
 * terakhir calculasikan semua nilainya
 * @author Doni Andrian
 * @version 13 Oktober 2021
 */
import java.util.Scanner;
public class i20020_Quizno1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double i = input.nextDouble();
        double j = input.nextDouble();
        double k = input.nextDouble();
        double uts = input.nextDouble();
        double uas = input.nextDouble();
        double tugas1 = input.nextDouble();
        double tugas2 = input.nextDouble();
        double tugas3 = input.nextDouble();

        double nilai_uts = uts * (i/100.0); //hitung bobot nilai tugas
        double nilai_uas = uas * (j/100.0); //hitung bobot nilai uas
        double rata_rata_tugas = (tugas1 + tugas2 + tugas3) /3.0; //hitung rata rata tugas
        double rata_rata_tugas2 = rata_rata_tugas *(k/100.0); //hitung bobot nilai tugas

        double na = nilai_uts + nilai_uas + rata_rata_tugas2; //jumlahkan untuk mengetahui nilai akhir

        System.out.printf("%.2f",na);

        
    }
    
}
