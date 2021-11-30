
import java.util.Scanner;
public class puncak {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //input
        int n = sc.nextInt();
        int [] array = new int [n];
        for (int i = 0; i < n; i++) {//looping input
            array[i] = sc.nextInt();

        }
        System.out.println(caripuncak(array));//keluaran

        
    }
    public static int caripuncak(int [] array) {//method untuk mencari banyaknya puncak
        int count = 0;
        for (int i = 1; i < array.length-1; i++) {
            //if (i > 0 && i < array.length - 1) {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    count++;
                }
            //}
        }
        return count;
    }
    
}
