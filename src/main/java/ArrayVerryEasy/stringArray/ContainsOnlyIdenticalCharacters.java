package ArrayVerryEasy.stringArray;

public class ContainsOnlyIdenticalCharacters {
    public static boolean isIdentical(String str) {
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) !=str.charAt(0)){
                return false;
            }
        }
        return  true;
    }

    public static void main(String[] args){
        String str = "aaan";
        System.out.println(isIdentical(str));
    }
}
