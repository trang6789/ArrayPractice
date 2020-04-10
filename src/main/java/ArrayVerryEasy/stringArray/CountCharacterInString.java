package ArrayVerryEasy.stringArray;

public class CountCharacterInString {
    public static int charCount(char c, String str) {
        int count =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==c){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        char c = 'a';
        String str = "abc";
        System.out.println(charCount(c,str));
    }
}
