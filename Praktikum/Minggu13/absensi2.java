import java.util.Scanner;

public class absensi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        String[] name = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
        }
        printAbsensi(arr, name);
    }

    public static void printAbsensi(int[] arr, String[] name) {
        String [] namaterurut = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            namaterurut[i] = name[arr[i] - 1];
            System.out.println(namaterurut[i]);
        }
    }
}