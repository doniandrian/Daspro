
import java.util.Scanner;

/**
 * @author Doni Andrian
 * @version 11 januari 2022
 */

public class memori_otak {
    
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

    public String defrag(String kata2,char p,int n ){
        char[] temp = new char[kata2.length()];
        int count;
        String hasil = "";
        for(int i = 0; i < kata2.length(); i++){
            
            temp[i]='.';

        }
        count = 0;
        for(int i = 0; i < kata2.length(); i++){
            if(kata2.charAt(i) != '.'){
                temp[count] = kata2.charAt(i);
                count++;
            }   
        }
        for(int i = 0; i < temp.length; i++){
            
        }
        return hasil;
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
        
        
            int a = kata2.length();
            for(int i = 0; i < a; i++) {
                if((kata2.charAt(i) == '.') && a>0){
                    if(kata2.length()-a<jumlah || a == kata2.length() ){
                       // hasil = defrag(kata2);
                    }
                    
                }
            }
            int kosong ;
            return hasil;


        }
        //public String free(int n){
           // return ;
       // }

        public static void main(String[] args) {
            Scanner pembaca = new Scanner(System.in);
            String rahasia, keadaan;
            int n = 50;
            String kata_print = pembaca.next();
            String kata2;
            char p;
            String isimemori = new String ();
            keadaan = persiapkanKeadaan(n);
            System.out.println(keadaan);
            while (pembaca.hasNext()) {
                if(kata_print.equals("print")){
                    kata2 = pembaca.next();
                    isimemori = persiapkanKeadaan(n);
                    if(kata2.equals("allocate")){
                        p = pembaca.next().charAt(0);
                        int jumlah = pembaca.nextInt();
                        isimemori = keluaran(kata_print,keadaan,n);
                    }else if(kata2.equals("free")){
                        String a = pembaca.next();
                       // isimemori = free(kata2,p);
                    }else if(kata2.equals("defrag")){
                       // isimemori = defrag(kata2);
                    }
                }
                //String hasil = keluaran(kata2,keadaan,p);
                
                   // keadaan = hasil;
                    System.out.println(keadaan);
                    
                }
            }
        }
       

    

    


