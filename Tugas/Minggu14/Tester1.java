
/**
 * @author Doni Andrian
 * @version 9 januari 2022
 */
import java.util.Scanner;
class Kartuundian{
    //akan ada 2 atribut untuk menyimpan nomor1 dan nomor2
    private int nomor1;
    private int nomor2;
    //constructor
    Kartuundian(int nomor1, int nomor2){
        this.nomor1 = nomor1;
        this.nomor2 = nomor2;
    }

    
    //getter
    int getnomor1(){
        return nomor1;
    }
    //getter
    int getnomor2(){
        return nomor2;
    }
}

class Undian{
    //akan ada beberapa atribut untuk menyimpan hasil,count,angka1 yang diubah ke string ,dan angka2 yang diubah ke string
    private String hasil;
    private int count = 0;
    private String angka1 = "";
    private String angka2 = "";
    //constructor
    Undian(int angka1, int angka2){
        this.angka1 = Integer.toString(angka1);
        this.angka2 = Integer.toString(angka2);

    }

    public void cek (){
        /**
         * pada method ini idenya adalah mengecek angka dari belakang 
         * angka2 yang sudah diubah ke string akan dicek mulai dari index paling belakang dengan angka1 yang sudah diubah ke string juga
         * jika angkanya sama maka count akan bertambah
         * angka sama jika hasil count nya sama dengan panjang angka2
         */
        int j = angka1.length()-1;
        //int count = 0;
        for(int i = angka2.length()-1;i>=0;i--){
            if(angka2.charAt(i)==angka1.charAt(j)){
                count++;
                
            }
            j--;
        }

        if(count==angka2.length()){
            hasil = "ya";
        }else{
            hasil = "tidak";
        }
    }
    //getter
    String gethasil(){
        return hasil;
    }
    
}


public class Tester1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        int nomor1 = sc.nextInt();
        int nomor2 = sc.nextInt();
        //buat objek
        Undian kartu = new Undian(nomor1, nomor2);
        kartu.cek();
        //output
        System.out.println(kartu.gethasil());
       
        

    }
}