/**
 * @author Doni Andrian
 * @version 5 december 2021
 */
import java.util.Scanner;
public class tumpukan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //input
        int n = sc.nextInt();//banyak kapasitas buku
        int m = sc.nextInt();//banyak operasinya
        //buat array kosong
        String[] operasi = new String[m];//array untuk menyimpan operasi 
        String buku[] = new String[n]; //array untuk menyimpan buku
        int temp = 0;
        //proses
        for(int i = 0; i < m; i++){//looping untuk banyaknya operasi
            operasi[i] = sc.next();//input operasi

            try{//java exceptions digunakan untuk mengatasi error yang disebabkan oleh out of bound
                if(operasi[i].contains("Ambil")){//jika operasi yang dimasukkan "Ambil"
                    int count = 0;
                    for(String book:buku){//cek apakah ada buku di dalam array
                        if(book==null){
                            count++;//jika tidak ada buku di dalam array maka count selalu ditambahkan
    
    
                        }
                    }
                    if(count==n){//jika banyaknya count == banyaknya kapasitas buku ini artinya slot di dalam array kosong masih null semua
                        System.out.println("GAGAL"); //maka print gagal
                    }else{
                        temp--;
                        System.out.println(buku[temp]);//jika terdapat isi di dalam array maka diambil buku dari paling bawah
                        buku[temp] =null;//buku yang sudah diambil dihapus
                       
                    }
    
                    
                   
                    
                }
                else if(operasi[i].contains("Tumpuk")){
                   
                    buku[temp] =sc.next();//jika operasi mengandung kata Tumpuk maka akan meminta input untuk bukunya
                    temp++;
                    
                    
                }

            }catch(Exception e){//jika terjadi error out of bound maka akan di skip dan lanjut ke looping berikutnya
                continue;
            }
            

            

        }
        
        
    }

    
}
