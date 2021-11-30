/**
 * @author Doni Andrian
 * @version 18 november 2021
 */
import java.util.Scanner;
public class komposit {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        //input
        int n = scanner.nextInt();
        int a,b,count,len = 1;
        
        //proses
        for (int i = 0; i < n; i++) { //looping untuk banyaknya masukkan
            a = scanner.nextInt();
            b = scanner.nextInt();
            int temp = 0;
            if (a < b){
                for (int j = a + 1 ; j<b;j++){ //melooping jarak kedua bilangan
                    count = 1;
                    
                    for(int k = 2;k<= j/2;k++){ //melooping tiap angka untuk diuji apakah angka tersebut hanya habis dibagi dirinya sendiri
                        if (j % k ==0){
                            count = 0;
                            
                            
                           
                            break;
                        }
                  
                    }
                    if (count ==1 && len == 1){ //jika output bilangan hanya ada satu maka hanya print 1 angka tanpa spasi
                        System.out.print(j);
                        temp ++;
                        len++;
                        
                    }else if(count == 1 && len > 1){ //jika output bilangan ada lebih dari satu maka ditambah dengan spasi
                        System.out.print(" " + j);
                        temp++;
                    }
            }
            if (temp == 0){ //jika tidak ada output maka outputnya adalah 0
                System.out.print('0');
            }
            System.out.println();
            len = 1;

            }else{
                for (int j = b + 1 ; j<a;j++){ //melooping jarak kedua bilangan
                    count = 1;
                    
                    for(int k = 2;k<= j/2;k++){ //melooping tiap angka untuk diuji apakah angka tersebut hanya habis dibagi dirinya sendiri
                        if (j % k ==0){
                            count = 0;
                            
                            
                           
                            break;
                        }
                  
                    }
                    if (count ==1 && len == 1){ //jika output bilangan hanya ada satu maka hanya print 1 angka tanpa spasi
                        System.out.print(j);
                        temp ++;
                        len++;
                        
                    }else if(count == 1 && len > 1){ //jika output bilangan ada lebih dari satu maka ditambah dengan spasi
                        System.out.print(" " + j);
                        temp++;
                    }
            }
            if (temp == 0){ //jika tidak ada output maka outputnya adalah 0
                System.out.print('0');
            }
            System.out.println();
            len = 1;

            }
            
        


        
        
        }
    }
}
        
    
    

