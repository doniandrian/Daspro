
import java.util.Scanner;
public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println(".............Try and Exception...........");
        Scanner datainput = new Scanner(System.in);
        System.out.print("angka: ");


        try{
            int a = datainput.nextInt();
            System.out.print("angka2: ");
            int b = datainput.nextInt();
            System.out.println(penjumlahan(a,b));



        }catch (Exception e){
            System.out.println("bukan angka");
        }finally {
            System.out.println("akhir program");
        }


    }
    public static int penjumlahan(int b, int c){
        return c + b;
    }
}
