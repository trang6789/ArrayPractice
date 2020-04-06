package ArrayVerryEasy.Array;

public class ExponentiationOperation {
    public static boolean kToK(int n, int k) {
        int pow = (int) Math.pow(k,k);
        if(pow == n){
            return  true;
        }
        else
            return false;
    }
    public static void main(String[] args){
        int n = 4;
        int k =2;
        System.out.println(kToK(n,k));
    }
}
