package ArrayVerryEasy.Array;

public class AddUpNumbers {
    public static int addUp(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args){
        int n = 4;
        System.out.println(addUp(n));
    }
}

