
public class Coklat {
    public static void main(String [] args){
        
        int [] dataArray = {1,2,3,4,5,6,7,8,9,10};

        int a = (dataArray.length);
        for (int i=0;i < a; i++){
            System.out.println(dataArray[i]);
        }

        // for each digunakan jika i tidak digunakan
        System.out.println("for each");
        
        for (int angka : dataArray){
            System.out.println(angka);
        }
        

    }
}
