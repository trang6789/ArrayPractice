package ArrayVerryEasy.Array;

public class AdditiveInverse {
    public static int[] additiveInverse(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            arr[i] = 0-arr[i];
        }
        return arr;
    }
    public static  void printArray(int[] arr){
        for(int i=0; i<arr.length; i++) {
            System.out.print(" "+arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] array= {1,2,-3,8};
        int[] array_new = additiveInverse(array);
        printArray(array_new);

        }
}
