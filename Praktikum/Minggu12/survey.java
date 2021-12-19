/**
 * @author Doni Andrian
 * @version 14 december 2021
 */

import java.util.Scanner;
public class survey {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        char loker[][] = new char [n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                loker[i][j] = sc.next().charAt(0);

            }
        }
        char karakter = sc.next().charAt(0);

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if (loker[i][j] == karakter){
                    count++;
                }
            }
        }
        System.out.println(count);

        
    }
    
}
