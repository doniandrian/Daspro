public class Array3 {
    public static void main(String[] args) {
        String [] word = {"nama", "nami", "kelas"};
        System.out.println(ceknama(word));

        int [] nilai = { 1,2,3};
        System.out.println(ceknilai(nilai));

        
    }
    public static String ceknama(String [] nama){
        for (String kata:nama){
            if (kata.equals("name")){
                return kata;
            }

        }
        return null;
    }
    public static int ceknilai(int [] n){
        int count = 0;
        for (int angka:n){
            if (angka%2!=0){
                count++;
            }
        }
        return count;

    }
    public static String cekrata(String [] kata,int[]n){
        return null;

    }
}
