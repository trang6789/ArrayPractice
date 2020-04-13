package ArrayVerryEasy.stringArray;

public class OwofiedASentence {
    public static String owofied(String sentence) {
        String newString = "";
        for(int i = 0; i<sentence.length(); i++){
            if(sentence.charAt(i) =='i'){
                newString = String.valueOf(sentence.charAt(i));
                //return newString + "wi";
            }
            if(sentence.charAt(i)=='e'){
                return "we";
            }
            if(i==sentence.length()-1){
                return newString + "owo";
            }
        }
        return newString;

    }

    public static void main(String[] args){
        String sentence = "I'm gonna ride 'til I can't no more";
        System.out.println(owofied(sentence));
    }
}
