package ArrayVerryEasy.Array;

public class MultipleOf100 {
    public static boolean divisible(int num){
        if (num % 100 == 0){
            return  true;
        }
        else
            return  false;
    }

    public static void main(String[] args){
        int num = 1;
        System.out.println(divisible(num));
    }
}
