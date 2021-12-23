import java.util.Scanner;

public class NilaiLatihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nMhs = sc.nextInt();
        int[][] arr = new int[nMhs][5];
        for (int i = 0; i < nMhs; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] arr100 = count100(arr);
        int res = getMhsLomba(arr100);
      
        if (res == 0)
            System.out.println(-1);
        else
            System.out.println(res);
    }

    public static int[] count100(int[][] arr) {
        int count = 0;
        int[] res = new int[arr.length];
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 100)
                    count += 1;
            }
            res[i] = count;
            count = 0;
        }
        return res;
    }

    public static int getMhsLomba(int[] nilai100) {
        int max = 0;
        int idx = -1;
        for (int i = 0; i < nilai100.length; i++) {
            if (nilai100[i] > max) {
                max = nilai100[i];
                idx = i;
            }
        }
        return idx + 1;
    }
}
