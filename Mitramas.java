// public class Mitramas {
//     public static void main(String[] args) {

//         // int total = 0;
//         // for (int i=1; i<=5; i++){
//         // if(i%2 == 0){
//         // total += 10;
//         // }else{
//         // total -= 5;
//         // }
//         // }

//         // System.out.println("Total: " + total);

//         // int a = 2, b = 5, c=7;
//         // for(;;){
//         // if(a>2*b){
//         // break;
//         // }

//         // a+=(c-b);
//         // b--;
//         // c++;
//         // }
//         // System.out.println(c-a);

//         // char [] ch = {'Z', 'X', 'C'};
//         // char tmp;
//         // for(int i = 0; i<5;i++){
//         // tmp = ch[0];
//         // ch[0] = ch[2];
//         // ch[1] = tmp;
//         // ch[2] = ch[1];
//         // }

//         // System.out.println(ch);

//         // int[] amount = {0,0,0,0,0,0,0,0,0,0};
//         // int [] numbers = {1,2,3,4,2,9,3};
//         // for(int i = 0; i<numbers.length; i++){
//         // amount[numbers[i]]++;
//         // }
//         // System.out.println("Jumlah angka 1: " + amount[1]);

//     }
// }

class Pesawat {
    private int kecepatan, panjang;

    public Pesawat(int kecepatan, int panjang) {
        this.kecepatan = kecepatan;
        this.panjang = panjang;
    }

    public int jarak(int detik) {
        return detik * this.kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void panjang() {
        System.out.println(this.panjang);
    }
}

public class Mitramas {
    public static void main(String[] args) {
        Pesawat boeing = new Pesawat(500, 100);
        boeing.setKecepatan(100);
        System.out.println(boeing.jarak(5));
    }
}

// sum(POPULATION) from CITY join COUNTRY on COUNTRY.CODE = CITY.COUNTRYCODE