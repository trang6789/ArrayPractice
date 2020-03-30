package Array;

public class ReturnRemainder {
    public static int remainder(int a, int b) {
        int temp = a % b;
        return temp;
    }

    public static void main(String[] args){
        int a = 1;
        int b = 3;
        System.out.println(remainder(1,3));
    }

}
