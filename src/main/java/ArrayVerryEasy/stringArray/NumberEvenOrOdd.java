package ArrayVerryEasy.stringArray;

public class NumberEvenOrOdd {
    public static String isEvenOrOdd(int num) {
        if (num % 2 ==0){
            return "even";
        }
        else
            return "odd";
    }
    public static void main(String[] args){
        int num =2;
        System.out.println(isEvenOrOdd(num));
    }
}
