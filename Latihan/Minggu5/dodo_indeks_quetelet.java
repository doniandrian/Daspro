/**
 * @author Doni Andrian
 * @version 12 Oktober 2021
 */
import java.util.Scanner;
public class dodo_indeks_quetelet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float massa = input.nextFloat(); //input massa bilangan real
        input.close();

        if(massa<16.0){
            System.out.println("Underweight (Severe thinness)");

        }else if(massa>=16.0 && massa<=16.9){
            System.out.println("Underweight (Moderate thinness)");

        }else if (massa>=17.0 && massa<=18.4){
            System.out.println("Underweight (Mild thinness)");

        }else if(massa>=18.5 && massa<=24.9){
            System.out.println("Normal");
        }else if (massa>=25.0 && massa<=29.9){
            System.out.println("Overweight (Pre-obese)");

        }else if (massa>=30.0 && massa<=34.9){
            System.out.println("Obese (Class I)");

        }else if (massa>=35.0 && massa<=39.9){
            System.out.println("Obese (Class II)");
        }else{
            System.out.println("Obese (Class III)");
        }
        
    }
    
}
