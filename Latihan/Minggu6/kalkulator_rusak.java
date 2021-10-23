/**
 * @author Doni Andrian
 * @version 21 Oktober 2021
 */
import java.util.Scanner;
public class kalkulator_rusak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String operasi = input.next(); //input berupa operasi dalam string
        int b = input.nextInt();
        
        input.close();

        
        int hasil;

        if (operasi.equals("+")){
            
            
            hasil = 2*a + 3*b-5; //kalkulasikan angka num1 dan num2
            System.out.println(hasil);
        }
        else if (operasi.equals("*")){
            
            
            hasil = 2*(a + b); //kalkulasikan angka num1 dan num2
            System.out.println(hasil);
        }
        else if (operasi.equals("-")){
            
            
            hasil = 2*(a-b); //kalkulasikan angka num1 dan num2
            System.out.println(hasil);
        }else{
            
            
            hasil =a + b; //kalkulasikan angka num1 dan num2
            System.out.println(hasil);

        }
        
        
    }
    
}
