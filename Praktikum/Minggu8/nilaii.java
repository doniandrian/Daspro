
import java.util.Scanner;
public class nilaii {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        String kata;
        
        int panjang;
        char kata1;
        String angka = "";
        
        char spasi = ' ';
        int angka1;
        int count = 0;
        
      

        for (int i = 0; i <= n;i++){
            kata = sc.nextLine();
           
            kata = kata.replaceAll("[^\\d]", " ");
            kata = kata.trim();
            kata = kata.replaceAll(" +", " ");

             
            panjang = kata.length();
            
           
            for (int j = 0; j < panjang; j++){
                kata1 = kata.charAt(j);

                
                
                if (kata1 != spasi){
                        angka += kata1;

                 }else if(kata1 == spasi){
                    angka1 = Integer.parseInt(angka);
                    count += angka1;
                    
                    angka = "";
                }
                    
                      
            
            }
            

            } 
            System.out.print(count); 
          
            
        
           

        }
        
        
        
    }
    

