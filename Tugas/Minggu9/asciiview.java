
/**
 * @author Doni Andrian
 * @version 27 november 2021
 * 
 */
import java.util.Scanner;

public class asciiview {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //input banyak kasus
        int n = sc.nextInt();
        //deklarasi
        int dec;
        int count = 1;
        //proses
        for (int i = 1; i <= n; i++) { //looping untuk melooping banyaknya masukkan
            dec = sc.nextInt();//input bilangan decimal
            if (count % 9 == 0) {//Sebelum menulis karakter ke-9, tambahkan satu spasi kosong

                System.out.print(" "+dec2ascii(dec));
            }
            else if (i % 16 == 0) {//Setiap baris akan berisi maksimal 16 karakter, yang masing-masing menunjukkan karakter ASCII-nya. maka setiap i kelipatan 16 akan ditambahkan enter

                
                System.out.print(dec2ascii(dec));
                System.out.println();
                count = 0;//count kembali di set menjadi 0
               

            }else {
                System.out.print(dec2ascii(dec));

            }
            count++;

        }
    }

    public static char dec2ascii(int dec) {
        /**
         * method ini digunakan untuk mengembalikan karakter ascii dengan parameter int dec
         * variabel hasil digunakan untuk menampung karakter ascii
         * jika bilangan decimal ada pada rentang 32 <= dec < 127 akan dilakukan typecast (char) dec dan mengembalikan nilainya
         * selain itu hanya akan mengembalikan "."
         */
        char hasil;
        if (dec < 127 && 32 <= dec) {
            hasil = (char) dec;
        } else {
            hasil = '.';
        }
        return hasil;

    }
    
}


