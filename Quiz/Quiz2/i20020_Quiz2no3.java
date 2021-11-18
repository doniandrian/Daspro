/**
 * @author Doni Andrian
 * @version 2 november 2021
 * pertama input ada 2 buah bilangan bulat
 * kemudian lakukan looping selama i <= n 
 * cari dahulu hasil dari pangkatnya menggunakan method Math.pow()  
 * jika i pangkat p != n maka print i +"^" + p+" < "+n 
 * jika tidak maka print i +"^" + p+" = " +n dan hentikan looping menggunakan break
 *  
 */
import java.util.Scanner;
public class i20020_Quiz2no3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        int n = sc.nextInt();
        int p =sc.nextInt();
        sc.close();
        //proses
        for (int i = 1; i<=n;i++){
            if ((int)Math.pow(i, p) !=n){ //jika i pangkat p != n maka print i +"^" + p+" < "+n 
                System.out.println(i +"^" + p+" < "+n);
            }else{
                System.out.println(i +"^" + p+" = " +n);//jika tidak maka print i +"^" + p+" = " +n
                break; //hentikan looping menggunakan break
            }
        }





    }
    
}
