package ArrayVerryEasy.Array;

public class MakeSumEven {
    public static int minimumRemovals(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum++;

            }
        }
            if(sum %2 == 0){
                return 0;
            }
        return 1;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(minimumRemovals(arr));
    }
}
