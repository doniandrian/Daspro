/**
 * @author Doni Andrian
 * @version 4 Oktober 2020
 */

import java.util.Scanner;
public class Magic_spell {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kalimat = input.nextLine();
        int panjang = kalimat.length(); //cari panjang kalimat
        char huruf1 = kalimat.charAt(0); //cari huruf pertama
        char huruf2 = kalimat.charAt(panjang-1); //cari huruf terakhir


        //ubah char ke int
        int hrf1 = huruf1; 
        int hrf2 = huruf2;
        

        int selisih = Math.abs(hrf2 - hrf1); //cari selisih nya kemudian dimutlakan
        
        if(huruf1 == huruf2){
            System.out.println("magical");  //jika huruf pertama == huruf terakhir 

        }else if(selisih == 1){
            System.out.println("magical"); //jika selisihnya == 1

        }else{
            System.out.println("tidak magical"); //jika tidak keduanya	
        }
        

        
        
    
    }
    
}
