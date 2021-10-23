/**
 * 
 * @author Doni Andrian
 * @version 22 Oktober 2021
 */

import java.util.Scanner;
public class knight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int awal = input.nextInt();
        int akhir = input.nextInt();

        int selisih = Math.abs(awal-akhir);
        
        if (selisih == 15 || selisih == 6 || selisih == 10 ){
            if (selisih == 15){
                if (awal - 16 + 1 == akhir){
                    System.out.println("arah3");

                }else if (awal - 16 - 1 == akhir){
                    System.out.println("arah2");
                }else if (awal + 16 + 1 == akhir){
                    System.out.println("arah3");

                }else if (awal + 16 - 1 == akhir){
                    System.out.println("arah7");
                }
               

            }else  if (selisih==6){
                if (awal - 1 + 8== akhir){
                    System.out.println("arah4");
                }else if(awal - 1 - 8== akhir){
                    System.out.println("arah1");
                }
            }else if(selisih == 10){
                if (awal-akhir == -10){
                    System.out.println("arah5");
                    
                }else if(awal-akhir == -17){
                    System.out.println("awah6");
                }else if(awal-akhir == -15){
                    System.out.println("arah8");
                }
            }

            }else{
                System.out.println("invalid");

            }
        }
    }
    

