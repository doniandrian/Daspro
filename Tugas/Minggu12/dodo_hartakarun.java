/**
 * @author Doni Andrian
 * @version 20 dec 2021
 */
import java.util.Scanner;
public class dodo_hartakarun {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //input selama user masih memberikan input
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int [][]matrix = new int[n][n];//buat matrix 2dimensi sebesar n
            for(int i = 0; i < matrix.length; i++){//looping untuk memasukkan value kedalam array
                for(int j = 0; j < matrix.length; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
            //memanggil masing masing method diagonal,sisi, atas,bawah, disimpan dalam variabel integer
            int diagonal = diagonal(matrix);
            int sisi = sisi(matrix);
            int atas = atas(matrix);
            int bawah = bawah(matrix);

            //bandingkan jumlah emas yang didapat dari masing masing bentuk, urutan berdasarkan prioritas
            // 1. Hanya mengambil yang berada di sepanjang diagonal ruangan
            // 2. Hanya mengambil yang berada di sepanjang sisi ruangan
            // 3. Hanya mengambil yang berada di posisi “segitiga atas” pada ruangan
            // 4. Hanya mengambil yang berada di posisi “segitiga bawah” pada ruangan

             if(diagonal > sisi && diagonal > atas && diagonal > bawah){
                System.out.println("diagonal");
            }else if(sisi > atas && sisi > bawah && sisi>diagonal){
                System.out.println("sisi");
            }else if(atas > bawah&& atas>sisi&& atas>diagonal){
                System.out.println("atas");
            }else if(bawah > diagonal&& bawah>sisi&& bawah>atas){
                System.out.println("bawah");
            }else if(diagonal == sisi || diagonal == atas|| diagonal == bawah){
                System.out.println("diagonal");
            }else if(sisi == atas || sisi == bawah){
                System.out.println("sisi");
            }else if(atas == bawah){
                System.out.println("atas");
            }
            
            

        }
        
    }
    public static int atas(int[][] matrix){ //method untuk cek seberapa banyak emas yang ada di segitiga atas, method ini mengembalikan bilangan integer
        int result = 0;
        for (int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix.length; j++){
                if(matrix[i][j] > 0){//jika elemen pada matrix i,j lebih besar dari 0 maka elemen akan ditambahkan ke result
                    result += matrix[i][j]; //tambahkan setiap elemen yang ada di segitiga atas kedalam result
                }
            }
        }
        return result;
    }
    public static int bawah(int[][] matrix){//method untuk cek seberapa banyak emas yang ada di segitiga bawah, method ini mengembalikan bilangan integer
        int result = 0;
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j <= i; j++){
                if(matrix[i][j] > 0){//jika elemen pada matrix i,j lebih besar dari 0 maka elemen akan ditambahkan ke result
                    result += matrix[i][j];//tambahkan setiap elemen yang ada di segitiga bawah kedalam result
                }
            }
        }
        return result;
    }
    public static int diagonal(int[][] matrix){//method untuk cek seberapa banyak emas yang ada di bagian diagonal matrix, method ini mengembalikan bilangan integer
        int result = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                if(i == j || i+j == matrix.length-1){//cek diagonal matrix
                    if(matrix[i][j] > 0){//jika elemen pada matrix i,j lebih besar dari 0 maka elemen akan ditambahkan ke result
                        result += matrix[i][j];//tambahkan setiap elemen yang ada di diagonal kedalam result
                        
                    }

                }
                
            }
        }
        return result;
    }
    public static int sisi(int[][] matrix){//method untuk cek seberapa banyak emas yang ada di bagian sisi matrix, method ini mengembalikan bilangan integer
        int result = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                if(i == 0||i==matrix.length-1||j==0||j==matrix.length-1){
                    if(matrix[i][j] >0){//jika elemen pada matrix i,j lebih besar dari 0 maka elemen akan ditambahkan ke result
                        result += matrix[i][j];//tambahkan setiap elemen yang ada di sisi matrix kedalam result
                    }
                }
            }
        }
        return result;
    }
    
}
