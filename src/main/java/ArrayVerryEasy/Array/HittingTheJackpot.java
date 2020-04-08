package ArrayVerryEasy.Array;

public class HittingTheJackpot {
    public static boolean testJackpot(String[] result) {
        for(int i=1; i<5; i++){
            if(result[1].equals(result[0])&&result[2].equals(result[0])&&result[3].equals(result[0])&&result[4].equals(result[0])){
                return true;
            }
            else
                return false;
        }
        return false;
    }

    public static void main(String[] args){
        String[] result = {"abc", "abc", "abc", "bc"};
        System.out.println(testJackpot(result));
    }
}
