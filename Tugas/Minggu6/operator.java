/**
 * pertama input ada 2 buah bilangan integer
 * jika a dan b lebih besar dari 0 maka cek kondisi selajutnya apakah a lebih besar dari b jika ya maka print ">"
 * jika a lebih kecil dari b maka print "<"
 * selain itu maka print '='
 * jika a dan b  lebih kecil dari 0 (minus) maka print "Belum dapat ditentukan"
 * @author Doni Andrian
 * @version 21 Oktober 2021
 */
import java.util.Scanner;
public class operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();

        //proses
        if (a >=0 && b>=0){ //jika a dan b lebih besar dari 0 maka cek kondisi selajutnya apakah a lebih besar dari b jika ya maka print ">"
            if (a>b){
                System.out.println(">");
            }else if(a<b){
                System.out.println("<");//jika a lebih kecil dari b maka print "<"
            }else{
                System.out.println("=");//selain itu maka print '='
            }
        }else{
            System.out.println("Belum dapat ditentukan"); //jika a dan b  lebih kecil dari 0 (minus) maka print "Belum dapat ditentukan"
        }
        
    }
    
}
