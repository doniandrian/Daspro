import java.util.Scanner;
public class Tempat_duduk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String murid[] = new String[n];

        for(int i = 0; i < n ;i++){
            murid[i] = sc.next();

        }   

        int rotasi = sc.nextInt();
        for(int i = 0; i<rotasi/2;i++){
            String temp = murid[i];
            murid[i] = murid[rotasi-i-1];
            murid[rotasi-i-1] = temp;


        }

        for (String string : murid) {
            System.out.println(string);
        }



    }
}
