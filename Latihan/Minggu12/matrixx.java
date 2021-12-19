
import java.util.Scanner;
public class matrixx {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            int n = sc.nextInt();
            int matrix[][] = new int[n][n];
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    matrix[j][k] = sc.nextInt();
                }
            }
            int operasi = sc.nextInt();
            for(int p = 0; p < operasi; p++){
                String operasi1 = sc.next();
                if(operasi1.equals("row")){
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    ubahrow(a, b, matrix);
                }else if(operasi1.equals("col")){
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    ubahcol(a, b, matrix);
                }else if(operasi1.equals("transpose")){
                    transpose(matrix);
                }else if(operasi1.equals("inc")){
                    inc(matrix);
                }else if(operasi1.equals("dec")){
                    dec(matrix);
                }
            }
            System.out.println("Case #" + i +":");
            for(int g = 0; g < matrix.length; g++){
                
                for(int h = 0; h < matrix.length; h++){
                    System.out.print(matrix[g][h]+" ");
                }
                System.out.println();

            }

        }
    }
    public static void ubahrow(int a,int b,int [][]matrix){
        for(int i = 0; i < matrix.length; i++){
            
                int temp = matrix[a-1][i];
                matrix[a-1][i] = matrix[b-1][i];
                matrix[b-1][i] = temp;
            }
        
    }
    public static void ubahcol(int a,int b,int [][]matrix){
        for(int i = 0; i < matrix.length; i++){
            
                int temp = matrix[i][a-1];
                matrix[i][a-1] = matrix[i][b-1];
                matrix[i][b-1] = temp;
            
        }
    }
    public static void transpose(int [][]matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void inc(int [][]matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                
                matrix[i][j] += 1 ;
                if(matrix[i][j]>9){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void dec(int [][]matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                
                matrix[i][j] -= 1;
                if(matrix[i][j] < 0){
                    matrix[i][j] = 9;
                }
            }
        }
    }
    
}
