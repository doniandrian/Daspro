
import java.util.Scanner;
public class nestedloop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        //no1
        // int n = sc.nextInt();
        // int a = n;
        // for (int i = 1; i <= n; i++) {
        //     System.out.print("Round "+i+": ");
        //     for (int j = 1; j <= n; j++) {
        //         System.out.print(a +" ");

            
        //     }
        //     a--;
        //     System.out.println();

        // }
        //no2
        int n = sc.nextInt();
        int a = n;
        for (int i = 1; i <= n; i++) {
            System.out.print("Round "+i+": ");
            for (int j = 1; j <= a; j++) {
                System.out.print(a +" ");

            
            }
            a--;
            System.out.println();

        }


    }
    
}
