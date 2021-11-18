/**
 * 
 * @author Doni Andrian
 * @version 30 oktober 2021
 * input ada 2 bilangan integer
 * hitung dodo yang didapat dengan membagi banyak batang kayu dengan promo
 * inisialisasi hasil = a
 * hasil akan terus ditambahkan dengan hasil dari a/b selama dodo+1 >=b
 * output hasil
 * 
 */

import java.util.Scanner;
public class DQDQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input ada 2 bilangan integer
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        //inisialisasi
        int dodo = a/b;//hitung dodo yang didapat dengan membagi banyak batang kayu dengan promo
        int hasil = a;//inisialisasi hasil = a
        do{
            hasil += dodo;//hasil akan terus ditambahkan dengan hasil dari dodo/b selama dodo+1 >=b
            dodo /= b;
        }while (dodo+1>=b);
        
            
        

        
        System.out.println(hasil);
        
        


    }
    
}
