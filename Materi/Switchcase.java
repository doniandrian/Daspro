
import java.util.Scanner;
public class Switchcase {
    public static void main(String [] args){
        // switch caase
        
        Scanner userinput = new Scanner(System.in);
        String input;
        System.out.print("nama : ");
        input = userinput.next();

        switch (input){
            case "kejol":
            System.out.println("saya kejol");
            break;
            case "pines":
            System.out.println("saya pines");
            break;
            default:
            System.out.println(input + " saha sia??");
        }

        


    }

    
}
