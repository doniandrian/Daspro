
/**
 * 1.mencari tahu terlebih dahulu gosokan gigi ke berapa dengan membagi tube dengan gosokan
 * 2.kemudian mencari sisanya dengan menggunakan mod
 * 3.lalu sisanya ditambahkan ke pasta berikutnya
 * 4.kemudian ulangi langka 1 - 3 
 * 5.tampilkan tube baru dapat dibuka saat gosokan gigi ke berapa 
 * 6.lalu pada akhirnya ditampilkan sisa pasta nya
 *
 * @author Doni Andrian-6182001020
 * @version (24 September 2021)
 */
public class I20020
{
    public static void main(String[]args){
        int tube0 = 180;
        int tube1 = 225;
        int tube2 = 193;
        int tube3 = 201;
        int gosokan = 11;
        
        int gosokantube0 = tube0 / gosokan + 1;
        System.out.println(gosokantube0);

        int sisatube0 = tube0 % gosokan;
        int tube11 = tube1 + sisatube0;
        int gosokantube1 = tube11 / gosokan + gosokantube0;
        System.out.println(gosokantube1);

        int sisatube1 = tube11 % gosokan;
        int tube22 = tube2 + sisatube1;
        int gosokantube2 = tube22 / gosokan + gosokantube1;
        System.out.println(gosokantube2);

        int sisatube2 = tube22 % gosokan;
        int tube33 = tube3 + sisatube2;
        int gosokantube3 = tube33 / gosokan;
        int sisatube3 = tube33 % gosokan;

        
        
       
       
       
        
        System.out.println(sisatube3);
      
        
        
        
    }
}
