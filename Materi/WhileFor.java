public class WhileFor {
    public static void main(String[] args){
        int x = 10;
        boolean kondisi = true;
        while (kondisi){
            System.out.println("nomor ke" + x);
            x++;
            if (x == 100){
                kondisi = false;
            }

        }
        

        //For
        System.out.println(".................For looping............");
        for(int y = 10; y <=100; y++){
            System.out.println("nomor ke " + y);
        }



    }
}
