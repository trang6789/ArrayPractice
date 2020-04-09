package ArrayVerryEasy.Array;

public class TotalNumberDigits {
    public static int findDigitAmount(int num) {
        int count = 0;
       if(num==0){
           count=1;
       }
       while (num!=0){
           num = num/10;
           count++;
       }
        return count;
    }
    public static void main(String[] args){
        int num = 20;
        System.out.println(findDigitAmount(num));

    }
}
