import java.util.Scanner;
public class dodo_suvenir_piramida {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            double tinggi = tinggi(a);
            double bidang_miring = bidang_miring(a);
            double luas_permukaan = luas_permukaan(a);
            double volume = volume(a);
            System.out.printf("%.5f ",tinggi); 
            System.out.printf("%.5f ",bidang_miring); 
            System.out.printf("%.5f ",luas_permukaan); 
            System.out.printf("%.5f",volume); 
            System.out.println();

        }
        
    }
    public static double tinggi(double a){
        double hasil;
        hasil = Math.sqrt((a*a) -(0.5*a*a));
        return hasil;
    }
    public static double bidang_miring(double a){
        double bidang_miring = Math.sqrt(tinggi(a)*tinggi(a)+0.25*a*a);
        return bidang_miring;
    }
    public static double luas_permukaan(double a){
        double luas_permukaan = a*a + 8*0.5*(0.5*a)*bidang_miring(a);
        return luas_permukaan;
    }
    public static double volume(double a){
        double volume = (a *a*tinggi(a))/3;
        return volume;
    }
    
}
