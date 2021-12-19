
/**
 * @author Doni Andrian
 * @version 30 november 2021
 */

import java.util.Scanner;

public class variansi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {// looping masukkan
            array[i] = sc.nextInt();
        }
        variansii(array);// keluaran

    }

    public static double hitungrata(int[] array) {// method untuk menghitung rata rata
        double total = 0;

        for (int n : array) {
            total += n;
        }
        return total / array.length;

    }

    public static void variansii(int[] array) {// method untuk menghitung variansi
        double rata = hitungrata(array);
        double jumlahselisih = 0;
        double variansi = 0;

        for (int i = 0; i < array.length; i++) {
            jumlahselisih += (array[i] - rata) * (array[i] - rata);
        }
        variansi = jumlahselisih / array.length;
        System.out.printf("%.2f", variansi);
    }

}
