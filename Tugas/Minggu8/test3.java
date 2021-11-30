public class test3 {
    public static void main(String[] args) {
    String str = "unpar";

      for (int i = 0; i <= str.length(); i++) {
         for (int start = 0; start < str.length() - i; start++) {
             for(int j = 0; j <=i + 1; j++) {
                 
                char substr = str.charAt(start+j);
                System.out.print(substr);

             }
             System.out.println();
            
         }
      }
    }
    
}
