package ArrayVerryEasy.stringArray;

public class ReverseOrderOfString {
    public static String reverse(final String str) {
    String result = "";
    for(int i = str.length()-1; i>=0; i--){

        result +=str.charAt(i);
    }
    return result;

    }
    public static void main(String[] args){
        String str = "Hello World";
        System.out.println(reverse(str));
    }
}
