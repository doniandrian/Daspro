/**
 * @author Doni Andrian
 * @version 2 december 2021
 */
import java.util.Scanner;
public class query {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //input
        int n = sc.nextInt();
        int q = sc.nextInt();
        //inisialisasi
        int l = 0,r = 0,x = 0;
        int [] arr = new int[n];//buat array kosong
        
       
        for(int i = 0; i < q; i++) {//looing banyaknya kasus
           //input 
            l = sc.nextInt();
            r = sc.nextInt();
            x = sc.nextInt();
            arr = elemen(arr,n,q,l,r,x);//mengupdate nilai method
            
           
        }
        
        for (int kueri:arr){ //untuk menampilkan result dari array
            System.out.print(kueri +" ");
        }

        
    }
    public static int [] elemen(int [] arr,int n,int q,int l,int r,int x){//method untuk menambahkan elemen pada rentang tertentu dengan nilai tertentu
        
        
            for(int j = l-1; j < r; j++){
                arr[j] += x;
            
        }
        return arr;
    }
    
}
