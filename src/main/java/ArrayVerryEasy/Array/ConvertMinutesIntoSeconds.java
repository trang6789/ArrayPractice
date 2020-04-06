package ArrayVerryEasy.Array;

public class ConvertMinutesIntoSeconds {
    public static int convert(int minutes) {
        int second  = minutes*60;
        return second;
    }

    public static void main(String[] args){
        int minutes = 10;
        System.out.println(convert(minutes));
    }
}
