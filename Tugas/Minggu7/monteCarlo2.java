/**
 * @author Doni Andrian
 * @version 30 Oktober 2021
 */


import java.util.Scanner;



import java.util.Random;
public class monteCarlo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random rand = new Random(0); 
        int n = sc.nextInt();
        int d = sc.nextInt();
        double luas=0; 
        double euc=0;
        int innerArea=0;
        int outerArea=0;
        int i = 0; 
        if (n == 0){
            System.out.println("NaN");
        }else{
            do{
                double x = rand.nextDouble()*d;
                double y = rand.nextDouble()*d;
                euc = (x-d/2)*(x-d/2)+ (y-d/2)*(y-d/2);
                if (euc < (d/2)*(d/2)){
                    innerArea ++; 
                }else if(euc >= (d/2)*(d/2)){
                    outerArea ++;
                }
                i++;
            }while (i<n);
            luas = (innerArea*d*d)/(innerArea+outerArea);
            System.out.printf("%.1f", luas);
        }
    }
        
        
        
       

        
    
    
}
