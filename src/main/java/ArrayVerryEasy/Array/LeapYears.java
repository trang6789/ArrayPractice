package ArrayVerryEasy.Array;

public class LeapYears {
    public static boolean isLeap(int year) {
        if(year % 400==0 || year % 4==0 &&  year % 100 !=0){
            return true;
        }
        else
            return false;

    }
    public static void main(String[] args){
        int year = 2020;
        System.out.println(isLeap(year));
    }
}
