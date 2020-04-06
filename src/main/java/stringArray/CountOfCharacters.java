package stringArray;

public class CountOfCharacters {
    public static boolean comp(String str1, String str2) {
        if(str1.length()==str2.length()){
            return true;
        }
        if(str1.length() != str2.length()){
            return false;
        }
        return false;
    }

    public static void main(String[] args){
        String str1="AC";
        String str2 = "BD";
        System.out.println(comp(str1,str2));
    }
}
