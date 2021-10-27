/**
 * @author Doni Andrian
 * @version 26 Oktober 2021
 */
import java.util.NoSuchElementException;
import java.util.Scanner;
public class kelipatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input
        int angka1 = input.nextInt();
        int angka2 = input.nextInt();
        int angka3;
        
      
        //proses
        int count = 0;
        boolean hasil = true;
        if (angka1>0 && angka1 <10){
            while (hasil == true) { //selama hasilnya true 
                if (angka2 % angka1 == 0) {//cek apakah kelipatan atau bukan
                    
                    angka3 = input.nextInt();//jika kelipatan maka terima masukan lagi
                    angka2 = angka3; 
                    count++; //tambahkan jumlah
                }else{
                    hasil = false;//jika bukan kelipatan hasil menjadi false
                }
    
            }

        }
        
        System.out.println(count);
        
        
    }
    
}
