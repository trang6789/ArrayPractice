package ArrayVerryEasy.stringArray;

public class CheckStringForSpaces {
    public static boolean hasSpaces(String str) {
        if(str.contains(" ")){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        String str = "hello ";
        System.out.println(hasSpaces(str));
    }
}
