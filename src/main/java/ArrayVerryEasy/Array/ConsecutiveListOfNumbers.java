package ArrayVerryEasy.Array;

public class ConsecutiveListOfNumbers {
    public static int addUpTo(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args){
        int n = 3;
        System.out.println(addUpTo(n));
    }
}
