
import java.util.Scanner;

public class Penjumlahan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d1 = sc.next();
        String d2 = sc.next();
        String d11 = d1.replace(',','.');
        double d111 = Double.parseDouble(d11);
        String d22 = d2.replace(',','.');
        double d222 = Double.parseDouble(d22);
        double hasil = d111 + d222;
        String hasil2 = String.format("%.2f", hasil);
        String hasil3 = hasil2.replace('.',',');
        System.out.println(hasil3);
    }
}