/**
 * Kelas ini digunakan untuk merepresentasikan sebuah square yang memiliki
 * sebanyak n x n buah grid
 * 
 * @author (Doni Andrian)
 * @version (9 januari 2022)
 */
import java.util.Scanner;
class MySquare {
    // pada atribut ini disimpan sebanyak n x n buah angka
    private int[][] square;

    public MySquare(int[][] square) {//buat constructor
        
        // TO DO: IMPLEMENTASIKAN
        this.square = square; 
    }

    public boolean hasMagicRow() {
        // TO DO: IMPLEMENTASIKAN!
        int []count = new int[square.length];//buat array kosong untuk menampung jumlah tiap baris matriks
        boolean hasil = true;
        for(int i = 0; i < square.length; i++){
            for(int j = 0; j < square[i].length; j++){
                count[i]+= square[i][j]; //masukkan hasil dari penjumlahan tiap baris ke array count
            }
        }
        for(int i = 0; i < count.length; i++){ //looping untuk mmengecek apakah jumlah tiap baris sama
            for(int j = 0; j < count.length; j++){
                if(count[i]!= count[j]){
                    hasil = false;
                }
            }
            
        }
        return hasil;
    }
    String  cetak(){
        boolean hasil = hasMagicRow();//panggil method hasMagicRow
        String res = "";
        //jika hasil true maka resultnya MAGIC!
        //jika hasilnya false maka resultnya NOT MAGIC AT ALL
        if(hasil){
            res = "MAGIC!"; 

        }else{
            res = "NOT MAGIC AT ALL";
        }
        return res;
    }

}

public class Tester3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // input banyak kasus
        int n = sc.nextInt();
        //looping untuk setiap  kasus
        for(int i = 0; i < n; i++){
            int ukuran = sc.nextInt();//ukuran matriks
            int [][] matriks = new int[ukuran][ukuran];//deklarasi matriks kosong

            for(int j = 0; j < ukuran; j++){
                for(int k = 0; k< ukuran; k++){
                    matriks[j][k] = sc.nextInt();//isi matriks
                }
            }
            MySquare square = new MySquare(matriks);//buat objek baru 
            System.out.println(square.cetak());//keluaran hasil


        }
    }
}
