/**
 * @author Doni Andrian
 * @version 28 Oktober 2021
 */
import java.util.Scanner;
public class x {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        int kasus2;
        

        int count = 1;
        double hasil = 0;
        double temp = kasus;

        while (kasus!=-1){
            
            hasil = temp/count;
            System.out.printf("%.2f", hasil);
            System.out.println();
            count++;


            kasus2 = input.nextInt();
            temp += kasus2;
            if (kasus2 == -1){
                kasus = -1;
            }


        } 
            
            
           

            

    


      
      
            
         

        
        
    }
    
}
