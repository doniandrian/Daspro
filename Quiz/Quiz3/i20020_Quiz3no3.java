
/**
 * @author Doni Andrian
 * @version 8 December 2021
 */
import java.util.Scanner;
public class i20020_Quiz3no3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        
        for(int i = 0; i < x; i++){//looping banyak kasus
            int n = sc.nextInt();
            System.out.print(cetakframe(n));

        }

        
        
    }
    public static int hitung_digit(int n){//method untuk hitung banyak digit
        int count = 0;
        while (n!=0){
            n = n/ 10;
            count++;
        }
        return count;
    }
    public static String cetakframe(int n){//method untuk cetakframe
        String hasil = "";
        int baris = hitung_digit(n) + 2;
        int kolom = 11;
        for(int i = 1; i <= kolom; i++){
            for(int j = 1; j<=baris; j++){
                if(i==1 || i==kolom||j==1 || j==baris){
                    hasil += "#";
                }else{
                    hasil +=" ";
                }
        
            }
            hasil += "\n";
        }
        return hasil;
    }
    public static String cetakbatu(int n){//method untuk mencetak tumpukan batu dalam sebuah kotak
        String hasil2 = "";
        int count = hitung_digit(n);
        int bagi = (int)((Math.pow(10, count-1))); //hitugng banyaknya angka pembaginya
        int mod = 10;
        int hasil = (int) (n / bagi);
        
        for(int i = 0;i<=count; i++){
        
             for(int j=1; j<count; j++){//angka diabil dari angka terdepan
                 bagi = bagi / 10;
                 hasil = (n / bagi) % mod; 
                for(int k = 0; k<=hasil; k++){
                    System.out.print("@");
                }
            
            
           
        }
        }
    }
    
}
