import java.util.Scanner;
public class branching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        double discount = 0.08*price;
        price = (price>=128)?0.16*price:price-discount;
        System.out.println(price);


    }
    
}
