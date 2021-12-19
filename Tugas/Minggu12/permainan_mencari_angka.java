
import java.util.Scanner;

public class permainan_mencari_angka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            cekangkakolom(a,n,m,matrix);
            System.out.println("hitung " + hitung_digit(a));
           

        }

    }

    public static int hitung_digit(int a) {
        int count = 0;
        if(a!=0){
            while (a != 0) {
                a /= 10;
                count++;
            }

        }else{
            count = 1;
        }
       
        return count;
    }

    public static int []cariangka(int a) {
        int count = hitung_digit(a);
        int bagi = (int) ((Math.pow(10, count - 1))); // hitugng banyaknya angka pembaginya
        int mod = 10;
        
        int [] angka = new int[count];
        for (int i = 0; i < count; i++) {// angka diabil dari angka terdepan

            angka[i] = (a / bagi) % mod;
            bagi = bagi / 10;


           

        }
        return angka;
    }

    public static void cekangkakolom(int a, int n, int m, int[][] matrix) {
        int []angka = new int[hitung_digit(a)];
        angka = cariangka(a);
        
        int temp = 0;
        int k = 0;
        boolean hasil;
        for(int asd:angka){
            System.out.print(" " + asd);
        }
        
            for (int i = 0; i < n; i++) {
                k = 0;
                for (int j = 0; j < m; j++) {
                    hasil = false;
                    if (angka[k] == matrix[i][j]) {
                        hasil = true;
                        temp++;
                        System.out.println("temp: "+temp);
                        if(k == hitung_digit(a)-1 || temp == hitung_digit(a)){
                            
                            break;
                        }
                        else {
                            k++;
                        }
                        

                    }else if(temp == hitung_digit(a)){
                        break;
                    }
                    else{
                        
                        temp = 0;
                        
                       
                    }

                    if(temp == hitung_digit(a)){
                        break;
                    }
                        
                    
    
                }
            

        }
        System.out.println("tempakhir" +temp);
        if(temp == hitung_digit(a)){
            System.out.println("ada");

        }else{
            System.out.println("tidak ada");
        }
        

    }

}
