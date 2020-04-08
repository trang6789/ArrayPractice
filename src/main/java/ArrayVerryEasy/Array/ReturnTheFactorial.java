package ArrayVerryEasy.Array;

public class ReturnTheFactorial {
    public static int factorial(int num) {
        int result = 1;
        for(int i=1; i<=num; i++){
            result *=i;
        }
        return result;

    }
    public static void main(String[] args){
        int num = 0;
        System.out.println(factorial(num));
    }
}
