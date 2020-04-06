package ArrayVerryEasy.Array;

public class NumberLessThanOrEqualZero {
    public static boolean lessThanOrEqualToZero(int num) {
        boolean temp =false;
        if(num <=0){
            temp = true;
        }
        return temp;
    }
    public static void main(String[] args){
        int num = 0;
        System.out.println(lessThanOrEqualToZero(num));
    }

}
