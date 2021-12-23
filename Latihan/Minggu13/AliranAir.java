import java.util.Scanner;

public class AliranAir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int total = 0;
        int start, i;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        start = sc.nextInt();
        total = countAliranAir(arr, start);
        System.out.println(total);
    }

    public static int countAliranAir(int[] arr, int start) {
        int i, tempTinggi, total = 0;
        // cek kiri
        i = start - 1;
        tempTinggi = arr[start - 1];
        while (i >= 0) {
            if (arr[i] <= tempTinggi) {
                total += 1;
                tempTinggi = arr[i];
               
            }else break;
            
            
            i--;
        }
        // cek kanan
        i = start;
        tempTinggi = arr[start - 1];
        while (i < arr.length) {
            if (arr[i] <= tempTinggi) {
                total += 1;
                tempTinggi = arr[i];

            }else break;
            
            i++;
        }
        return total;
    }
}