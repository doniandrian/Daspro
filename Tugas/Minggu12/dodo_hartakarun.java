
import java.util.Scanner;
public class dodo_hartakarun {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int [][]matrix = new int[n][n];
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix.length; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
            if(diagonal(matrix)){
                System.out.println("diagonal");
            }else if(sisi(matrix)){
                System.out.println("sisi");
            }
            else if(atas(matrix)){
                System.out.println("atas");
            }else if(bawah(matrix)){
                System.out.println("bawah");
            }
            

        }
        
    }
    public static boolean atas(int[][] matrix){
        boolean result = true;
        for (int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix.length; j++){
                if(matrix[i][j] != 1){
                    result = false;
                }
            }
        }
        return result;
    }
    public static boolean bawah(int[][] matrix){
        boolean result = true;
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j <= i; j++){
                if(matrix[i][j] != 1){
                    result = false;
                }
            }
        }
        return result;
    }
    public static boolean diagonal(int[][] matrix){
        boolean result = true;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                if(i != j){
                    if(matrix[i][j] != 0){
                        result = false;
                        break;
                    }

                }
                
            }
        }
        return result;
    }
    public static boolean sisi(int[][] matrix){
        boolean result = true;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                if(i == 0||i==matrix.length-1||j==0||j==matrix.length-1){
                    if(matrix[i][j] != 1){
                        result = false;
                    }
                }
            }
        }
        return result;
    }
    
}
