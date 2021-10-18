/**
 * 
 * @author Doni Andrian
 * @version 19 Oktober 2021
 */
import java.util.Scanner;
public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String operasi = input.next();

        
        String angka1,angka2;
        int num1,num2,hasil;
        

        if (operasi.contains("+")){
            angka1 = operasi.substring(0,operasi.lastIndexOf('+'));
            angka2 = operasi.substring(operasi.lastIndexOf('+')+1);
            num1 = Integer.parseInt(angka1);
            num2 = Integer.parseInt(angka2);
            hasil = num1 + num2;
            System.out.println(hasil);



        }else if (operasi.contains(":")){
            angka1 = operasi.substring(0,operasi.lastIndexOf(':'));
            angka2 = operasi.substring(operasi.lastIndexOf(':')+1);
            num1 = Integer.parseInt(angka1);
            num2 = Integer.parseInt(angka2);
            hasil = num1 / num2;
            System.out.println(hasil);     
        
        }else if(operasi.contains("-")){
            angka1 = operasi.substring(0,operasi.lastIndexOf('-'));
            angka2 = operasi.substring(operasi.lastIndexOf('-')+1);
            num1 = Integer.parseInt(angka1);
            num2 = Integer.parseInt(angka2);
            hasil = num1 - num2;
            System.out.println(hasil);
    
        }else{
            
            angka1 = operasi.substring(0,operasi.lastIndexOf('x'));
            angka2 = operasi.substring(operasi.lastIndexOf('x')+1);
            num1 = Integer.parseInt(angka1);
            num2 = Integer.parseInt(angka2);
            hasil = num1 * num2;
            System.out.println(hasil);
        }
    }
}
