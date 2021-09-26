public class dadu {
    public static void main(String[] args) {
        int dadu1 = 6;
        int dadu2 = 6;
        int semesta = (dadu1*dadu2);


        int [] dadu1arr = new int [dadu1];
        int [] dadu2arr = new int [dadu2];

        for (int i=1; i<=dadu1;i++){
            int j = i;
            for (int a=0; a<dadu1;a++){
                dadu1arr[a]=j;

           }




        }
        for (int i=0;i<dadu1;i++){
            System.out.println(dadu1arr[i]);
        }

       // int dadu2arr[] = {1,2,3,4,5,6};


}
}