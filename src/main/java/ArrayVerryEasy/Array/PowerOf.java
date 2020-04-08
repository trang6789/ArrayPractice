package ArrayVerryEasy.Array;

public class PowerOf {
    public static int calculateExponent(int num, int exp) {
        int res = 1;
        for(int i=0; i<exp; i++){
            res *= num;
        }
        return res;

    }
    public static void main(String[] args){
        int num = 5;
        int exp = 5;
        System.out.println(calculateExponent(num,exp));
    }
}
