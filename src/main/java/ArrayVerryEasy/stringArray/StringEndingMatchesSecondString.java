package ArrayVerryEasy.stringArray;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class StringEndingMatchesSecondString {
    public static boolean checkEnding(String str1, String str2) {

        if(str1.endsWith(str2)){
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args){
        String str1 = "abc";
        String str2 = "bc";
        System.out.println(checkEnding(str1,str2));


    }
}
