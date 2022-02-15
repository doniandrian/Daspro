import java.util.Scanner;



class Bola{
    private double jari_jari;
    private double volume;

    Bola(double jari_jari, double volume){
        this.jari_jari = jari_jari;
        this.volume = volume;
    }

    double getjari_jari(){
        return jari_jari;
    }
    double getvolume(){
        return volume;
    }

    private void hitungvolume(){
        volume = 4/3 * 3.14*jari_jari;
    }
}

class RakBola{
    private int [] arrbola;
    private int banyakbola;
    private String hasil;
    private int temp;
    RakBola(int maks){

    }
    void addBola(){
        temp=  1;

    }
    void removeBola(){
      // hasil =  null;
        
    }
    void countBola(){

    }
    void findBola(){

    }
    void getMaxMinDiff(){

    }
    String gethasil(){
       return hasil;
    }

}





public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(); //jumlah maks bola
        int []arrbola = new int[n];
        int a = 0;
        while(n!=0){

            int operasi = sc.nextInt();
            if(operasi == 1){
                double jari_jari = sc.nextDouble();

            }else if(operasi == 2){

            }else if(operasi == 3){//hitung banyak bola
                
            }else if(operasi == 4){
                
            }else if(operasi == 5){
                
            }else if(operasi == 6){
                
            }else if(operasi == 0){
                break;
            }
        }
    }
}
