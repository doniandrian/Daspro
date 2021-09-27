import java.util.Scanner;

public class Minggu3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama1 = input.next();
        String nama2 = input.next();
        int len1 = nama1.length();
        int len2 = nama2.length();
        String namaakhir1 = nama1.substring(len1-6);
        String namaakhir2 = nama1.substring(len2-6);
        boolean hasil = namaakhir1.equals(namaakhir2);
        System.out.println(hasil);
    }
    
}
