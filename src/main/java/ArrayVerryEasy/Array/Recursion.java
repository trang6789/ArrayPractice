package ArrayVerryEasy.Array;

public class Recursion {
    public static int factorial(int num) {
        int target=1;
        for(int i = num; i>=1; i--){
            target *=i;


        }
        return  target;

    }
    public static void main(String[] args){
        int num=5;
        System.out.println(factorial(num));
    }
}
