/**
 * @author Doni Andrian
 * @version 14 december 2021
 */
import java.util.Scanner;
public class panen_gabah {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int gabah [][] = new int[n][n];
        int total = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                gabah[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                if(i == j){
                    total += gabah[i][j];
                }
            }
        }
        System.out.println(total);

        
    }
    
}
