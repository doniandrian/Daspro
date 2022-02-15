import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class UnixTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        long unixTime = convertToUnixTime(year, month, day);
        System.out.println(unixTime);

        // Menuliskan Unix time yang "benar" ke standard error, untuk membantu Anda.
        // Hasil penulisan ini tidak akan terbaca oleh judge.
        // LocalDate adalah kelas pada Java yang memungkinkan Anda menyimpan Y-M-D.
        //LocalDate date = LocalDate.of(year, Month.of((int) month), day); //localdate dan system.err.println tidak perlu digunakan
        // System.err.println(date.toEpochDay() * 24 * 60 * 60);
    }

    /**
     * Konversi tanggal, bulan, tahun ke unix time
     * 
     * @param year  tahun, mulai dari 1970
     * @param month bulan, dari 1 s.d. 12
     * @param day   hari, dari 1 s.d. 31
     * @return unix time
     */
    private static long convertToUnixTime(int year, int month, int day) {
        long unixTime = 0; //mengubah int ke long agar dapat menampung angka yang besar
        for (int y = 1970; y < year; y++) {
            unixTime += 60 * 60 * 24 * 365;
            if (isLeapYear(y)) {
                unixTime += 60 * 60 * 24;
            }
        }
        final int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        for (int m = 1; m < month; m++) {
            unixTime += daysInMonth[m - 1] * 60 * 60 * 24;
            if (m == 2 && isLeapYear(year)) {
                unixTime += 60 * 60 * 24;
            }
        }
        unixTime += (day - 1) * 60 * 60 * 24;
        return unixTime;
    }

    /**
     * Memeriksa apakah ini tahun kabisat atau bukan
     * 
     * @param year tahun yang ingin diperiksa
     * @return true jika kabisat, false jika bukan
     */
    private static boolean isLeapYear(long year) {
        // Reference: https://en.wikipedia.org/wiki/Leap_year#Algorithm
        //cari tahun kabisat
        if (year % 4 == 0) { //jika tahun habis dibagi 4
            if (year % 100 == 0) {//jika tahun habis dibagi 100
                if (year % 400 == 0) {//jika tahun habis dibagi 400
                    return true;
                }
                else{
                    return false;
                }
            }else{
                return true;
            }

            
            
        }
        
        return false;
    }
}