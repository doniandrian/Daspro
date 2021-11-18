import java.util.Scanner;
public class kelipatan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1 = input.nextInt();
        int angka2;
        

        int count = -1;

        do{
            angka2 = input.nextInt();
            count++;
        }while(angka2 % angka1 == 0);

        System.out.println(count);

    }
    
}
