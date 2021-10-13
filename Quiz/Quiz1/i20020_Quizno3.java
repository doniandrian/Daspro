/**
 * input ada 3 buah bilangan integer
 * syaratnya jika pemburu menembak objek maka pemburu mati jika penyihir yang ditembak maka penyihir yang mati
 * pemburu akan penembak objek dahulu maka 
 * jika s = b = o atau jika o-s lebih kecil dari b maka pemburu meenang
 * jika tidak penyihir menang
 * @author Doni Andrian
 * @version 13 Oktober 2021
 */
import java.util.Scanner;
public class i20020_Quizno3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s = input.nextInt();
        int b = input.nextInt();
        int o = input.nextInt();

        if ((s==b && b==o && s==o) || ((o-s)<b)){

            System.out.println("Pemburu menang!");



        }else{
            System.out.println("Penyihir menang!");

        }
        
        
    }
    
}
