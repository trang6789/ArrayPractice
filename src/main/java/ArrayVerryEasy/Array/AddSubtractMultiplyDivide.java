package ArrayVerryEasy.Array;

public class AddSubtractMultiplyDivide {
    public static String operation(int num1, int num2) {
        if(num1 + num2 ==24){
            return "added";
        }
        if(num1 -num2 == 24){
            return "subtracted";
        }
        if(num1*num2 == 24){
            return "multiplied";
        }
        if(num1 /num2==24){
            return "divided";
        }
        else
            return "none";
    }

    public static void main(String[] args){
        int num1 = 10;
        int num2 = 14;
        System.out.println(operation(num1,num2));
    }
}
