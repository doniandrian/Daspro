/**
 * @author Doni Andrian
 * @version 27 november 2021
 * pertama buat looping untuk melooping banyaknya input pada main method
 * lalu buat method bernama barchar untuk menampilkan hasil dari bar chartnya dengan parameter String nama dan int bar
 * Di dalam method barchar terdapat 3 variabel untuk menampung #, spasi , dan hasilnya
 * buat looping pertama untuk menampilkan banyaknya #
 * looping kedua untuk menampilkan banyaknya spasi
 * return hasil
 * Di dalam looping Pada main method, method barchar dengan parameter nama,bar akan dipanggil dan ditampilkan
 */
import java.util.Scanner;
public class barchart {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //input banyak kasus
        int n = sc.nextInt();
        //deklarasi
        String nama;
        int bar;
        for (int i = 0; i < n; i++) {//looping untuk melooping banyaknya input
            nama = sc.next();
            bar = sc.nextInt();
            System.out.println(barchar(nama,bar)); //memanggil method barchar

        }
        
    }
    public static String barchar(String nama,int bar){ //method untuk menampilkan hasil dari bar chartnya dengan parameter String nama dan int bar
        //inisialisasi
        String vote = "";
        String hasil = "";
        String spasi = "";
        //proses
        for(int i = 0;i<bar;i++){//looping untuk menampilkan banyaknya bar #
            vote += "#";
        }
        for (int i=0;i<16-nama.length();i++){//looping untuk menampilkan banyaknya spasi
            spasi += " ";
        }
        hasil = spasi + nama + " " + vote + " "+bar; //return hasil
        return hasil;
    }
    
}
