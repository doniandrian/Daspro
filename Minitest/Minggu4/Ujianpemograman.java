/**
 * pertama input ada 4 buah bilangan bulat
 * kemudian masuk ke if, jika a==0 atau b==0 atau c==0 maka tidak memenuhin
 * selain itu jika jumlah soal == n maka memenuhi
 * jika tidak sama jumlah soalnya maka tidak memenuhi
 * @author Doni Andrian
 * @version 8 Oktober 2021
 */


import java.util.Scanner;
public class Ujianpemograman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = (input.nextInt());
        int b =  (input.nextInt());
        int c =  (input.nextInt());
        int n = input.nextInt();
        int jumlah = a + b + c; //cari jumlahnya

        if (a<=10 && b<=10 && c<=10 && n<=20 && n>=1){
            if (a==0 || b==0 || c==0){ //jika a==0 atao b==0 atau c==0
                System.out.println("tidak memenuhi");
            }else if (jumlah>=n){ //jika jumlah soal == n
                System.out.println("memenuhi");
    
            }else{ //jika tidak keduanya
                System.out.println("tidak memenuhi");
            }

        }else{ 
            System.out.println("tidak memenuhi");
        }
        

        

        
    }
    
}
