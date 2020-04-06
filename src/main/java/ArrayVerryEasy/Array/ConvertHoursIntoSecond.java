package ArrayVerryEasy.Array;

public class ConvertHoursIntoSecond {
    public static int howManySecond(int hours){
        int second = hours*3600;
        return second;
    }
    public static void main(String[] args){
        int hours = 2;
        System.out.println(howManySecond(hours));
    }
}
