package ArrayVerryEasy.Array;

public class Factorials {
    public static int factorial(int n) {
        int result = 1;
        for(int i =1; i<=n; i++){
            result *=i;
        }
        return result;
    }
    public static void main(String[] args){
        int num = 5;
        System.out.println(factorial(num));
    }
}
