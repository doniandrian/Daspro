import java.util.Scanner;
public class pola_bilangan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;

        for(int i = 0; i < n; i++) {
            a = sc.nextInt();
            for(int j = 0; j < a; j++) {
            
                for(int k = 2; k < (a-j) * 2; k++) {
                    System.out.print(" ");
                }
                for(int k = 0;k<=j;k++){
                    System.out.print(j+1 + " ");
                }
                System.out.println();
             
            }
        }


        
    }
    
}
