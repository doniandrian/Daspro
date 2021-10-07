/**
 * @author Doni Andrian
 * @version 7 OKTOBER 2021
 */
import java.util.Scanner;
public class Belokan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next(); //dari mana arah mottomatic
        String b = input.next(); //arah yang dituju Mottomatic
        String c = input.next(); //arah dari mana kendaraan lain
        //syarat1
        if (a.equals("Selatan")  && b.equals("Utara") && c.equals("Timur")){
            System.out.println("Ya");
        }else if (a.equals("Barat") && b.equals("Timur") && c.equals("Selatan")){
            System.out.println("Ya");
        }else if (a.equals("Utara") && b.equals("Selatan") && c.equals("Barat")){
            System.out.println("Ya");
        }else if (a.equals("Timur") && b.equals("Barat") && c.equals("Utara")){
            System.out.println("Ya");
            //syarat2
        }else if (a.equals("Selatan") && b.equals("Barat") && (c.equals("Timur")||c.equals("Utara"))){
            System.out.println("Ya");
        }else if (a.equals("Barat") && b.equals("Utara") && (c.equals("Selatan")||c.equals("Timur"))){
            System.out.println("Ya");
        }else if (a.equals("Utara") && b.equals("Timur") && (c.equals("Barat")||c.equals("Selatan"))){
            System.out.println("Ya");
        }else if (a.equals("Timur") && b.equals("Selatan") && (c.equals("Utara")||c.equals("Barat"))){
            System.out.println("Ya");
        }else{
            System.out.println("Tidak");
        }

    }
    
}
