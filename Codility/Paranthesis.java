public class Paranthesis {
    public static void main(String[] args) {
        String p = ")()))(())(";
        int total = 0;
        int open = 0;
        
        
     
            
            for(int i = 0; i<p.length();i++){
                if(p.charAt(i) == '('){
                    open++;
                }else{
                    if(open > 0){
                        open--;
                    }else{
                        total++;
                    }
                }
            }
    
        
        total += open;
        System.out.println(total);
    }
}



class Solution {
    public int[] solution(int[][] v) {
        int[] answer = {};
        int x = 0;
        int y = 0;
        for(int i = 0; i<2;i++){
            boolean adax = false;
            boolean aday = false;
            for(int j = 0; j<2;j++){
                if(v[i][0] == v[j+1][0]){
                    adax = true;
                }
                if(v[0][i] == v[0][j+1]){
                    adax = true;
                }

            }

            if(adax == false){
                x = v[i][0];
            }if(aday == false){
                x = v[0][i];
            }


                
            }
            
               
        }
        answer = {x,y};
       

        

        return answer;
    
}