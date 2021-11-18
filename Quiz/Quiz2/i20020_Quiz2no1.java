/**
 * @author Doni Andrian
 * @version 2 november 2021
 * pertama input ada 10
 * lalu cari nilai terbesar pertama, tebesar kedua, terbesar ketiga
 * hitung nilai bobot uas dan uts 
 * hitung rata nilau tugaas dan bobotnya
 * hitung nilai akhir
 */

import java.util.Scanner;
public class i20020_Quiz2no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i = sc.nextInt(); //bobot uts
        double j = sc.nextInt(); //bobot uas
        double k = sc.nextInt(); //bobot tugas
        double uts = sc.nextInt();
        double uas = sc.nextInt();
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double d,e;
        if (sc.hasNextInt()){
             d = sc.nextInt();

        }else{
             d = 0;
        }
        if (sc.hasNextInt()){
             e = sc.nextInt();

        }else{
             e = 0;
        }
        
            
        
        
        
        
        double max,mid,min;

        
       
        if(a>b && a>c && a>d && a>e)
        {
            max = a;
        }
        else if(b>c && b>d && b>e)
        {
            max = b;
        }
        else if(c>d && c>e)

        {
            max = c;
        }
        else if(d>e)
        {
            max = d;
        }
        else
        {
            max = e;
        }

        if (max==a) a = 0;
        else if(max==b) b = 0;
        else if(max==c) c = 0;
        else if(max==d) d = 0;
        else if(max==e) e = 0;

        if(a>b && a>c && a>d && a>e)
        {
            mid = a;
        }
        else if(b>c && b>d && b>e)
        {
            mid = b;
        }
        else if(c>d && c>e)

        {
            mid = c;
        }
        else if(d>e)
        {
            mid = d;
        }
        else
        {
            mid = e;
        }
        if (mid==a) a = 0;
        else if(mid==b) b = 0;
        else if(mid==c) c = 0;
        else if(mid==d) d = 0;
        else if(mid==e) e = 0;
        if(a>b && a>c && a>d && a>e)
        {
            min = a;
        }
        else if(b>c && b>d && b>e)
        {
            min = b;
        }
        else if(c>d && c>e)

        {
            min = c;
        }
        else if(d>e)
        {
            min = d;
        }
        else
        {
            min = e;
        }

        double nilai_uts = uts * (i/100.0); //hitung bobot nilai tugas
        double nilai_uas = uas * (j/100.0); //hitung bobot nilai uas
        double rata_rata_tugas = (min + max + mid)/ 3.0; //hitung
        double rata_rata_tugas2 = rata_rata_tugas *(k/100.0); //hitung bobot nilai tugas

        double na = nilai_uts + nilai_uas + rata_rata_tugas2; //jumlahkan untuk mengetahui nilai akhir

        System.out.printf("%.2f",na);



        
    }
    
}
