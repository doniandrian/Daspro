import java.util.*;

public class Rotation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int panjangarray = sc.nextInt();
        
        int array [] = new int[panjangarray];
        for(int i = 0; i<panjangarray; i++){
            array[i] = sc.nextInt();
        }

        int n = sc.nextInt();

        int [] solution = solution(array, n);

        for(int i = 0; i < solution.length;i++){
            System.out.print(solution[i] + " ");
        }

        

        
    }

    public static int[] solution(int[] A, int N){
        int [] res = new int [A.length];
        for(int i = 0; i<N;i++){

            int temp = A[res.length-1];
            System.out.println(temp);
            for(int j = 1; j<res.length;j++){
                
                res[j] = A[j-1];

            }
            res[0] = temp;
            A = res.clone();


            
        }

        return res;


    }
    
}
