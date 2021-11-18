/**
 * @author Doni Andrian
 * @version 2 november 2021
 * pertama input ada 2 buah bilangan 
 * kemudian masuk ke looping dengan mencari hasil derajat keanggotaannya
 * kemudian cari nilai terkecilnya berserta usianya
 */

import java.util.Scanner;
import java.util.function.DoublePredicate;
import java.util.stream.DoubleStream;
public class i20020_Quiz2no2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double n = sc.nextInt();
       
        double x = sc.nextInt();
        
        double hasil= 0,angka;
        double x2,temp,temp2,temp3,hasil1;
        temp = x;
        int i = 1;
        Double min = 0.0;
        while (i < n){
            

            if (temp<=0 || temp >=70){
                hasil = 0;
                
                
                
            
            }else if(temp >0 && temp <=35){
                hasil = temp/35;
                
               
                 
               
            }else if(temp >35 || temp<70){
                hasil = (70 -x) /35;
               
                
                 
                
            }
            
            
            
           
           
            
           
            x2 = sc.nextInt();
            temp = x2;
            System.out.println(min);
            

            if (hasil < min ){
                min = hasil;
             }
             
            i++;
            

        }
        System.out.printf("%.5f",min);
    }
    
}
