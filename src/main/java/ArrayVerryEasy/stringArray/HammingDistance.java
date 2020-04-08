package ArrayVerryEasy.stringArray;

public class HammingDistance {
    public static int hammingDistance(String str1, String str2) {
        int count = 0;
        for(int i =0; i<str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        String str1 = "abcde";
        String str2 = "bcdef";
        System.out.println(hammingDistance(str1,str2));
    }
}
