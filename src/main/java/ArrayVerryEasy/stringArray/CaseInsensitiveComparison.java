package ArrayVerryEasy.stringArray;

public class CaseInsensitiveComparison {
    public static boolean match(String str1, String str2) {
        if(str1.equalsIgnoreCase(str2)){
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args){
        String str1 = "hello";
        String str2 = "heLLo";
        System.out.println(match(str1,str2));
    }
}
