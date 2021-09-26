
/**
 * Write a description of class DodoLariPagi here.
 *
 * @author Doni Andrian - 6182001020
 * @version 23 September 2021
 */
public class DodoLariPagi
{
    public static void main(String[]args){
        int detik = 12471;
        int jam = detik / 3600;
        int sisadetik = detik % 3600;
        int menit = sisadetik / 60;
        int detik2 = sisadetik % 60;
        System.out.print(jam +" " +menit +" " + detik2);
        
        
    }
}
