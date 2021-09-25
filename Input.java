
import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Input {
    public static void main(String[] args){

        Scanner userinput= new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;

        System.out.print("panjang= ");
        panjang = userinput.nextInt();
        System.out.print("lebar = ");
        lebar = userinput.nextInt();

        luas = panjang * lebar;
        System.out.println("luas persegi adalah: " + lebar);

        System.out.println("Volume..........");    
        
        System.out.print("tinggi = ");    
        
        tinggi = userinput.nextInt();
        volume = panjang * tinggi * lebar;
        System.out.println("Volume = " + volume + " M^3");    
        



     




    }
}
