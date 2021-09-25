import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;


public class Main{
    public static void main(String [] args){
// print & aritmatic

        System.out.println("hello");
        int var1 = 10;
        int var2 = 20;
     
       // System.out.println("hasil x kali y adalah: " + x*y);
        int hasil = var1 * var2;
        //System.out.printf(" %d x $d = %d \n" ,var1,var2,hasil);
        System.out.printf(" $d x %d = %d \n",var1,var2,hasil);
        //modulus
        //hasil = x & y;
        //System.out.printf("%d %% $d = $d \n",x,y,hasil);
        

        //convert
        int a = 11;
        int b = 21;
        float c = (float) b / a;
        System.out.println(c);

        //asignment
        int d = 10;
        d += 20;
        System.out.println(d);

        


     
 
    }
}


