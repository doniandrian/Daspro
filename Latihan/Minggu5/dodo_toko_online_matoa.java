/**
 * 
 * @author Doni Andrian
 * @version 11 Oktober 2021
 */

import java.util.Scanner;
public class dodo_toko_online_matoa {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String website = input.next(); //input nama domain string

        String kata_pertama = website.substring(0,3); //mengambil 3 huruf pertama

        String kata_kedua = website.substring(4,website.length()-4); //mengambil kata tengah
        int panjang_kata_dua = kata_kedua.length();
        

        String kata_ketiga = website.substring(website.length()-3 ); //mengambil 3 huruf terakhir
        
        
        
        
        //bagian awal
        if ((kata_pertama.equals("www") && ((kata_ketiga).equals("net") ||kata_ketiga.equals("com")||kata_ketiga.equals("org")||kata_ketiga.equals("biz")) && (panjang_kata_dua<=10))  ){
            if (kata_kedua.contains("www") || kata_kedua.contains("com") ||  kata_kedua.contains("biz") || kata_kedua.contains("org") || kata_kedua.contains("net")){
                System.out.println("tidak valid");
            }else{
                System.out.println("valid");
            }
            
        
        
        
        
        }else{
            System.out.println("tidak valid");
        }
        
        
       
        
        

       

        
        
        
        




        


        
    }
    
}
