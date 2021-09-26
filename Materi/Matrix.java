import java.util.Scanner;


public class Matrix {
    public static void main(String[] args) {
        Scanner input_matrix = new Scanner(System.in);
        System.out.print("panjang baris matrix a: ");
        int panjang_baris_matrix_a = input_matrix.nextInt();
        System.out.print("panjang kolom matrix a: ");
        int panjang_kolom_matrix_a = input_matrix.nextInt();
        System.out.print("panjang baris matrix b: ");
        int panjang_baris_matrix_b = input_matrix.nextInt();
        System.out.print("panjang kolom matrix b: ");
        int panjang_kolom_matrix_b = input_matrix.nextInt();


        int [][] matrix_a = new int [panjang_baris_matrix_a][panjang_kolom_matrix_a];

        System.out.println("input elemen matrix a: ");
        for (int i = 0;i<panjang_baris_matrix_a;i++){
            for (int j = 0; j < panjang_kolom_matrix_a;j++){
                matrix_a [i][j] = input_matrix.nextInt();
            }
        }

        int [][] matrix_b = new int [panjang_baris_matrix_b][panjang_kolom_matrix_b];
        System.out.println("input elemen matrix b");

        for (int i = 0;i < panjang_baris_matrix_b;i++){
            for (int j = 0;j < panjang_kolom_matrix_b;j++){
                matrix_b [i][j] = input_matrix.nextInt();
            }
        }


        System.out.println("matrix a: ");
        tampilarray(matrix_a);
        System.out.println("\n");
        System.out.println("matrix b: ");
        tampilarray(matrix_b);
        System.out.println("\n");
        System.out.println("............pertambahan matrix..............");
        try{
            int baris = matrix_a.length;
            int kolom = matrix_a[0].length;
            int [][]hasil= new int[baris][kolom];
            for (int i = 0;i<baris;i++){
                for (int j = 0;j<kolom;j++){
                    hasil[i][j] = matrix_a[i][j] + matrix_b[i][j];

                }

            }tampilarray(hasil);
        }catch (Exception e){
            System.out.println("Matrix tidak bisa ditambahkan karena baris kolom tidak sama");
        }

        System.out.println("\n");
        System.out.println("............perkalian matrix...............");
        int baris_a = matrix_a.length;
        int kolom_a = matrix_a[0].length;
        int baris_b = matrix_b.length;
        int kolom_b = matrix_b[0].length;
        int [][] kali = new int [baris_a][kolom_b];
        for (int i = 0; i<baris_a;i++){
            for (int j = 0;j<kolom_b;j++){
                for (int k=0;k<kolom_a;k++){
                    kali [i][j] += matrix_a[i][k]*matrix_b[k][j];
                    tampilarray(kali);
                    System.out.println(" ");
                }
            }
        }
       // tampilarray(kali); // penampilkan hasil perkalian

    }

    public static void tampilarray(int [][] dataArray){
        int baris = dataArray.length;
        int kolom = dataArray[0].length;
        for (int[] ints : dataArray) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                System.out.print(ints[j]);
                if (j < kolom - 1) {
                    System.out.print(",");

                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }


    }
}
