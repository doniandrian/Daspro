
/**
 * @author Doni Andrian
 * @version 17 december 2021
 */

import java.util.Scanner;

public class dodo_dan_kunci_ajaib2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();//bnyk test kasus
        for(int i = 0; i < t; i++){
            
            int hasil = 0;
            int count = 0;
            int k = sc.nextInt();//bnyk lubangkunci
            int n = sc.nextInt();//panjang matrix
            int matrix [][][] = new int[k][n+1][n+1];
            int matrix2[][] = new int[n][n];
            for(int j = 0; j <= k; j++){
                for(int h = 0; h < n; h++){
                    for(int x = 0; x < n; x++){
                        matrix[j][h][x] = sc.nextInt();
                    }
                    

                }

                
            }
            for(int d = 0; i < t; i++){
                for(int j = 0; j < t; j++){
                    matrix2[d][j] = sc.nextInt();
                }
            }
            
            int matrix3[][] = new int[n][n];
            for(int p = 0; p < 3; p++){
               count = 0;
                
               matrix3 = swapcol(matrix2);
               for(int r = 0; r < n; r++){
                   for(int c = 0; c < n; c++){
                       if(matrix3[r][c]==matrix[0][r][c]){
                           count++;
                       }
                   }
               }
               hasil++;
               if(count==n*n){
                System.out.print(hasil);
            }
            
        }
        if(count<n*n){
            System.out.println(0);
        }

    }
}

    public static int[][]swapcol(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {

            int temp = matrix[i][0];
            matrix[i][i] = matrix[i][matrix.length - 1];
            matrix[i][matrix.length - 1] = temp;

        }
        return matrix;
    }

    public static int[][] swaprows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {

            int temp = matrix[0][i];
            matrix[0][i] = matrix[matrix.length - 1][i];
            matrix[matrix.length - 1][i] = temp;
        }
        return matrix;

    }

    public static int[][] putararrah(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int k = 0; k < matrix.length; k++) {
            for (int l = 0; l < matrix.length / 2; l++) {
                int temp = matrix[k][l];
                matrix[k][l] = matrix[k][matrix.length - 1 - l];

                matrix[k][matrix.length - 1 - l] = temp;

            }

        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int k = 0; k < matrix.length; k++) {
            for (int l = 0; l < matrix.length / 2; l++) {
                int temp = matrix[k][l];
                matrix[k][l] = matrix[k][matrix.length - 1 - l];

                matrix[k][matrix.length - 1 - l] = temp;

            }

        }
        return matrix;
    }
}
