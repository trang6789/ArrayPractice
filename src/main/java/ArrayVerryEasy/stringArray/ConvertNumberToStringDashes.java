package ArrayVerryEasy.stringArray;

public class ConvertNumberToStringDashes {
    public static String Go(int num) {
        String myDash = "";
        for(int i= 1; i<=num; i++){
            myDash = myDash+"-";
        }
        return myDash;
    }
    public static void main(String[] args){
        int num = 2;
        System.out.println(Go(num));
    }
}
