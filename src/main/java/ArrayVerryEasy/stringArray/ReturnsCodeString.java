package ArrayVerryEasy.stringArray;

public class ReturnsCodeString {
    public static String hackerSpeak(String str) {
        String result = new String(str);
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='s') {
                result = str.replaceAll("a", "4");
                result = result.replaceAll("e", "3");
                result = result.replaceAll("i", "1");
                result = result.replaceAll("o", "0");
                result = result.replaceAll("s", "5");
            }


        }

        return result;
    }

    public static void main(String[] args){
        String str = "javascript is cool";
        System.out.println(hackerSpeak(str));

    }
}
