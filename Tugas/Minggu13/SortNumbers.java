import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = sc.nextInt();
        }
        arr = sortNum(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Ide dari algoritma ini adalah meletakan sebuah bilangan ke posisi yang tepat.
     * Karena data ingin diurutkan dari bilangan terbesar menuju bilangan terkecil,
     * berikut adalah langkah-langkahnya:
     * 1. carilah bilangan terbesar dari kumpulan bilangan yang diberikan, tukar
     * bilangan yang berada di posisi pertama dengan bilangan terbesar tersebut.
     * 2. carilah bilangan terbesar ke-2 dari kumpulan bilangan yang diberikan,
     * tukar
     * bilangan yang berada di posisi ke-2 dengan bilangan terbesar ke-2 tersebut.
     * teruskan langkah tersebut sampai semua bilangan terurut.
     */
    public static int[] sortNum(int[] arr) {
        int temp = 0; //inisialisasi variabel temp
        for (int i = 0; i < arr.length; i++) {
            int max_idx = i; //set max_idx = i untuk dibandingkan dengan array pada index i + 1
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] > arr[max_idx]){ //bandingkan mana yang lebih besar, jika arr pada index j lebih besar maka bilangan akan ditukar
                    temp = arr[max_idx]; //pindahkan arr[max_idx ]ke temp
                    arr[max_idx] = arr[j];//lalu ganti arr [max_idx] dengan arr [j]
                    arr[j] = temp;//ganti arr[j] dengan arr[max_idx]

                }
                    
            
        }
        return arr;
    }
}