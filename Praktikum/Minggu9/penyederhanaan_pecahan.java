
import java.util.Scanner;
public class penyederhanaan_pecahan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        sederhana(a,b);


        
    }
    public static void sederhana(int a,int b){
        while (a % 2 ==0 && b % 2==0){ //looping selama angka a dan b nya genap
            a /= 2;  //angka a da b akan terus dibagi 2 sampai angkanya genap
            b /=2;
        }
        System.out.println(a + "/" + b);

    }
    
}
