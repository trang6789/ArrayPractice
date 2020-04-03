package Array;

public class DivisibleByFive {
    public static boolean divisibleByFive(int num) {
        boolean temp = false;
        if(num % 5 == 0){
            temp = true;
        }
        return temp;
    }

    public static void main(String[] args){
        int num = 20;
        System.out.println(divisibleByFive(num));
    }
}
