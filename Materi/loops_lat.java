import java.util.Scanner;
public class loops_lat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // String nama = input.nextLine();

        // int ln = nama.length();

        // int counter = 0;
        // for (int i = 0; i < ln; i++) {
        //     if (nama.charAt(i) == 'a' || nama.charAt(i) == 'i'||nama.charAt(i) == 'u'||nama.charAt(i) == 'e'||nama.charAt(i) == 'o'){
        //         counter++;
        //     }
           
        // }
        // System.out.println(counter);
        int bil = input.nextInt();
        int hasil = pecahan(bil);
        System.out.println(hasil);

        
    }

    public static float pecahan (int n){

        float hasil = 0;
        for (int i = 1; i <= n; i = i++){
            if (i%2 == 1){
                hasil = hasil + (4.0/(2*i-1));
            }else{
                hasil = hasil - (4.0)
            }
            hasil = hasil + (4/i);

        }return hasil;


    }
    
}
