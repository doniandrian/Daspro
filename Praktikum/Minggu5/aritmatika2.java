/**
 * @author Doni Andrian
 * @version 19 Oktober 2021
 */

import java.util.Scanner;
public class aritmatika2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input ada 3 buah bulangan bulat
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();

        //inisialisasi variabel max,mid,min untuk menanpung nilai terbesar, terkecil dan tengah
        int max,mid,min;
        

        //proses cari nilai max mid dan min
        if (a>b && a > c && b>c){
            max = a;
            mid = b;
            min = c;
        }else if(b > a && b>c && a > c){
            max = b;
            mid = a;
            min = c;
        }else if(a>b && a > c && c>b){
            max = a;
            min = b;
            mid = c;
        }else if(b > a && b>c && c > a){
            max = b;
            mid = c;
            min = a;
        }else if(c > a && c > b && a > b){
            max = c;
            mid = a;
            min = b;
        }else{
            max = c;
            mid = b;
            min = a;

        }
        
        //hitung selisih nilai terbesar dan tengah untuk mengetahui bedanya
        int selisih = max - mid;
        int nilai = max + selisih; //nilai max ditambah selisih untuk mengetahui angka ke empat
        System.out.println(nilai);
        
    }
    
}
