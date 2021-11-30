import java.util.Scanner;
public class test2 {
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int masukan = in.nextInt();
      int a = 1;
      
      for(a = 1 ; a<= masukan ; a++)
      {
          int banyak = in.nextInt();
          int baris = in.nextInt();
          int ganjil = 1;
          int spasi = 0;
          spasi = baris - 1;
          
        for( int i = 1; i <= baris ; i ++)
        {
            for( int j = 1 ; j <= banyak ; j++)
            {   
                ganjil = 1;
                for(i = 1; i<= baris ; i++)// baris segitiga
                    {
                        for(int m = 1 ; m <= banyak ; m++){
                            for(j = 1; j<= spasi ; j++ )//spasi segititga(kolom)
                            {
                                System.out.print(" ");
                            }
                        for(j=1 ; j<= ganjil ; j++)// kolom segitiga
                            {
                                System.out.print("@");
                            }

                        }
                        
                
                        
                        System.out.println();
                        spasi = spasi - 1;
                        ganjil = ganjil + 2;
                    }
                    
            }
            
       }
    }
}
}