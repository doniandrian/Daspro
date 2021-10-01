package Minggu3;


/**
 * Write a description of class Membalik here.
 *
 * @author Doni Andrian - 6182001020
 * @version 23 September 2021
 */


import java.util.Scanner;

public class Membalik2 {
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int satuan = (a % 10); 
        int puluhan = (((a - satuan) % 100) / 10); 
        int ratusan = (((a - (satuan + puluhan)) % 1000) / 100) ;
        int ribuan = ((a - (satuan + puluhan + ratusan)) % 10000) / 1000;
        
        System.out.println(satuan+"" + puluhan+"" + ratusan+"" +ribuan);
    }
}

    

