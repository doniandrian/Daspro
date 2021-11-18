/**
 * @author Doni Andrian
 * @version 27 OKTOBER 2021
 */

import java.util.Scanner;
public class coba_tebak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input

        int n = input.nextInt();
        input.nextLine();
        String kata = input.nextLine();
        input.close();
        //deklarasi variabel
        String kata_list = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
       
        char underscore = '_';
        
   
        
        kata = kata.replaceAll(" ", ""); //hilangkan spasi dengan menggunakan method replaceAll()
        //proses
        for (int i = 0; i < n; i++) {
            if (kata.charAt(i)==(underscore)) { 

                kata = kata.replace(kata.charAt(i), kata_list.charAt(n-1)); //ganti underscore dengan huruf ganti

            }
        }
        
        
        System.out.println(kata);


        
    }
    
}
