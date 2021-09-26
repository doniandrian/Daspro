public class quiz4uk {
    public static void main(String[] args) {
        int[] row = new int[3], col = new int[3];
        int dig = 0,  adig = 0;
        for(int i = 0; i < moves.length; i++) {
            int r = moves[i][0], c = moves[i][1];
            if(i % 2 == 1) {
                if(--row[r] == -3 || --col[c] == -3 || r == c && --dig == -3 || c + r == 2 && --adig == -3) return "B";
            } else {
                if(++row[r] == 3 || ++col[c] == 3 || r == c && ++dig == 3 || c + r == 2 && ++adig == 3) return "A";
            }
        }

        return moves.length == 9 ? "Draw" : "Pending";

    }

    }
}