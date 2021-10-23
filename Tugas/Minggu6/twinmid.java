/**
 * input ada 2 buat biangan integer
 * cek dahulu apakah banyak digit == 6, jika ya maka ambil angka pertama dan keduanya dengan menggunakan mod dam pembagian
 * jika angka1 == angka2 maka print 'Twin' jika tidak maka print "Not twin"
 * kemudian cek apakah banyak digit == 8 jika ya maka ambil angka pertama dan keduanya dengan menggunakan mod dam pembagian 
 * jika angka1 == angka2 maka print 'Twin' jika tidak maka print "Not twin"
 * selanjutnya jika banyak digit == 8 jika ya maka ambil angka pertama dan keduanya dengan menggunakan mod dam pembagian
 * jika angka1 == angka2 maka print 'Twin' jika tidak maka print "Not twin"
 * @author Doni Andrian
 * @version 21 Oktober 2021
 */
import java.util.Scanner;
public class twinmid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input
        int banyak_digit = input.nextInt();
        long digit = input.nextLong();
        input.close();
        //deklarasi variabel
        long angka1,angka2;
        //proses
        if (banyak_digit==6){ //cek dahulu apakah banyak digit == 6, jika ya maka ambil angka pertama dan keduanya dengan menggunakan mod dam pembagian
            angka1 = (digit % 10000) / 1000; 
            angka2 = (digit % 1000) / 100;
            
            if (angka1 == angka2){ //jika angka1 == angka2 maka print 'Twin' jika tidak maka print "Not twin"
                System.out.println("Twin");
            }else{
                System.out.println("Not twin");
            }
        }else if (banyak_digit == 8){//cek dahulu apakah banyak digit == 8, jika ya maka ambil angka pertama dan keduanya dengan menggunakan mod dam pembagian
            angka1 = (digit % 100000) / 10000; 
            angka2 = (digit % 10000) / 1000;
            
            if (angka1 == angka2){//jika angka1 == angka2 maka print 'Twin' jika tidak maka print "Not twin"
                System.out.println("Twin");
            }else{
                System.out.println("Not twin");
            }

        }else{ //jika banyak digit == 10
            angka1 = (digit % 1000000) / 100000; 
            angka2 = (digit % 100000) / 10000;
            
            if (angka1 == angka2){//jika angka1 == angka2 maka print 'Twin' jika tidak maka print "Not twin"
                System.out.println("Twin");
            }else{
                System.out.println("Not twin");
            }

        }



        
    }
    
}
