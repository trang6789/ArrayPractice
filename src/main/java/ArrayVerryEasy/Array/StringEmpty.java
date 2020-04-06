package ArrayVerryEasy.Array;

public class StringEmpty {
    public static boolean isEmpty(String str) {
        if(str.length() == 0){
            return true;
        }
        if(str.length() != 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        String str = "";
        System.out.println(isEmpty(str));
    }
}
