import java.util.*;

public class fobinacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a = 0, b = 1,c;

        if (n<=1){
            System.out.println(n);
        }else{
            for (int i=2; i<=n; i++){
                c = a + b; 
                a = b;
                b = c;


            }System.out.println(b);
        }
        
    }
    
}
