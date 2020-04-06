package ArrayVerryEasy.Array;

public class SliceOfPie {
    public static boolean equalSlices(int total, int people, int each) {
        if(people * each <= total){
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args){
        int total = 10;
        int people = 5;
        int each = 2;
        System.out.println(equalSlices(total,people,each));
    }
}
