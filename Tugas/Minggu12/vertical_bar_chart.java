/**
 * @author Doni Andrian
 * @version 20 dec 2021
 */
import java.util.Scanner;
public class vertical_bar_chart {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //input
        int n = sc.nextInt();
        //buat 2 array untuk menampung nama angket dan jumlah vote nya
        String [] kata = new String[n];
        int [] jumlah = new int[n];
        for(int i = 0; i < n; i++){//looping untuk menampung value ke array
            kata[i] = sc.next();
            jumlah[i] = sc.nextInt();
        }
        tampil1(n, kata, jumlah);
        System.out.println();
        tampilkata(n,kata);
        
    }
    public static int max(int jumlah[]){//method untuk mencaari nilai terbesar dari vote
        int max = 0;
        for(int i = 0; i < jumlah.length; i++){
            if(max<jumlah[i]){
                max = jumlah[i];
            }
        }
        return max;
    }
    public static int lebih (int jumlah[]){//method untuk mencari tambahan panjang chartnya yang digunakan untuk menaruh angka diatas chartnya
        int kelebihan = 0;
        int max = max(jumlah);
        while (max!=0){
            max/=10;
            kelebihan++;

        }
        return kelebihan+1;
        
    }
    public static void tampil1(int n, String []kata,int []jumlah){//method untuk menampilkan bar chart nya secara vertikal beserta angka votenya
        int max = max(jumlah);
        int kelebihan = lebih(jumlah);

      
        
        
        for(int i = max+kelebihan; i >0; i--){
            

            for(int j = 0; j< jumlah.length; j++){
                int angka1 = 0;
                int angka2 = 0;
                
                if(jumlah[j]>=i){
                    System.out.print("# ");

                }
                
                else if(jumlah[j] == i-3){
                    if(jumlah[j] > 9){
                        angka1 = jumlah[j]/10;
                        angka2 = jumlah[j]%10; 
                        System.out.print(angka1 + " ");
                        
                    }else{
                        System.out.print ("  ");
                        
                    }
                    
                   
                }else if(jumlah[j] == i-2){
                    if(jumlah[j] > 9){
                        angka1 = jumlah[j]/10;
                        angka2 = jumlah[j]%10; 
                        System.out.print(angka2 + " ");
                        
                    }else if(jumlah[j]<=9){
                        System.out.print(jumlah[j] + " ");
                        
                    }else{
                        System.out.print("  ");
                    }
                    

                

                }
                else{
                    
                    System.out.print("  ");
                    
                }
               
                
            }
            
            System.out.println();
        }
        
    }
    public static void tampilkata(int n,String []kata){//method untuk menampikan  nama pilihan di bawah bar secara vertikal
        for(int i=0;i<maxvalue(kata);i++){
            for(int j=0;j<kata.length;j++){
                if(i<kata[j].length()){
                    System.out.print(kata[j].charAt(i) + " ");
                    
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static int maxvalue(String[] kata){//cari kata yang terpanjang dari nama nama barnya
         int max = kata[0].length();

        for(int i=1;i<kata.length;i++){
            if(max<kata[i].length()){
                max = kata[i].length();

            }
        }
        return max;
    }
    
    
}
