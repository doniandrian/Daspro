/**
 * pertama buat scanner input
 * kemudian ada 4 buat input integer
 * lalu ubah integer ke xexadecimal menggunakan method integer.toXexString() 
 * lalu output e ,f ,g ,h
 * 
 * 
 */
import java.util.Scanner;
public class i20020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        

        String e = Integer.toHexString(a);
        String f = Integer.toHexString(b);
        String g = Integer.toHexString(c);
        String h = Integer.toHexString(d);
        


        System.out.printf("%02X %02X %02X %02X",a,b,c,d);



    
        


        

    }
    
}
