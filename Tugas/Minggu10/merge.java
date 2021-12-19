/**
 * @author Doni Andrian
 * @version 5 december 2021
 */
import java.util.Scanner;
public class merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //input
        int n = sc.nextInt();
        int m = sc.nextInt();
        //buat 2 array kosong dengan panjang n untuk arr1 dan m untuk arr2

        int []arr1 = new int[n];
        int []arr2 = new int[m];
        //looping untuk masukkan
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < m;i++){
            arr2[i] = sc.nextInt();
        }
        //panggil method urutarray
        urutarray(n, m, arr1, arr2);


        
    }
    public static int[] gabung(int n, int m,int[]arr1, int[]arr2){//method untuk menggabungkan 2 array menjadi satu
        //buat array baru dengan kapasitas n + m
        int arr3[] = new int[n + m];
        //gabungkan array
        for(int i = 0; i < arr1.length; i++){//masukan array pertama ke array 3
            arr3[i] = arr1[i];
        }
        for(int i = 0; i <arr2.length;i++){//masukan array kedua ke array 3 di mulai dari index ke-panjang arr1
            arr3[arr1.length + i] = arr2[i];
        }
        return arr3;


    }
    public static void urutarray(int n,int m,int[]arr1,int[]arr2){//method untuk mengurutkan array
        //buat array baru dengan kapasitas n + m
        int arr3[] = new int[n + m];
        arr3 = (gabung(n, m, arr1, arr2));//isi arr 3 dengan array yang sudah digabung (panggil method gabung)
        int temp;
        //looping untuk mengurutkan value array dari yang nilainya terkecil sampai terbesar
        for(int i = 0;i < arr3.length; i++){
            for(int j = i + 1;j<arr3.length;j++){
                temp = 0;
                if(arr3[i] >arr3[j]){
                    temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;
                }
            }
        }
        for(int hasil:arr3){//untuk menampilkan array
            System.out.print(hasil +" ");
        }

    }
    
}
