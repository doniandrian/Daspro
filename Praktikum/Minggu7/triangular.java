/**
 * @author Doni Andrian
 * @version 26 Oktober 2021
 */
import java.util.Scanner;
public class triangular {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //input
        int angka = input.nextInt();

        int hasil = 0;
        int hasil2 = 0;
        //proses
        for (int i = 1;i<=angka;i++){//untuk mencari hasilnya tambahkan setiap hasil ke variabel hasil2
            hasil = hasil + i;
            hasil2 += hasil;
        
        }
        System.out.println(hasil2);

    


        
    }
    
}
