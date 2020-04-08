package ArrayVerryEasy.stringArray;

public class SmallerStringNumber {
    public static String smallerNum(String n1, String n2) {
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        if(num1<num2){
            return n1;
        }
        else
            return n2;
    }

    public static void main(String[] args){
        String n1 = "21";
        String n2 = "44";
        System.out.println(smallerNum(n1,n2));
    }

}
