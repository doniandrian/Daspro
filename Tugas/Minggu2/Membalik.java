
/**
 * Write a description of class Membalik here.
 *
 * @author Doni Andrian - 6182001020
 * @version 23 September 2021
 */
public class Membalik
{
    public static void main(String[]args){
        int a = 6394;
        int satuan = a % 10; 
        int puluhan = ((a - satuan) % 100) / 10; 
        int ratusan = ((a - (satuan + puluhan)) % 1000) / 100;
        int ribuan = ((a - (satuan + puluhan + ratusan)) % 10000) / 1000;
        int kebalikan = (satuan * 1000) + (puluhan * 100) + (ratusan * 10) + ribuan;
        System.out.println(kebalikan);
    }
}
