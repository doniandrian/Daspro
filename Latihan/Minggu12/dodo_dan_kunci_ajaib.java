
import java.util.Scanner;
public class dodo_dan_kunci_ajaib {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        

       
        for(int i = 0; i < x; i++) {
            int n = sc.nextInt();
            int lubangkunci[][] = new int[n][n];
            int anakkunci[][] = new int[n][n];
            int count = 0;
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    lubangkunci[j][k] =  sc.nextInt();
                }
            }
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    anakkunci[j][k] =  sc.nextInt();
                }
            }
            
        for(int j = 0; j < 4; j++) {

            count = 0;
            anakkunci = putararah(anakkunci, n);
            // for(int k = 0; k < n; k++) {
            //     for(int l = 0; l < n; l++) {
            //         System.out.print(" " +anakkunci[k][l]);
    
            //         }
            //     }
            for(int k = 0; k < n; k++) {
                for(int l = 0; l < n; l++) {
                    if (anakkunci[k][l] == lubangkunci[k][l]){
                        count++;

                    }
                }
            }
           
            if(count==n*n){
                System.out.println("open");
                break;
            }
        }
        if(count<n*n){
            System.out.println("close");
        }
        
        }
        

        }
        
        
        
        

    
    public static int [][]putararah(int[][]lubangkunci,int n){
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                int temp = lubangkunci[i][j];
                lubangkunci[i][j] = lubangkunci[j][i];
                lubangkunci[j][i] = temp;
            }
        }
        for(int k = 0; k < n; k++) {
            for(int l = 0; l < n/2; l++) {
                int temp = lubangkunci[k][l];
                lubangkunci[k][l] = lubangkunci[k][n-1-l];
            
                lubangkunci[k][n - 1 - l] = temp;
                
            }
        
       
        
    }
    return lubangkunci;
    
}
}

