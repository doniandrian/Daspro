import java.util.Scanner;
public class toko_kopi_dodo {



    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arrPembeli = new int[n];
        String []kondisi = new String[n];
        for(int i = 0; i < n; i++){
            kondisi[i] = sc.next();
            arrPembeli[i] = sc.nextInt();
            
        }
        int jumlahtrue = 0;
        int jumlahfalse = 0;
        for(int i = 0; i < n; i++){
            if(kondisi[i].equals("true")){
                jumlahtrue += arrPembeli[i];
            }else{
                jumlahfalse += arrPembeli[i];
            }
        }

        System.out.println(jumlahtrue);
        System.out.println(jumlahfalse);

    }
}
    

