import java.util.Scanner;
public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Pembeli[] p = new Pembeli[N];
        for (int i = 0; i < N; i++){
            String input = sc.next();
            int pembelian = sc.nextInt();
            if (input.equals("true")){
                p[i] = new Pembeli(true, pembelian);
            }
            else p[i] = new Pembeli(false, pembelian);
        }
        PembelianBulanan pb = new PembelianBulanan(p);
        pb.hitungTotalPembelian();
        System.out.println(pb.getTotalAnggota());
        System.out.println(pb.getTotalNonAnggota());
    }
}
class Pembeli{
    private boolean isAnggota;
    private int pembelian;

    public Pembeli(boolean isAnggota, int pembelian) {
        this.isAnggota = isAnggota;
        this.pembelian = pembelian; 
    }

    public boolean getIsAnggota() {
        return isAnggota;
    }

    public int getPembelian() {
        return pembelian;
    }

    public void setIsAnggota(boolean isAnggota) {
        this.isAnggota = isAnggota;
    }

    public void setPembelian(int pembelian) {
        this.pembelian = pembelian;
    }
}
class PembelianBulanan{
    private Pembeli[] arrPembeli;
    private int totalAnggota = 0;
    private int totalNonAnggota = 0;

    public PembelianBulanan(Pembeli[] arrPembeli) {
        this.arrPembeli = arrPembeli;
    }

    public void hitungTotalPembelian(){
        for (int i = 0; i < arrPembeli.length; i++){
            if (arrPembeli[i].getIsAnggota() == true){
                totalAnggota += arrPembeli[i].getPembelian();
            }
            else totalNonAnggota += arrPembeli[i].getPembelian();
        }
    }

    public Pembeli[] getArrPembeli() {
        return arrPembeli;
    }

    public int getTotalAnggota() {
        return totalAnggota;
    }

    public int getTotalNonAnggota() {
        return totalNonAnggota;
    }
}