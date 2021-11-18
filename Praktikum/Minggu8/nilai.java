/**
 * @author Doni Andrian
 * @version 17 november 2021
 */
import java.util.Scanner;
public class nilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //input
        int n = sc.nextInt();
        //deklarasi
        String kata;
        
        int panjang;
        char kata1;
        
        
       
        
        
      
        //proses
        for (int i = 0; i <= n;i++){
            kata = sc.nextLine();
        
            panjang = kata.length();
            int angka1 = 0;
            int count = 0;
            String angka = "0";

            
           
            for (int j = 0; j < panjang; j++){
                kata1 = kata.charAt(j);

                
                if (Character.isDigit(kata1) ){
                    angka += kata1;  
                    
                    
                    

                }else {
                    angka1 += Integer.parseInt(angka);
                    
                    angka = "0";
                }
                
 
                
                
                
                 count = angka1 + Integer.parseInt(angka); 
            }
            if (i > 0){
                System.out.println(count);

            }
            
            
            
        
           

        }
        
       
        
        
    }
    
}
