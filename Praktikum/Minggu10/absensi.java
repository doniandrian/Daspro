/**
 * @author Doni Andrian
 * @version 30 november 2021
 */
import java.util.Scanner;
public class absensi {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //input
        int n = sc.nextInt();
        //deklarasi
        int [] kursi = new int[n];

        String []nama = new String[n];
        //looping untuk masukkan
        for (int i = 0; i < n; i++) {
            kursi[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            nama[i] = sc.next();
        }
        //looping untuk menampilkan array
        for (String name:buatAbsen(kursi, nama)) {
            System.out.println(name);
        }

    }

    public static String []buatAbsen (int[] npm,String nama[]){//method untuk mengurutkan nama
        String []namaterurut = new String[npm.length];
        for (int i = 0; i < npm.length; i++) {
            namaterurut[i] = nama[npm[i] -1];

        }
        return namaterurut;
    }
    
}
