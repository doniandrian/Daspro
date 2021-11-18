/**
 * @author Doni Andrian
 * @version 30 Oktober 2021
 * pertama input ada 2 buah bilangan integer
 * deklarasi variabel x,y untuk menyimpan angka acak dari method Random() dan d untuk menyimpan hasil dari jarak eucledian
 * jika n bukan 0 maka lakukan looping sebanyak n kali kalau tidak maka output "NaN"
 * jika d < r maka innerArea + 1
 * jika sebaliknya maka outerArea + 1
 * setelah looping selesai hitung luas lingkarannya, hasil = (innerArea / (innerArea + outerArea)) * q * q;
 * output hasil
 */
 
 
import java.util.Scanner;
 
 
 
import java.util.Random;
public class MonteCarlo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input
        int n = input.nextInt();
        int q = input.nextInt();
        input.close();
 
        Random random = new Random(0); //random number generator dengan seed 0
        //deklarasi variabel
        double x; 
        double y;
        double d;
        double r = q/2; //hitung rationya

        //inisialisasi variabel
        double innerArea = 0;
        double outerArea = 0;
        
        //proses
        
        if (n==0){
            System.out.println("NaN"); //jika n==0 keluarkan "NaN"
            
 
        }else{
            for (int i =0; i < n;i++){
                x = random.nextDouble() * q; //ambil angka x sembarang
                y = random.nextDouble() * q; //ambil angka y sembarang
                d = Math.sqrt(((x-r)*(x-r)) + ((y-r)*(y-r))); //hitung jarak euclediannya
                
                if (d<r){
                    innerArea++; //jika d < r maka innerArea + 1
    
                }else{
                    outerArea++; //jika sebaliknya maka outerArea + 1
                }
    
            }
            
            double hasil = (innerArea / (innerArea + outerArea)) * q * q; //setelah looping selesai hitung luas lingkarannya
            System.out.printf("%.1f", hasil);
            
            
        }
        
        
        
        
       
 
        
    }
    
}