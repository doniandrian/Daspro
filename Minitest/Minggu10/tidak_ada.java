/**
 * @author Doni Andrian
 * @version 3 December 2021
 */
import java.util.Scanner;
public class tidak_ada {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //input
        int n = sc.nextInt();
        int x = sc.nextInt();
        //buat arr kosong
        int []arr1 = new int[n];
        int[]arr2 = new int[x];
        //proses
    
        for(int i = 0; i < n; i++){//looping untuk input arr1
            arr1[i] = sc.nextInt();

        }
        for(int i = 0; i < x; i++){//looping untuk input arr2
            arr2[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++){//looping untuk cek elemen apakah elemen a ada di b terdapat 2 kali looping
            int j;
            for(j = 0; j < x; j++){
                if(arr1[i]==arr2[j]){//jika setelah di cek ternyata ada maka looping dihentikan dan kembali ke looping pertama
                    
                    break;
                }
            }
            if(j==x){
                
                 
                System.out.print(arr1[i] + " " );
                
                
            }
            
            
        }


        
    }
    
}
