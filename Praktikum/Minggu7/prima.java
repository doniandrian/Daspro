/**
 * @author Doni Andrian
 * @version 26 Oktober 2021
 */
import java.util.Scanner;
public class prima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input 
        int bil = input.nextInt();

        int res = 0;

        //proses
        if (bil <= 1){ //jika bil<=1
            res++;
        }
        else if (bil == 2){ //jika bil==2
            res = 0;
        }
        else if (bil>2){ //jika bil>2
            for (int i = 2;i <bil;i++){
                if (bil%i == 0){ 
                    res++;
                }
            }
    
    }
    if (res > 0){
        System.out.println("FALSE");

    }else{
        System.out.println("TRUE");
    }
    
}
}
