/**
 * @author Doni Andrian
 * @version 9 januari 2022
 */

import java.util.Scanner;

class Tawa{
    //buat beberapa atribut untuk menyimpan hasil, ekspresi, dan hurufvocal yang akan dipisahkan dari kata asal
    private boolean hasil = true;
    private char hasil2;
    private String ekspresi;
    private String huruflepas = "";
    Tawa(String ekspresi){//buat constructor
        this.ekspresi = ekspresi;
    }
    public void cektawa(){//method untuk mengecek apakah merupakan tawa yang bagus atau tidak
        /**
         * pada method ini idenya adalah keluarkan dahulu hurufvokal dari katanya 
         * kemudian satukan hurufvocal tersebut dalam string huruflepas 
         * setelah itu dicek apakah huruf tersebut palindrome atau tidak  
         * jika palindrome maka akan mengeluarkan result S sebaliknya maka akan mengeluarkan hasil N
         */

        char hurufhidup[] = {'a','i','u','e','o'};
        for(int i=0; i<ekspresi.length(); i++){
            for(int j = 0;j<hurufhidup.length; j++){
                if(ekspresi.charAt(i)==hurufhidup[j]){
                    huruflepas += hurufhidup[j];
                }
            }
        }

        int i = 0; 
        int j = huruflepas.length() -1;
        while (j>i){
            if(huruflepas.charAt(i)!=huruflepas.charAt(j)){
                hasil = false;
            }
            i++;
            j--;
        }
        if(hasil){
            hasil2 = 'S';
        }else{
            hasil2 = 'N';
        }
    }
    
    //getter
    char gethasil2(){
        return hasil2;
    }
}





public class Tester2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input sampai end of file
        while(sc.hasNext()) {
            String ekspresi = sc.next(); 

            Tawa tw = new Tawa(ekspresi);//buat objek 
            tw.cektawa();
            //keluaran
            System.out.println(tw.gethasil2());
    

        }
    }
}
