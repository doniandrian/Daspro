
/**
 * Write a description of class DodoIPS here.
 *
 * @author Doni Andrian - 6201002010
 * @version 23 September 2021
 */
public class DodoIPS
{
    public static void main(String[]args){
         double t = 3;
        double u = 2;
        double v = 3;
        double w = 4;
        double x = 3;
        double y = 2;
        double z = 2;

        double nilait = 3.67;
        double nilaiu = 3.33;
        double nilaiv = 2.67;
        double nilaiw = 2;
        double nilaix = 1.67;
        double nilaiy = 1;
        double nilaiz = 0;

        double sum = (t*nilait) + (u*nilaiu) + (v*nilaiv) + (w*nilaiw) +(x*nilaix) +(y*nilaiy) +(z*nilaiz);
        double total_sks= t + u + v + w + x + y + z;
        double ips = sum/total_sks;

        System.out.println(ips);

        

        
    }
   
}
