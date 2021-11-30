//import java.util.Arrays;
//public class Array1 {
//    public static void main(String [] args){
//
//        int [] dataArray = {1,2,3,4,5,6,7,8,9,10};
//
//
//        int a = (dataArray.length);
//        for (int i=0;i < a; i++){
//            System.out.println(dataArray[i]);
//        }
//        System.out.println("menggunakan library");
//        System.out.println(Arrays.toString(dataArray));
//        System.out.println("menggunakan for each\n");
//
//        // for each digunakan jika i tidak digunakan
//        System.out.println("for each");
//
//        for (int angka : dataArray){
//            System.out.println(angka);
//        }
//
//
//    }
//}
import java.util.Scanner;
public class Array1
{
    public static void main(String[] args)
    {
        int n, max;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {

                max = a[i];
                
            }
        }
        System.out.println("Maximum value: "+max);
    }
}

