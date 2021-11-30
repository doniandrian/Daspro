
//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class hadiah_untuk_wombat {
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner (System.in);
        //int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n ;
        do{
            n = Integer.parseInt(br.readLine());
            System.out.println(bagi2angka(n));

        }
        while (br.readLine()!=null);
            // n = Integer.parseInt(br.readLine());
            // System.out.println(bagi2angka(n));
            //br.readLine()!=null
            //!(line = scan.readLine()).isEmpty()
            
        
        
       
    }

    public static boolean cekprima(int n){
        int count = 0;
        boolean hasil = false;
        for (int i = 2; i*i <= n; i++){
            if (n % i == 0){
                count++;

            }
        }
        if (count > 0){
            hasil = false;
        }else{
            hasil = true;
        }
        return hasil;


    }
    public static boolean cekpangkat(int n){
        if (n==1){
            return false;
        }
        while (n != 1){
           
            if (n % 2 != 0){
                return false;
            
            }
            n /= 2;
            
        }
       
        return true;
        
       
        
    }
    public static String bagi2angka(int n){
       
        //int temp = 0;
        for(int i=n-1; i>0; i--){
           
           // for(int j = n;j>1;j--){
                
                if (cekprima(i)==true && cekpangkat(n-i)==true){
                    return (i + " " + (n-i));
                    //temp++;

                } //&& (i+j ==n)){

                // if (temp >=1){
                  //temp  break;
                   
            //    }
                
                
               // }
            }
           // if (temp == 0){
                return "jangan dibeli";

        }
        
        }
       
    
    

