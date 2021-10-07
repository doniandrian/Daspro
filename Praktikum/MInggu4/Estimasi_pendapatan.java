/**
 * 
 * @author Doni Andrian
 * @version 4 Oktober 2020
 */

import java.util.Scanner;
public class Estimasi_pendapatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = Math.abs(input.nextInt()); //input T
        int P  = input.nextInt(); //input pendapatan
        
        int estimasi = (3*(T*T)) + (5*T) + 200; //hitung estimasinya
        
        
         if (estimasi >= P){
        System.out.println("sesuai estimasi"); //jika estimasi lebih dari sama dengan pendapatan
        }else{
         System.out.println("tidak sesuai estimasi"); //jika sebaliknya
            
         }

         


        
        

        



        
    }
    
}
