import java.util.Scanner;

public class SkewSymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        boolean result = isSkewSymmetricMatrix(matrix);
        if (result == true) {
            System.out.println("skew-symmetric matrix");
        } else {
            System.out.println("bukan skew-symmetric matrix");
        }
    }

    public static boolean isSkewSymmetricMatrix(int[][] matrix) {
        boolean result = true;
        int i, j;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    if (matrix[i][j] != 0) {
                        result = false;
                        break;
                    // } else {
                    //     result = true;
                     }
                } else {
                    if (matrix[j][i] != matrix[i][j] * -1) {
                        result = false;
                        break;
                        
                    // } else {
                    //     result = true;
                    }
                    }
                }
            }
        
        return result;
    }
}