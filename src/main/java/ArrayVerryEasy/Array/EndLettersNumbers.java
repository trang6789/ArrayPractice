package ArrayVerryEasy.Array;

public class EndLettersNumbers {
    public static String returnTheEndOfNumber(int num) {

        int last = num%10;

            if (last == 1) {
                return num + "-" + "ST";
            }
            if (last == 2) {
                return num + "-" + "ND";
            }
            if (last == 3) {
                return num + "-" + "RD";
            }
            else
                return num + "-" + "TH";

    }


    public static void main(String[] args){
        int num = 551;
        System.out.println(returnTheEndOfNumber(num));
    }
}
