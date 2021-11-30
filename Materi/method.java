import java.util.Scanner;
public class method {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        double hasil = fraction(a, b, c, d);
        System.out.println(hasil);

    } 
    public static double fraction(int pembilang1,int penyebut1, int pembilang2,int penyebut2){
        double hasil;
        double penyebut3 = penyebut1 * penyebut2;
        double pembilang3 = penyebut1 * pembilang2 + penyebut2 * pembilang1;
        hasil = pembilang3 * 1.0/penyebut3;
        return hasil;
    }  
    
}
