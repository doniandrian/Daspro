
import java.util.*;

public class BinaryGap {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String biner = Integer.toBinaryString(n);

        int totalgap = 0;

        if(biner.length() == 1){
            System.out.println(totalgap);
        }else{
            int count = 0;
            boolean  adasatu = false;
            for(int i = 0; i<biner.length(); i++){
    
                if(biner.charAt(i) == '0'){
                    count++;
                }
                else{
                    adasatu = true;
                    if(count > totalgap){
                        totalgap = count;
                    }
                    count = 0;
                }
            }


            if(adasatu == false){
                totalgap = 0;
            }
            System.out.println(totalgap);
        }


        



        

    }
    
}
