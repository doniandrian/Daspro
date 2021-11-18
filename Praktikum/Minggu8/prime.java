/**
 * @author Doni Andrian
 * @version 16 november 2021
 */

import java.util.Scanner;


public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //input
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count,temp=1;
        //proses
        for (int i = a ; i<=b;i++){
            count = 1;
            for(int j = 2;j<= i/2;j++){
                if (i % j ==0){
                    count = 0;
                   
                    break;
                }
                
            }
            
            if (count == 1 && temp ==1){
                System.out.print(i);
                temp++;  
            
            }else if(count==1 && temp > 1){
                System.out.print(", " + i);
            }
             
        
        }

    }
    
}
