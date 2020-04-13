package ArrayVerryEasy.stringArray;

public class ReturnsCodeString {
    public static String hackerSpeak(String str) {
        String[] result = new String[str.length()];
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)=='a'){
                result[i] ="4";

            }
            if(str.charAt(i)=='e'){
                result[i] ="3";;

            }
            if(str.charAt(i)=='i'){
                result[i] ="1";;

            }
            if(str.charAt(i)=='o'){
                result[i] ="0";;

            }
            if(str.charAt(i)=='s'){
                result[i] ="5";;

            }
        }
        result = (String)
        return result;
    }

    public static void main(String[] args){
        String str = "javascript is cool";
        System.out.println(hackerSpeak(str));
    }
}
