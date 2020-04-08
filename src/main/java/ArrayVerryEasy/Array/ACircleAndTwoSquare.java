package ArrayVerryEasy.Array;

public class ACircleAndTwoSquare {
    public static int squareAreasDifference(int r) {
        int d= r*2;
        int result = d*d - (d*d)/2;
        return result;
    }
    public static void main(String[] args){
        int r = 5;
        System.out.println(squareAreasDifference(r));
    }

}
