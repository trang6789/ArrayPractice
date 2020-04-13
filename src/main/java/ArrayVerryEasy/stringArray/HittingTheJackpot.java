package ArrayVerryEasy.stringArray;

public class HittingTheJackpot {
    public static boolean testJackpot(String[] result) {
        for(int i=0; i<4; i++){
            if(result[1].equals(result[0])&&result[2].equals(result[0])&&result[3].equals(result[0])){
                return true;
            }
            else
                return false;
        }
        return false;
    }

    public static void main(String[] args){
        String[] result = {"karaoke", "karaoke", "karaoke", "karaoke"};
        System.out.println(testJackpot(result));
    }
}
