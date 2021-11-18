
import java.util.Scanner;
public class wajik{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a,temp;

        for (int i = 0; i < n; i++){
            a = sc.nextInt();
            int l = 0;

            temp = a/2 ;
            for (int j = 1; j <=temp; j++, l = 0){
               
                for (int k = 1; k<=temp-j; k++){
                    System.out.print(" ");
                }
                while (l != 2 * j -1){
                    System.out.print("* ");
                    l++;
                }
                System.out.println();
            }

            

        }

    }
}