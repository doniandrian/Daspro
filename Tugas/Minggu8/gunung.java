/**
 * @author Doni Andrian
 * @version 21 november 2021
 */

import java.util.Scanner;  
                                                                
public class gunung {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //input

        int n = sc.nextInt();
        //deklarasi
        int  a,b;
        int i;
        
        String hasil = "";
        
        for (int t = 0; t < n; t++) { //looping untuk banyaknya test kasus
            //input
            a = sc.nextInt();
            b = sc.nextInt();
        
            //proses    
            for (i = 1; i <= b; i++) { //untuk melooping banyaknya baris
                for (int f = 1; f <= a; f++) {//untuk melooping banyaknya segitiga ke kanan
                    for (int j = 1; j <= b-i; j++) {// untuk melooping spasinya
                        
                        if (f >= 2){ //jika f >= 2 maka spasi akan di print sebanyak 2 kali
                            hasil += "  ";
                        }else{ //jika f <= 1 spasi akan di print 1 kali ini untuk spasi pertama kali palin kiri
                            hasil += " "; 
                        }

                    }
                    for (int k = 1; k <= 2*i-1; k++) { //looping untuk menampilkan @ selama k <= 2 * i -1
                       hasil += "@";
                        
    
                    }
                    

                }
               hasil+= "\n"; //enter untuk membuat baris baru
               
                
            }
            
                
               
                

                

        }
        System.out.print(hasil);
       
        
            
            
        
    }
    
}
