/**
 * @author Doni Andrian
 * @version 21 november 2021
 */

import java.util.Scanner;
public class dodo_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //input
        String kata = sc.next();
        String temp = kata;
        String kata2;
        //proses
        while(true) {//looping akan terus berjalan selama kondisinya true
            if(temp.length() ==0) { //jika panjang katanya adalah 0 maka looping dihentikan
                break;
                
            }
            else{
                for(int i = 1; i <=temp.length();i++){ //untuk melooping panjang katanya
                    for(int j = 0;j<=temp.length()-i;j++){ //melooping banyak katanya dikurangi i
                        
                        
                        for(int k = j;k<=j + i -1;k++){ //melooping kata yang akan ditampilkan
                            System.out.print(temp.charAt(k));//tampilkan hurufnya pada index-k
                        }
                        System.out.println(); //enter untuk membuat baris baru
                        
                    }
                }
                
               
            }
            if (sc.hasNext()){ //untuk mengetahui apakah ada input dari user atau tidak , nilai akan true jika ada jika tidak ada nilainya menjadi false
                kata2 = sc.next();//input kata selanjutnya
                temp = kata2;

            }else{ //jika tidak ada input lagi dari user maka looping dihentikan
                break;
            }
            
        
            
            
           
        }
        
    }
    
}
