import java.util.*;

public class faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int hasil = 1;
        for (int i = 1; i <= x;i++){
            hasil *= i;
            System.out.println(hasil);
        }
        System.out.println("memakai fungsi rekursive");

        System.out.println(faktorial(x));
    }

    public static int faktorial(int x){
        if(x == 1){
            return x;
        }
        return x * faktorial(x -1);
    }

}
