/**
 * @author Doni Andrian
 * @version 8 December 2021
 */
import java.util.Scanner;
public class i20020_Quiz3no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();//banyaknya alat elektronik
        int m = sc.nextInt();//banyaknya operasi
        int c = sc.nextInt();//kapasitaas listrik
        int []alat = new int[n];
        int []persen = new int[n];
       
        for(int i = 0; i < n; i++) { //looping untuk banyak kasus
            alat[i] = sc.nextInt();//
            persen[i] = sc.nextInt();//

        }
        for(int i = 0; i < m; i++) {//looping untuk banyak operasi
            String operasi = sc.next();
            if (operasi.equals("ganjil")){
                int p = sc.nextInt();
            }else if(operasi.equals("switchOnoff")){
                int j = sc.nextInt();
                int k = sc.nextInt();
            }else if(operasi.equals("switchOnoff")){
                int l = sc.nextInt();
                int t = sc.nextInt();

            }else{
                int o = sc.nextInt();
                int r = sc.nextInt();

            }
        }

    }
    public static int [] ganjil(int alat[],int persen[],int p){ //method untuk menyalakan / mematikan bernomor alat ganjil
        if(p==0){
            int count = 1;
            for(int i = 0; i < operasi.length; i++) {
                if (count % 2 != 0){
                    alat[i] = 0;
                }
            }
            if(p==1){
                
                for(int i = 0; i < operasi.length; i++) {
                    if (count % 2 != 0){
                        alat[i] = 0;
                    }
                }
            return alat;

        }
       
}
    }
    public static int []switchonoff(int alat[],int persen[],int l,int t){


    }
    public static int []switchmode(int alat[],int persen[],int o,int r){

    }
}
