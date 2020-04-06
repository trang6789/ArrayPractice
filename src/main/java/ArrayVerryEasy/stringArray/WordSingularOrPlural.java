package ArrayVerryEasy.stringArray;

public class WordSingularOrPlural {
    public static boolean isPlural(String word) {
        if(word.endsWith("s")){
            return true;
        }
        else
            return false;

    }
    public static void main(String[] args){
        String word = "changes";
        System.out.println(isPlural(word));
    }
}
