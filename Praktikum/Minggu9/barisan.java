import java.util.Scanner;


public class barisan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        String k = sc.next();
        
        if (k.equals("!")){
            faktorial(n);

        }else{
            barisan(n);
        }
       


    }
    public static void faktorial(int n){ //method untuk faktorial
        int hasil = 1;
        for(int i = 1; i <= n; i++){
            hasil *= i; 
            System.out.print(hasil + " ");
        }
    }
    public static void barisan(int n){//method untuk barisan
        int hasil = 0;
        
        for (int i = 1; i <= n; i++){
        
            hasil = (int)Math.pow(2, i);//untuk menghitung pangkatnya
            System.out.print(hasil + " ");
        }

    }
    
}
