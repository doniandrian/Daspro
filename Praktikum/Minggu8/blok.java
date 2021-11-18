
import java.util.Scanner;
public class blok {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String kata;
        int panjang;
        
        
        



        for (int i = 0; i < n;i++){
            kata = sc.next();
            panjang = kata.length();
            int max = 1;
            int temp = 1;
            



            

            for (int j = 1;j<panjang;j++){
                
                
                if (kata.charAt(j) == kata.charAt(j -1)){
                        temp++;
                        max = Math.max(max,temp);
                }else{
                    temp = 1;
                }
                
                
                


               

            }
            
            System.out.println("Kasus ke-" + (i+1) + ": " + max);
        }
    }

    
}
