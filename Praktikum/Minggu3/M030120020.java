import java.util.Scanner;
public class M030120020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int panjang = input.nextInt(); 
        int lebar = input.nextInt();
        int tinggi = input.nextInt();
        
        int debit = input.nextInt();

        int volume = panjang * lebar * tinggi;
        int waktu_pengisian = volume / debit;
        System.out.println(waktu_pengisian + " detik");

       


    }
    
}
