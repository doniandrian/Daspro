
import java.util.Scanner;

/**
 * @author Doni Andrian
 * @version 8 december 2021
 */

public class i20020_quiz2no2 {
    
    public static String persiapkanKeadaan(int n) {
        // TODO implementasikan!
        /**
         * method ini digunakan untuk mengembalikan "." sebanyak 50
         * variabel res digunakan untuk menampung "."
         * looping digunakan untuk menambahkan "." sebanyak 50
         * return res
         */
        String res = "";
        
        for (int i = 0; i < n; i++) {
            res += ".";
        }
        return res;

    }

    
    public static String keluaran(String kata2,String keadaan, int jumlah) {
        
        //inisialisasi
        String hasil = "";
        boolean temp = false;
        boolean temp2 = false;
        //deklarasi
        String titik;

        titik = keadaan;
        //proses
        

       
            for (int i = 0; i < jumlah; i++) {

                if(kata2.equals("allocate")){
                    hasil += "a";

                }else{
                    hasil += keadaan;
                }

            }
            return hasil;

        }
        public static void main(String[] args) {
            Scanner pembaca = new Scanner(System.in);
            String rahasia, keadaan;
            int n = 50;
            String kata_print = pembaca.next();
            
    
            
            keadaan = persiapkanKeadaan(n);
            System.out.println(keadaan);
            while (pembaca.hasNext()) {
                if(kata_print.equals("print")){
                    String kata2 = pembaca.next();
                    if(kata2.equals("allocate")){
                        String p = pembaca.next();
                        int jumlah = pembaca.nextInt();
                    }else if(kata2.equals("free")){
                        String a = pembaca.next();
                    }
                }
                String hasil = keluaran(kata2,keadaan,p);
                
                    keadaan = hasil;
                    System.out.println(keadaan);
                    
                }
            }
        }
       

    

    


