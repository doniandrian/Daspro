
import java.util.Scanner;
class Pembeli {
    boolean isPembeli;
    int pembelian;
    Pembeli(boolean isPembeli,int pembelian) {
        this.isPembeli = isPembeli;
        this.pembelian = pembelian;

    }
    
}
 class PembelianBulanan{
    int [] arrPembeli;
    int totalAnggota =0;
    int totalNonAnggota = 0;
    PembelianBulanan(int [] arrPembeli){
        this.arrPembeli = arrPembeli;
    }
    void hitungTotalPembelian(){
        for(int i=0; i< arrPembeli.length; i++){
            

        }
    }


}
 public class toko_kopi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String kondisi;
        int nilai;
        arrPembeli[] pembeli= new arrPembeli[n];

        for(int i=0;i<n;i++){
            kondisi = sc.next();
            if(kondisi.equals("true")){
                nilai = sc.nextInt();
                pembeli[i] = new pembeli(kondisi,nilai);
            }
            else{
                nilai = sc.nextInt();
                
            }
        }
    }

}
