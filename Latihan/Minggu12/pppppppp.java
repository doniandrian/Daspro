import java.util.Scanner;

public class pppppppp{
    public static void main(String args[]){
        Scanner tf = new Scanner(System.in);
        int x = tf.nextInt();
        for(int i = 0; i<x; i++){
            int n = tf.nextInt();
            int[][] kunci = new int[n][n];
            int[][] kunci2 = new int[n][n];
            int[][] kuncisen = new int[n][n];
            int op = 0;
            for(int j = 0; j<n; j++){
                for(int k = 0; k<n; k++){
                    kunci[j][k] = tf.nextInt();
                    kuncisen[j][k] = kunci[j][k];
                }
            }
            for(int j = 0; j<n; j++){
                for(int k = 0; k<n; k++){
                    kunci2[j][k] = tf.nextInt();
                }
            }
            for(int z = 0; z<n; z++){
                for(int j = 0; j<n; j++){
                    for(int k = 0; k<n; k++){
                        kuncisen[j][k] = kunci[n-1-k][j];
                    }
                }
                for(int j = 0; j<n; j++){
                    for(int k = 0; k<n; k++){
                        kunci[j][k] = kuncisen[j][k];
                    }
                }
                for(int j = 0; j<n; j++){
                    for(int k = 0; k<n; k++){
                        if(kunci2[j][k] != kuncisen[j][k]){
                            break;
                        }
                        else op = op + 1;
                    }
                    if(op == n){
                        System.out.println("open");
                        z=n;
                        break;
                    }
                }
            }
            if (op != n){
                System.out.println("close");
            }
        }
    }
}
