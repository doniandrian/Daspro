
/**
 * Write a description of class Permen here.
 *
 * @author Doni Andrian - 6182001020
 * @version 23 September 2021
 */
public class Permen
{
   public static void main(String[] args) {

        //no1
        int angka_pertama1 = 763;
        int angka_pertama2 = 111;
        int angka_pertama3 = 321;
        int angka_kedua1 = 987;
        int angka_kedua2 = 111;
        int angka_kedua3 = 123;

        int a1 = angka_pertama1 / 100;
        int a2 = (angka_pertama1 / 10) % 10;
        int a3 = angka_pertama1 % 10;
        int b1 = angka_kedua1 / 100;
        int b2 =(angka_kedua1 / 10) % 10;;
        int b3 = angka_kedua1 % 10;;

        int poin = (a1 * b3) + (a2 * b2) + (a3 * b1);
        System.out.println(poin);

        int a11 = angka_pertama2 / 100;
        int a22 = (angka_pertama2 / 10) % 10;
        int a33 = angka_pertama2 % 10;
        int b11 = angka_kedua2 / 100;
        int b22 =(angka_kedua2 / 10) % 10;;
        int b33 = angka_kedua2 % 10;;

        int poin2 = (a11 * b33) + (a22 * b22) + (a33 * b11);
        System.out.println(poin2);

        int a111 = angka_pertama3 / 100;
        int a222 = (angka_pertama3 / 10) % 10;
        int a333 = angka_pertama3 % 10;
        int b111 = angka_kedua3 / 100;
        int b222 =(angka_kedua3 / 10) % 10;;
        int b333 = angka_kedua3 % 10;;

        int poin3 = (a111 * b333) + (a222 * b222) + (a333 * b111);
        System.out.println(poin3);

 }
}
