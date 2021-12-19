
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class guild_war2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int guild_wombat[] = new int[n];
        int guild_dodo[] = new int[n];
        int poin = 1;
        int poin_wombat = 0;int poin_dodo = 0;
        
        while(sc.hasNext()) {
            char hasil = sc.next().charAt(0);
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (hasil == 'w') {
                guild_wombat[a-1] += 1;

            }else if(hasil == 'd') {
                guild_dodo[a-1] += 1;
            }
            // for(int g:guild_wombat){
            //     System.out.print(g + " ");
                
            // }
            // System.out.println();
            // for(int g:guild_dodo){
            //     System.out.print( g+ " ");
            // }
            
            
            
        }
        for(int i = 0; i < guild_wombat.length; i++){
                
            if(guild_wombat[i]<guild_dodo[i]){
                poin_dodo += 1;

            }else if(guild_wombat[i]>guild_dodo[i]){
                poin_wombat += 1;

            }
                
        

    }

        
        
// System.out.println(poin_dodo);
// System.out.println(poin_wombat);
    if(poin_dodo > poin_wombat){
        System.out.println("Dodo wins");
    }else if(poin_dodo<poin_wombat){
        System.out.println("Wombat wins");
    }else{
        System.out.println("Draw result");
    }
    
}
}

