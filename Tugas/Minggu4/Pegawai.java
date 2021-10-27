/**
 * 
 * @author Doni Andrian
 * @version 10 Oktober 2021
 */

import java.util.Scanner;
public class Pegawai {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double A = input.nextDouble(); //input banyaknya hari kerja
        double B = input.nextDouble(); //input banyaknya kehadiran pegawai
        double C = input.nextDouble(); //input gaji pokok
        double gaji;
        double bonus;
        double kehadiran;
        

        if (A == B){
            bonus = (10.0/100.0) * C;
            gaji = C + bonus;
            
            System.out.printf("%.2f",gaji);


        }else if(B < A){
            kehadiran = (B/A)*100;
            gaji = (kehadiran/100) * C;
            System.out.printf("%.2f",gaji);
        


        }
        
    }   
    
}
