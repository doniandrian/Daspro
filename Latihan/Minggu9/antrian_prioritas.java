
import java.util.Scanner;

public class antrian_prioritas {
    /**
     * Menyiapkan sebuah array untuk digunakan sebagai antrian
     * 
     * @param kapasitas kapasitas maksimal antrian
     * @return array of integer yang dapat digunakan untuk antrian
     */
    private static int[] ciptakanAntrian(int kapasitas) {
        return new int[kapasitas];
    }

    /**
     * Menambahkan elemen integer baru ke dalam antrian. Setelah ditambahkan,
     * ukuran bertambah satu dan <strong>harus dicatat sendiri oleh Anda
     * </strong> karena tidak ditangani oleh method ini.
     * Contoh, jika antrian berisi himpunan {4, 2, 6, 1}, ukuran berisi 4, dan
     * elemen bernilai 3, maka antrian akan berisi himpunan {4, 2, 6, 1, 3} dan
     * Anda harus mengubah sendiri variabel ukuran menjadi 5.
     * 
     * @param ukuran  ukuran antrian saat ini
     * @param antrian array of integer yang berisi antrian
     * @param elemen  elemen yang akan ditambahkan
     */
    private static void tambahkanKeAntrian(int ukuran, int[] antrian, int elemen) {
        antrian[ukuran] = elemen;
        for (int posisi = ukuran; posisi > 0; posisi = (posisi - 1) / 2) {
            if (antrian[posisi] > antrian[(posisi - 1) / 2]) {
                int temp = antrian[posisi];
                antrian[posisi] = antrian[(posisi - 1) / 2];
                antrian[(posisi - 1) / 2] = temp;
            } else {
                break;
            }
        }
    }

    /**
     * Mengambil elemen terbesar dari antrian, dan mengembalikan hasilnya.
     * Setelah diambil, ukuran berkurang satu dan <strong>harus dicatat sendiri
     * oleh Anda</strong> karena tidak ditangani oleh method ini.
     * Contoh, jika antrian berisi himpunan {4, 2, 6, 1, 3}, ukuran berisi 5,
     * maka setelah dipanggil method ini mengembalikan 6, antrian berisi
     * himpunan {4, 2, 1, 3}, dan Anda harus mengubah sendiri variabel
     * <code>ukuran</code> menjadi 4.
     * 
     * @param ukuran  ukuran antrian saat ini
     * @param antrian array of integer yang berisi antrian
     * @return elemen terbesar yang diambil
     */
    private static int ambilElemenTerbesar(int ukuran, int[] antrian) {
        int elemen = antrian[0];
        antrian[0] = antrian[--ukuran];
        int posisi = 0;
        do {
            int indeksKiri = posisi * 2 + 1;
            int indeksKanan = posisi * 2 + 2;
            int indeksTerbesar = posisi;
            if (indeksKiri < ukuran && antrian[indeksKiri] > antrian[indeksTerbesar]) {
                indeksTerbesar = indeksKiri;
            }
            if (indeksKanan < ukuran && antrian[indeksKanan] > antrian[indeksTerbesar]) {
                indeksTerbesar = indeksKanan;
            }
            if (indeksTerbesar != posisi) {
                int temp = antrian[posisi];
                antrian[posisi] = antrian[indeksTerbesar];
                antrian[indeksTerbesar] = temp;
                posisi = indeksTerbesar;
            } else {
                break;
            }
        } while (posisi < ukuran);
        return elemen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = ciptakanAntrian(1);
        int i = 0;
        while (sc.hasNextInt()) { // looping untuk menambahkan elemen ke antrian
            input[i] = sc.nextInt();
            i++;

        }

        // System.out.println(ambilElemenTerbesar(tambahkanKeAntrian(n)));

    }

}
