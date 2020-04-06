package ArrayVerryEasy.Array;

public class FliptheBoolean {
    public static boolean reverse(boolean b) {
        if(b== true){
            return false;
        }
        if(b== false){
            return  true;
        }
        return false;
    }

    public static void main(String[] args){
        boolean b = true;
        System.out.println(reverse(b));
    }
}
