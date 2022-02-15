/**
* Write a description of class TesterMatriks here.
*
* @author (Doni Andrian)
* @version (7 januari 2021)
*/
import java.util.Scanner;



public class Matriks33 {
    /**
     * Atribut ini menyimpan nilai matriks
     * yang berukuran 3x3
     */
    private long[][] elemen;

    /**
     * Constructor
     * 
     * @param elemen: elemen matriks 3x3
     */

    public Matriks33(long[][] elemen) {
        this.elemen = elemen;
    }

    /**
     * Method untuk menghitung nilai determinan dari matriks berukuran 3x3
     * 
     * @return nilai determinan dari matriks berukuran 3x3
     */
    public long determinan() {
        //TO DO: IMPLEMENTASIKAN
        long[][] arr = this.elemen;
        long x = (arr[1][1] * arr[2][2]) - (arr[2][1] * arr[1][2]);
		long y = (arr[1][0] * arr[2][2]) - (arr[2][0] * arr[1][2]);
		long z = (arr[1][0] * arr[2][1]) - (arr[2][0] * arr[1][1]);
		
        this.elemen = (arr[0][0] * x)- (arr[0][1] * y) + (arr[0][2] * z);
        return this.elemen;

    }

}
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [][]matrix = new long[3][3];
        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    matrix[i][k] = sc.nextLong();
                }
            }

        }
        Matriks33 m = new Matriks33(matrix);
        System.out.println("Determinan matriks ke-"+ (n+1) + m.determinan());
        
    }

}
