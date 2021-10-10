/**
 * input ada  3 buah bilangan integer a , b, c 
 * untuk mengetahui apakah terdapat operasi penjumlahan maka cek apakah a + b == c
 * untuk mengetahui apakah terdapat operasi pengurangan maka cek apakah a-b ==c atau sebaliknya 
 * untuk mengetahui apakah terdapat operasi perkalian maka cek apakah a*b ==c 
 * jika ada ouput ada jika tidak maka output tidak ada
 * @author Doni Andrian
 * @version 8 oktober 2021
 */

import java.util.Scanner;
public class Aritmatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if ((a+b) == c){ //jika a + b ==c maka terdapat operasi matematika yaitu penjumlahan
            System.out.println("ada");


        }else if((b-a == c)||(a-b == c)){ //jika b-a =c atau sebaliknya maka ada operasi pengurangan
            System.out.println("ada");
        }else if(a*b == c){ //jika a * b = c maka ada operasi perkalian
            System.out.println("ada");

        }else if((a/b == c) || (b/a == c)){ //jika a/b =c atau b/a = c maka ada operasi pembagian
            System.out.println("ada");

        }else{
            System.out.println("tidak ada");
        }
        
    }
    
}
