package ArrayVerryEasy.stringArray;

public class ReverseAndCapitalize {
    public static String reverseCapitalize(String str) {
       String newString = str.toUpperCase();
       String result ="";
       for(int i = newString.length()-1; i>=0;i--){
           result += newString.charAt(i);
       }
       return result;

    }
    public static void main(String[] args)
    {
        String str = "abc";
        System.out.println(reverseCapitalize(str));
    }
}
