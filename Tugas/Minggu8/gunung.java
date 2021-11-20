/**
 * @author Doni Andrian
 * @version 20 november 2021
 */

import java.util.Scanner;
public class gunung {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //int n = sc.nextInt();
        int  a = 4,b  = 3;
        int k;
        String hasil = "";
        int j;

        for (int i = 1; i <= b; i++) {
            k = 0;
            for (j = 1;j<=b-i;j++){


                hasil += "  ";
            }
            while (k != 2 * i - 1) {
                hasil += "* ";
                k++;
            
             }
            if (i<=b-1){
                hasil += "\n";

            }
            

             
             
            }
            for (int i = 1; i <= a; i++) {
                System.out.println(hasil);

            }
            
            // for (int i = 1; i <= a; i++) {
            //     System.out.print(hasil);
            // }
            
        
        // for (int i = 0; i < n; i++) {
        //     a = sc.nextInt();
        //     b = sc.nextInt();
            
        // }
        
    }
    
}
