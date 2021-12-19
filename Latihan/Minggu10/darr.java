/**
 * @author Doni Andrian
 * @version 2 december 2021
 */
import java.util.Scanner;
public class darr {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        int n;
        
        for(int i = 0; i < t; i++) {//looping untuk jumlah kasus
            n = sc.nextInt();
            String [] nama = new String[n];
            int []nilai = new int [n];
            for(int j = 0; j < n; j++) {//looping untuk banyaknya masukkan
                nama[j] = sc.next();
                nilai[j] = sc.nextInt();


            }

            for(String name:urutnama(nama,nilai)){//looping untuk menampilkan nama dengan nilai diatas rata rata
               if (name != null){
                System.out.println(name);

               }
               
            }
            if(i<t-1){
                System.out.println();

            }
            
            
        }
        
    }
    public static double rata (int nilai[]){//method untuk menghitung rata-rata
        
        double count = 0.0;
        for(int j = 0; j < nilai.length; j++){//looping untuk menghitung jumlah nilai
            count += nilai[j];
        }
        return count/nilai.length;//mengembalikan nilai rata-rata
    }
    public static String [] urutnama(String [] nama,int []nilai){//method untuk mencari nama dengan nilai diatas rata rata
        int j = 0;
        double count = rata(nilai);
        String [] name = new String [nama.length];
        for(int i = 0; i < nama.length; i++){//looping untuk mencari nama dengan nilai diatas rata rata
            if (nilai[i] >count){//jika nilai diatas lebih besar dari rata-rata maka nama murid akan dimasukkan ke array name
                name[j] = nama[i];
                j++;


            }

        }
        return name;
    }
    
}
