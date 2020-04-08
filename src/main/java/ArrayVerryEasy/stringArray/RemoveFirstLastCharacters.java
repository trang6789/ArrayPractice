package ArrayVerryEasy.stringArray;

public class RemoveFirstLastCharacters {

    public static String removeFirstLast(String str) {
        String substring ="";
        if(str.length()>=0 && str.length()<3){
            return str;
        }
        if(str.length()>3){
            substring = str.substring(1,str.length()-1);

        }

        return substring;
    }

    public static void main(String[] args){
        String str = "hello";
        System.out.println(removeFirstLast(str));
    }
}
