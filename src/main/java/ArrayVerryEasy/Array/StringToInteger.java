package ArrayVerryEasy.Array;

public class StringToInteger {
    public static int toInt(String str) {
        int num = Integer.parseInt(str);
        return num;

    }

    public static String toStr(int num) {
        String string = String.valueOf(num);
        return string;

    }

    public static void main(String[] args){
        String str = "10";
        int num = 20;
        System.out.println(toInt(str));
        System.out.println(toStr(num));
    }
}
