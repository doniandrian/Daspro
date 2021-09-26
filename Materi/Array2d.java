public class Array2d {
    public static void main(String[] args) {
        System.out.println("...array2d......");
        int [][] dataarray = {
                {1,2,3,4},
                {5,6,7,8},
        };
        for(int i = 0; i < dataarray.length;i++){
            System.out.print("[");

            for(int j = 0; j<dataarray[i].length; j++){
                System.out.print(dataarray[i][j] + ",");
            }
            System.out.print("]\n");
        }

    }
}
