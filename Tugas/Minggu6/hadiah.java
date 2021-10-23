/**
 * input ada 3 buah integer
 * jika a,b,c lebih besar sama dengan 90, cek apakah nilai selalu naik, jika ya maka print "sepeda motor", jika tidak print "sepeda"
 * jika a,b,c lebih kecil dari 90 maka, cek apakah nilai selalu naik, jika ya maka print "miniatur sepeda", jika tidak print "permen"
 * jika semua syarat tidak dipenuhi maka print "permen"
 * @author Doni Andrian
 * @version 21 Oktober 2021
 */
import java.util.Scanner;
public class hadiah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();

        //proses
        if (a>=90 && b>=90 & c>=90){ //jika a,b,c lebih besar sama dengan 90, cek apakah nilai selalu naik, jika ya maka print "sepeda motor", jika tidak print "sepeda"
            if ((a<b) && (c > b)){
                System.out.println("sepeda motor");
            }else{
                System.out.println("sepeda");
            }
        }else if(a<90 && b<90 & c<90){ //jika a,b,c lebih kecil dari 90 maka, cek apakah nilai selalu naik, jika ya maka print "miniatur sepeda", jika tidak print "permen"
            if ((a<b) && (c>b)){
                System.out.println("miniatur sepeda");
            }else{
                System.out.println("permen");
            }
            
        }else{ //jika semua syarat tidak dipenuhi maka print "permen"
            System.out.println("permen");
        }
        
        
    }
}


    

