/**
 * @author Doni Andrian
 * @version 18 november 2021
 */
import java.util.Scanner;
public class wajik{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        //input
        int n = sc.nextInt();
        int a,temp;
        
        //proses
        for (int i = 0; i < n; i++){ //lopping untuk melooping banyaknya masukan
            a = sc.nextInt();
            
            
            if (a % 2 == 1){ //ngecek apakah merupakan bilangan ganjil
                
                temp = a/2+1; //jika ganjil maka bilangan tersebut dibagi 2 dan ditambah 1
            
            
            
            int k;
            //piramid pertama
            for (int j = 1; j <=temp; j++){ // looping untuk menampilkan piramid pertama yang berdiri
               
                for (k = j; k<temp; k++){ //looping untuk menampilkan spasi
                    System.out.print(" ");
                }
                for(k = 1;k<= 2*j-1;k++){ //looping untuk menampilkan *
                    System.out.print("*");

                }
                System.out.println();// enter untuk setiap selesai menghitung looping ke baris yang baru
                }
             //piramid kedua
            
            for (int j = temp; j>1; j--){ //menampilkan piramid kedua yang terbalik
               
                for (k = j; k<=temp; k++){ //looping untuk menampilkan spasi
                    System.out.print(" ");
                }
                for(k = 2;k< 2*j-1;k++){ //looping untuk menampilkan *
                    System.out.print("*");

                }
                System.out.println(""); //enter untuk setiap baris baru
                }

            
            }
            }
        
            

            

        }

    }
