package ArrayVerryEasy.stringArray;

public class CountSyllables {
    public static int numberSyllables(String word) {
        int count = 0;
        String[] parts = word.split("-");
        for(int i=0; i<parts.length; i++) {
            count++;
        }
        return count;

    }
    public static void main(String[] args){
        String word = "buf-fet";
        System.out.println(numberSyllables(word));
    }
}
