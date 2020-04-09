package ArrayVerryEasy.Array;

public class MatchstickHouses {
    public static int matchHouses(int step) {
        int result = 0;
        for(int i= 1; i<=step; i++){
            if(i==0){
                return 0;
            }
            else if(i>0){
                result = (6 * i )-(i-1);
            }

        }
        return result;

    }
    public static void main(String[] args){
            int step = 1;
        System.out.println(matchHouses(step));
    }
}
