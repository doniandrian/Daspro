/**
 * @author Doni Andrian
 * @version 4 December 2021
 */
import java.util.Scanner;
public class paling_relevan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //input
        int n = sc.nextInt();
       //proses
        for(int i = 1; i <= n; i++) {//looping untuk banyak kasusnya
            //buat 2 array kosong
            String []web = new String[10];
            int[] relevansi = new int[10];
    
            for(int j = 0; j < 10; j++) {//looping untuk memasukkan masukkan ke array
                web[j] = sc.next();
                relevansi[j] = sc.nextInt();

            }
            System.out.println("Kasus ke-" + i+":");
            carirelevansi(web, relevansi);//penggil method carirelevansi

        }
        
    }
    public static int carinilaiterbesar(int[] relevansi){//method untuk mencari nilai indeksTerbesar

        int max = 0;
        for(int i = 0; i < relevansi.length;i++){//looping untuk mencari nilai terbesar dari relevansi website
            if(max<relevansi[i]){
                max = relevansi[i];
            }
        }
        return max;
    }

    public static void carirelevansi(String[]web,int[]relevansi) {//looping untuk mencari website dengan nilai relevansi terbesar
        for(int i = 0;i<relevansi.length;i++){//looping untuk menampilkan website dengan nilai relevansi terbesar
            if(relevansi[i]==carinilaiterbesar(relevansi)){
                System.out.println(web[i]);
            }
        }

    }
    
}
