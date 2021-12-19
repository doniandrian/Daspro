import java.util.Scanner;


public class dodo_deretan_lampu {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int lampu[] = new int[n];
        
        int operasi;
        for(int i=0; i<n; i++){
            lampu[i] = sc.nextInt();

        }
        for(int i=0; i<q; i++){
            operasi = sc.nextInt();
            if(operasi == 1){
                int p = sc.nextInt();
                lampu = aturan1(lampu,p);
                
                

            }else if(operasi == 2){
                int a = sc.nextInt();
                int b = sc.nextInt();
                lampu = aturan2(lampu,a,b);
            }else{
                lampu = aturan3(lampu);
                
            }

        }
        int count = 0;
        for(int i=0; i<n; i++){
            if(lampu[i] ==1){
                System.out.print((i+1) + " "); 
                count++;
            }
        }
        if(count==0){
            System.out.println(0);
        }
        
    }
    public static int [] aturan1(int lampu[],int p){
        int count = 1;
        if(p==1){
            
            for(int i=0; i<lampu.length; i++){
                if (count % 2 != 0){
                    lampu[i] = 1;
                }
                count++;
            }
        }else if(p==0){
            for(int i=0; i<lampu.length; i++){
                if (count % 2 != 0){
                    lampu[i] = 0;
                }
                count++;
            }

        }
        return lampu;
    }
    public static int []aturan2(int[] lampu,int i,int j){
        for(int k=i-1; k<j; k++){
            if(lampu[k]==0){
                lampu[k] = 1;
            }else{
                lampu[k] = 0;
            }


        }
        return lampu;
    }
    public static int [] aturan3(int[] lampu){
        for(int i=1; i<lampu.length-1; i++){
            if(lampu[i]<lampu[i+1] && lampu[i]<lampu[i-1]){
                lampu[i] =1;
                lampu[i-1] = 0;
                lampu[i+1] = 0;

            }
        }
        return lampu;
    }
    
}
