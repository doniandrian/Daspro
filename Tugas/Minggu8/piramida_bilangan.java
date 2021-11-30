/**
 * @author Doni Andrian
 * @version 20 november 2021
 * 
 * 
 */
import java.util.Scanner;
public class piramida_bilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //input
        int n = sc.nextInt();//banyaknya kasus
        //deklarasi variabel
        int x,temp;
        for(int i = 0; i < n; i++) { //looping untuk melooping banyak kasus
            
            
            //input
            x = sc.nextInt(); 
            // x<5 //satuan
            // x>=5//puluhan
            // x>=8 //ratusan
            // x>=11//ribuan
            
                for(int j = 0; j <x; j++) {  //looping banyak barisnya
                    for(int k = x; j+1 < k; k--) { //untuk melooping jumlah spasinya
    
                        System.out.print("   "); //spasi 3 kali
                    }
                    temp = 1;
                    for(int l = 1;l<=j+1;l++){ //looping untuk menampilkan bagian kiri piramida
                        
                        if (temp> 10){ //jika nilai temp lebih dari 10 maka tampilkan spasi satu kali
                            System.out.print(" " + temp );
    
                        }else{
                            System.out.print("  " + temp ); //jika lebih kecil dari 10 print spasi 2 kali
    
                        }
                        
                                               
                        temp *=2; // temp akan ditambahkan dari perkalian temp * 2 sehingga semakin ke bawah nilainya akan selalu dikali dua
                    }
                    temp /= 4; //temp dibagi 4 untuk mengembalikan ke nilai sebelumnya
                    int t = 0;
                    for(int m = j ; t < m; m--) { //looping untuk menampilkan piramida bagian kanan
                        
                        if (temp> 10){
                            System.out.print(" " + temp ); //jika nilai temp lebih dari 10 maka spasi ditampilkan satu kali
    
                        }else{
                            System.out.print("  " + temp ); //jika lebih kecil dari 10 print spasi 2 kali
    
                        }
                         
                        
                         temp /= 2; // semakin ke kanan temp akan dibagi 2
                     }
                    System.out.println();//enter untuk membuat baris baru

            }
        

            }
            
        }
        
    }
    

