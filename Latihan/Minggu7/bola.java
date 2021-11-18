/**
 * @author Doni Andrian
 * @version 28 Oktober 2021
 */
import java.util.Scanner;
public class bola {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //input
        double h = input.nextDouble();
        double d = input.nextDouble();

        double panjang = h * d;

        double jarak = h;
        

        double batas = 0.01;


        //proses
        while (batas <= panjang ){
           

            jarak +=  panjang*2;
            panjang *= d;


        }
        System.out.printf("%.4f", jarak);
        
        
    }
    
}
