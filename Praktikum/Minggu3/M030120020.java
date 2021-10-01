/**
 * pertama import kelas Scanner
 * lalu membuat input panjang,lebar,tinggi dan debit
 * kemudian hitung volume bak mandi dengan rumus (p*l*t)
 * lalu hitung waktu pengisian air dengan rumus volume/debit
 * kemudia tampilkan output waktu_pengisian waktu
 * @author Doni Andrian - 6182001020
 * @version 27 September 2021
 */

import java.util.Scanner;  //import kelas scanner
public class M030120020 {
    public static void main(String[] args) {
        // int intValue= 10; 
        // double doubleValue=10.0; 
        // String stringValue = "String example";
        // int intValue1= 10; 
        // double doubleValue1=10.0; 
        // String stringValue1 = "String example";
        // int intValue2 = 5;
        // double doubleValue2 = 5.0; 
        // String stringValue2 = "!!";

        // System.out.println(intValue);
        // System.out.println(doubleValue);
        // System.out.println(stringValue);
        // System.out.println(stringValue+"!!");
        // System.out.println(intValue1 + intValue2);
        // System.out.println(doubleValue1 + doubleValue2);
        // System.out.println(stringValue1 + stringValue2);
        // System.out.println(stringValue1 + intValue2 + intValue1);
        // System.out.println(stringValue2 + (intValue1 + intValue2));
        /**
 * pertama import kelas Scanner
 * lalu membuat input panjang,lebar,tinggi dan debit
 * kemudian hitung volume bak mandi dengan rumus (p*l*t)
 * lalu hitung waktu pengisian air dengan rumus volume/debit
 * kemudia tampilkan output waktu_pengisian waktu
 * @author Doni Andrian - 6182001020
 * @version 27 September 2021
 */
 
import java.util.Scanner;  //import kelas scanner
public class M030120020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // membuat scanner baru dengan nama "input"
        
        int panjang = input.nextInt(); //input panjang bak mandi
        int lebar = input.nextInt(); //input lebar bak mandi
        int tinggi = input.nextInt(); // input tinggi bak mandi
        
        int debit = input.nextInt(); // input debit air
 
        int volume = panjang * lebar * tinggi; //hitung volume bak mandi
        int waktu_pengisian = volume / debit; // hitung waktu pengisian 
        System.out.println("Waktu pengisian: " +waktu_pengisian + " detik.");
 
       
 
 
    }
    
}

        





       


    }
    
    
}
