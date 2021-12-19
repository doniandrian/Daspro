/**
 * @author Doni Andrian
 * @version 14 december 2021
 */
import java.util.Scanner;
public class peta {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        char peta [][] = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                peta[i][j] = sc.next().charAt(0);
            }
        }

        String arah = sc.next();
        int panjang_arah = arah.length();
        char posisi = 's';
        char tujuan = 't';
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        int temp4 = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(peta[i][j]==posisi){
                    temp1 = i;
                    temp2 = j;

                }
                if(peta[i][j] == tujuan){
                    temp3 = i;
                    temp4 = j;
                }
            }
        }

        for(int i = 0; i < panjang_arah; i++){
            if(arah.charAt(i)=='D'){
                temp1 +=1;
            }else if(arah.charAt(i) == 'R'){
                temp2 +=1;
            }else if(arah.charAt(i) == 'L'){
                temp2 -=1;
            }else if(arah.charAt(i) == 'U'){
                temp1 -=1;
            }         
        }
        if(temp1==temp3 && temp2 == temp4){
            System.out.println("Akurat");
        }else{
            System.out.println("Tidak akurat");
        }


    }
    
}
