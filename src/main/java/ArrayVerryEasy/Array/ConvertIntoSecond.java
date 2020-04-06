package ArrayVerryEasy.Array;

public class ConvertIntoSecond {
    public static int convert(int hours, int minutes) {
        int second = hours* 3600 + minutes*60;
        return  second;
    }
    public static void main(String[] args){
        int hours = 1;
        int min = 15;
        System.out.println(convert(hours,min));
    }

}
