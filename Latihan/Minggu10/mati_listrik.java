/**
 * @author Doni Andrian
 * @version 2 december 2021
 */
import java.util.Scanner;
public class mati_listrik {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();//banyaknya alat
        int m = sc.nextInt();//banyaknya operasi
        int c = sc.nextInt();//kapasitas maks

        int []operasi = new int[m];
        int []dayaalat = new int[n];

        for(int i = 0; i < n; i++){
            dayaalat[i] = sc.nextInt();//looping untuk memasukkan daya alat ke array
        }
        for(int i = 0; i < m; i++){
            operasi[i] = sc.nextInt();//loooping untuk memasukkan operasi ke array
        }
        ceklistrik(dayaalat, operasi, c);//panggil method
    }
    public static void ceklistrik(int dayaalat[],int banyakoperasi[],int c){//method untuk mengecek daya apakah lebih atau kurang
        //inisialisasi
        int total = 0;
        int max = 0;
        
        int count = 0;
        
        int [] arr = new int [banyakoperasi.length];//buat arr untuk menampung operasi

        for(int i = 0; i < banyakoperasi.length; i++){
            count = 0;
            
           
            for(int array:arr){
                if(array == banyakoperasi[i]){
                    
                    count++;

                    
                }
            }
            
            if(count == 0 || count % 2==0){
                total +=  dayaalat[banyakoperasi[i]-1];
                arr[i] = banyakoperasi[i];//simpan operasi ke array
                if(total > max){//cari nilai terbesar
                    max = total;
                }

            }else if(count%2!=0){
               
                total -=  dayaalat[banyakoperasi[i]-1];
                arr[i] = banyakoperasi[i];//simpan operasi ke array
                if (total > max){//cari nilai terbesar
                    max = total;
                }

            }else{
                total -=  dayaalat[banyakoperasi[i]-1];
                arr[i] = banyakoperasi[i];//simpan operasi ke array
                if (total > max){//cari nilai terbesar
                    max = total;
                }

            }
            
           
           
           
            

        }
        if(max > c){
            System.out.println("Mati Listrik");
        }else{
            System.out.println(max);
        }
    }
    
}
