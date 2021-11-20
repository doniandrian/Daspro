/**
 * @author Doni Andrian
 * @version 18 november 2021
 */
import java.util.Scanner;
public class dodo_taplak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //input

        int n = scanner.nextInt();
        //deklarasi
        int a;
        int p = 1;

        int temp1 = n;
        int temp;
         
        //proses
        while (temp1>0){ //selama temp1 bukan 0
            

            for(int i=1;i< temp1+1 ;i++) { 
                

            for(int j=i; j < temp1+1 ;j++){ //looping untuk tiap baris


                System.out.print(  " " + j );
            }
            for(int k=1; k < i ;k++)
            {

                temp =temp1 -p;
                System.out.print(" "+temp );
                p++;
            }
            System.out.println();
            p = 1;
        }
        a = scanner.nextInt();
        temp1 = a;

            
        }
        
            
        
    
    
}
}