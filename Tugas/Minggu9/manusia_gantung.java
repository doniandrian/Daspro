
import java.util.Scanner;

/**
 * @author Doni Andrian
 * @version 27 november 2021
 */

public class manusia_gantung {
    /**
     * Menyiapkan keadaan (state) dari permainan. Caranya adalah dengan membuat
     * String dengan panjang yang sama dengan parameter rahasia, namun semuanya
     * diisi dengan karakter "-". Contohnya, jika rahasia berisi "daspro", maka
     * method ini mengembalikan "______".
     *
     * @param rahasia kata rahasia
     * @return String berisi "_" dengan panjang yang sama dengan parameter
     */
    public static String persiapkanKeadaan(String rahasia) {
        // TODO implementasikan!
        /**
         * method ini digunakan untuk mengembalikan "_" sebanyak panjang kata rahasia
         * variabel res digunakan untuk menampung "_"
         * looping digunakan untuk menambahkan "_" sebanyak panjang kata rahasianya
         * return res
         */
        String res = "";
        int panjang_kata = rahasia.length();
        for (int i = 0; i < panjang_kata; i++) {
            res += "_";
        }
        return res;

    }

    /**
     * Memeriksa tebakan terhadap rahasia dan keadaan saat ini. Ada tiga jenis
     * kemungkinan yang bisa terjadi:
     * <ol>
     * <li><b>Huruf yang ditebak tidak ada di kata rahasia</b>, maka kembalikan
     * String "tidak-ditemukan". Contoh, jika rahasia berisi "daspro" dan tebakan
     * berisi 'z', maka kembalian adalah "tidak-ditemukan", tidak peduli apa isi
     * dari keadaan.</li>
     * <li><b>Huruf sudah pernah ditebak sebelumnya</b>, maka kembalikan String
     * "sudah-pernah". Contoh, jika rahasia berisi "daspro", keadaan berisi
     * "_asp_o", dan tebakan berisi 's', maka kembalian adalah "sudah-pernah".</li>
     * <li><b>Tebakan membuka huruf baru</b>, maka kembalian adalah keadaan, dengan
     * seluruh huruf '_' digantikan dengan tebakan. Contoh, jika rahasia berisi
     * "daspro", keadaan berisi "_asp_o", dan tebakan berisi 'r', maka kembalian
     * adalah "_aspro".</li>
     * </ol>
     * 
     * @param rahasia kata rahasia yang perlu ditebak
     * @param keadaan keadaan saat ini (huruf-huruf yang sudah terbuka)
     * @param tebakan huruf yang ditebak pada giliran ini
     * @return String sesuai aturan di atas
     */
    public static String tebak(String rahasia, String keadaan, char tebakan) {
        // TODO implementasikan!
        /**
         * akan ada 4 buah variabel
         * variabel string hasil akan digunakan untuk menampung kata
         * variabel temp dan temp2 digunakan untuk menampung boolean
         * variabel underscore untuk menampung kata  dari parameter keadaan
         * akan ada 3 looping
         * looping pertama digunakan untuk memeriksa jika huruf yang ditebak sudah pernah ditebak sebelumnya akan mengembalikan true jika sudah pernah jika true maka akan mereturn hasil "sudah-pernah"
         * looping kedua digunakan untuk memeriksa apakah huruf yang ditebak ada di dalam kata rahasia akan mengembalikan true jika benar jika false akan mereturn hasil "tidak-ditemukan"
         * looping ketiga digunakan untuk menampilkan huruf yang berhasil ditebak dengan mengganti "_" menjadi huruf yang berhasil ditebak pada index i tertentu
         * method ini akan mengembalikan hasil yang akan dipanggil di main method
         */
        //inisialisasi
        String hasil = "";
        boolean temp = false;
        boolean temp2 = false;
        //deklarasi
        String underscore;

        underscore = keadaan;
        //proses
        for (int i = 0; i < rahasia.length(); i++) { //looping pertama
            if (tebakan == rahasia.charAt(i)) {
                temp = true;

            }
        }
        for (int j = 0; j < rahasia.length(); j++) {//looping kedua
            if (tebakan == underscore.charAt(j)) {
                temp2 = true;
            }
        }
        if (temp2 == true) {
            hasil = "sudah-pernah";
        } else if (temp == false) {
            hasil = "tidak-ditemukan";

        } else {
            for (int i = 0; i < rahasia.length(); i++) {//looping ketiga

                if (tebakan == rahasia.charAt(i)) {
                   
                    hasil += rahasia.charAt(i);

                } else {
                    hasil += underscore.charAt(i);
                }

            }

        }
        return hasil;

    }

    public static void main(String[] args) {
        Scanner pembaca = new Scanner(System.in);
        String rahasia, keadaan;

        rahasia = pembaca.next();
        keadaan = persiapkanKeadaan(rahasia);
        System.out.println(keadaan);
        while (pembaca.hasNext()) {
            String tebakanString = pembaca.next();
            char tebakan = tebakanString.charAt(0);
            String hasil = tebak(rahasia, keadaan, tebakan);
            switch (hasil) {
            case "sudah-pernah":
                System.out.printf("'%s' sudah pernah ditebak.%n", tebakan);
                break;
            case "tidak-ditemukan":
                System.out.printf("Kata rahasia tidak mengandung '%s'.%n", tebakan);
                break;
            default:
                keadaan = hasil;
                System.out.println(keadaan);
                if (keadaan.equals(rahasia)) {
                    return;
                }
            }
        }
    }
}
