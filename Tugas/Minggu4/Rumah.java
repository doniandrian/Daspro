/**
 * pertama input ada 6 buah bilangan real; a,b yang merupakan titik orang kemudian xy,y1 titik paling ujung persegi panjang dan x2,y2 titik paling ujung satu lagi 
 * untuk mengetahui orang tersebut ada didalam rumah atau tidak maka titik a harus lebih besar dari x1 dan a harus lebih kecil dari x2 atau sebaliknya
 * demikian juga untuk titik b harus lebih bessar dari y1 dan lebih kecil dari y2 atau sebaliknya
 * kedua syarat tersebut dihubungkan dengan operator && dan ditambahkan operator '=' karena jika berada pas di garis tembok maka masih dianggap tidur
 * @author Doni Andrian
 * @version 9 oktober 2021
 */


import java.util.Scanner;


public class Rumah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input letak orang
        double a = input.nextDouble(); //input titik a
        double b = input.nextDouble(); // input titik b
        //input letak rumah
        double x1 = input.nextDouble(); //input titik x1
        double y1 = input.nextDouble(); //input titik y1
        double x2 = input.nextDouble(); // input titik x2
        double y2 = input.nextDouble(); //input ttik y2


        


        if (((a>=x1 && a<=x2) || (a<=x1 && a>=x2))  && ((b>=y1 && b<=y2)|| (b<=y1 && b>=y2)))  { //jika a>=x1 dan a<x2 atau sebaliknya dan b>=y1 dan b<=y2 atau sebaliknya maka didalam rumah
            System.out.println("Tidur");
        }else{
            System.out.println("Bangun"); //jika tidak maka diluar rumah
        }
        



        
        
    }
    
}
