import java.util.Scanner;
public class Belokan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next(); //dari mana arah mottomatic
        String b = input.next(); //arah yang dituju Mottomatic
        String c = input.next(); //arah dari mana kendaraan lain

        if (a.equals("Selatan")  && b.equals("Utara") && c.equals("Timur")){
            System.out.println("Ya");
        }else if (a.equals("Barat") && b.equals("Timur") && c.equals("Utara")){
            System.out.println("Ya");
        }else if (a .equals("Utara") && b == "Selatan" && c== "Barat"){
            System.out.println("Ya");
        }else if (a == "Timur" && b =="Barat" && c =="Selatan"){
            System.out.println("Ya");
        }else if (a == "Selatan" && b =="Barat" && c == "Timur"){
            System.out.println("Ya");
        }else if (a == "Barat" && b =="Utara" && c == "Selatan"){
            System.out.println("Ya");
        }else if (a == "Utara" && b =="Timur" && c == "Barat"){
            System.out.println("Ya");
        }else if (a == "Timur" && b =="Selatan" && c == "Utara"){
            System.out.println("Ya");
        }else{
            System.out.println("Tidak");
        }





    }
}