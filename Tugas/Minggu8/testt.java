
import java.util.Scanner;
public class testt {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int masukan = in.nextInt();
      
      
      int a = 1;
      int spasi = 0;

      while(a <= masukan)
      {
          double k = 0.5;
          int tinggi = in.nextInt();
          spasi = tinggi - 1;
          int ganjil = 1;
          for(int i = 1; i<= tinggi ; i++)
          {
              k = 0.5 ;
              for(int j=1 ; j <= spasi ; j++)
              {
                  System.out.print("  ");
              }
              for(int j = 1 ; j <= ganjil ; j++)
              {
                  if( j<= i)
                  {
                      k = k * 2;
                  }
                  else if (j>i)
                  {
                      k = k / 2;
                  }
                  System.out.printf("%5f" , k);
              }
              System.out.println();
              ganjil = ganjil + 2;
              spasi = spasi-1;
              a++;
          }
        
    }
      
      }
    }
