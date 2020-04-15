package ArrayVerryEasy.stringArray;

public class OwofiedASentence {
    public static String owofied(String sentence) {
        String newString = new String(sentence);
        for(int i = 0; i<sentence.length(); i++){
            if(sentence.charAt(i) =='i'||sentence.charAt(i)=='e'){
                newString = sentence.replaceAll("i","wi");
                newString = newString.replaceAll("e","we");
            }
            if(i==sentence.length()-1){
                return newString + " owo";
            }
        }
        return newString;

    }

    public static void main(String[] args){
        String sentence = "I'm gonna ride 'til I can't no more";
        System.out.println(owofied(sentence));
    }
}
