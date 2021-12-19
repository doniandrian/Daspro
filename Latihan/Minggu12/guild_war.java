/**
 *
 *
 * 
 */
import java.util.Scanner;
public class guild_war
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] wombatWin = new int[n+1][n+1];
        int[][] dodoWin = new int[n+1][n+1];
        int skorWombat = 0;
        int skorDodo = 0;
        char winner;
        do {
            winner = sc.next().charAt(0);
            int wombat = sc.nextInt();
            int dodo = sc.nextInt();
            if (winner == 'w'){
                wombatWin[wombat][dodo]++;
            }
            else dodoWin[wombat][dodo]++;
            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= n; j++){
                    if (wombatWin[i][j] > dodoWin[i][j]) skorWombat++;
                    else if (wombatWin[i][j] < dodoWin[i][j]) skorDodo++;
                }
            }
        } while (sc.hasNext());
        if (skorWombat > skorDodo) System.out.print("Wombat wins");
        else if (skorWombat < skorDodo) System.out.print("Dodo wins");
        else if (skorWombat == skorDodo) System.out.print("Draw result");
    }
}