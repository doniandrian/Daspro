
import java.util.Scanner;
public class Tile {
    private int color;
    Tile(){

    }
    void setToBlack(){
        this.color = 0;

    }
    void setToWhite(){
        this.color = 1;

    }
    char display(){
        char hasil;
        if(this.color == 0){
            hasil = 'O';
        }else{
            hasil = '.';
        }
        return hasil;
        
    }

    
}
public class BlackBoard{
    private Tile[][]tiles;
    private int vSize;
    int hsize;

    BlackBoard(int vSize,int hSize){

    }
    void touch(int x,int y){

    }
    String showboard(){

    }
    void clearboard(){

    }
    int getVSize(){

    }
    int getHSize() {

    }
}
public class Tester{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         int m = sc.nextInt();

        while (true){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x == 0&& y==0){
                break;
            }
        }
    }
    
}
