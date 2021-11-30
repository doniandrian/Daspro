/**
 * @author Doni Andrian
 * @version 26 november 2021
 */
import java.util.Scanner;
public class informatika_unpar {
    /**
    * Melakukan konversi dari e-mail mahasiswa Informatika UNPAR menjadi tahun
    * angkatan mahasiswa yang bersangkutan. Aturannya adalah seperti ini
    * (pemeriksaan berhenti jika kesimpulan sudah didapat):
    * <ol>
    * <li>
    * <b>Jika 4 digit pertama adalah 2017<b>, maka angkatannya adalah 2017
    * </li>
    * <li>
    * <b>Jika 2 digit pertama adalah 73<b>, maka 2 digit berikutnya adalah
    * 2 digit terakhir tahun angkatan (rentang 1950 s.d. 2049)
    * </li>
    * <li>
    * <b>Jika 3 digit pertama adalah 618<b>, maka 2 digit berikutnya adalah
    * 2 digit terakhir tahun angkatan (rentang 1950 s.d. 2049)
    * </li>
    * <li>
    * Selain itu, kembalikan -1
    * </li>
    * </ol>
    * @param email e-mail mahasiswa yang bersangkutan
    * @return tahun angkatan
    */
    private static int getTahunAngkatan(String email) {
    // TODO implementasikan!
    // pertama inisialisasi variabel tahun,res,temp2,dan tahun2
    //kemudian temp masukan 4 angka pertama kedalam temp 
    // jika email contains 618 maka ambil 2 digit setelahnya, jika digitny lebih dari 50 maka itu angkatan 90an
    //jika digit kurang dari 50 maka itu angkatan 2000
    //lalu jika email contains 2017 langsung return 2017
    //jika email contains 73 maka tahunnya adalah 2 digit berikutnya
    //jika digitny lebih dari 50 maka itu angkatan 90an
    //jika digit kurang dari 50 maka itu angkatan 2000
    //semua string diubah menjadi integer
    //return res
        String tahun = "";
        int res = 0;
        int temp2 = 0;
        String tahun2 ="";
        String temp = email.substring(0, 4);
        if (temp.contains("618")){
            tahun2 = email.substring(3,5);
            temp2 = Integer.parseInt(tahun2);
            if (temp2 > 50){
                tahun = "19" + email.substring(3,5);
                res = Integer.parseInt(tahun);

            }else{
                tahun = "20" + email.substring(3,5);
                 res = Integer.parseInt(tahun);
            }
            

        }
        else if(temp.contains("2017")){
            tahun = "2017";
            res = Integer.parseInt(tahun);

        }else if (temp.contains("73")){
            tahun2 = email.substring(2,4);
            temp2 = Integer.parseInt(tahun2);
            if (temp2 >  50){
                tahun = "19" + email.substring(2,4);
                res = Integer.parseInt(tahun);

            }else{
                tahun = "20" + email.substring(2,4);
                 res = Integer.parseInt(tahun);
            }
            
        }
        return res;
    }
    
    public static void main(String[] args) {
    Scanner pembaca = new Scanner(System.in);
    while (pembaca.hasNext()) {
    String email = pembaca.next();
    int tahunAngkatan = getTahunAngkatan(email);
    System.out.println(tahunAngkatan == -1 ? "Tidak valid" :
    tahunAngkatan);
    }
    }
}