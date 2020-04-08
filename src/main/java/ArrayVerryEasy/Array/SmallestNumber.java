package ArrayVerryEasy.Array;

public class SmallestNumber {
    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for(int i =1; i<args.length; i++){
            if(min>args[i]){
                min=args[i];
            }
        }
        return min;
    }

    public static void main(String[] args){
        int[] num = {34, 15, 88, 2};
        System.out.println(findSmallestInt(num));
    }
}
