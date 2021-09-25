
import java.util.*;
public class Deret {
    public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);
        int awal,akhir,total;
        System.out.print("angka awal: ");
        awal = userinput.nextInt();
        System.out.print("angka akhir: ");
        akhir = userinput.nextInt();

        total = 0;
        while(awal <= akhir){
            total = total + awal;
            System.out.println("Nilai " + awal + " adalah " + total);
            awal++;

        }

    }
    
}
