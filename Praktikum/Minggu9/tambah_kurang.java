import java.util.Scanner;
public class tambah_kurang {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int hasil = 0;
        if (k ==-1){
            hasil = subDigit(n);
        }
        if (k == 1){
            hasil = addDigit(n);
        }
        System.out.println(hasil);

    }
    public static int jumlahdigit(int n){ //method untuk menghitung jumlah digit
        int count = 0;
        while (n!= 0){ //selama n bukan 0 , n akan dibagi 10 dan menambahkan count
            n = n /10;
            count++;
        }
        return count;
    }
    public static int addDigit(int n){
        int count = jumlahdigit(n); //panggil method jumlahdigit
        int bagi = 1;
        int mod = 10;
        int hasil = 0;
        for(int i=0; i<count; i++){ //selama i < jumlahdigit
            hasil += (n % mod) / bagi; // hasilnya ditambahkan dari digit terakhir sampai digit terdepan dengan n % mod dan memembaginya
            mod = mod * 10;
            bagi = bagi * 10;
        }

        return hasil;
    }
    public static int subDigit(int n){
        int count = jumlahdigit(n);
        int bagi = (int)((Math.pow(10, count-1))); //hitugng banyaknya angka pembaginya
        int mod = 10;
        int hasil = (int) (n / bagi);
        for(int i=1; i<count; i++){//angka diabil dari angka terdepan
            bagi = bagi / 10;
            hasil -= (n / bagi) % mod; //mengurangi angka 
            
            
            
           
        }

        return hasil;
    }

    
}
