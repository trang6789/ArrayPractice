package ArrayVerryEasy.Array;

public class OddUpEvenDown {
    public static int[] transform(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                arr[i] = arr[i] + 1;

            }
            else
                arr[i] -=1;

        }
        return arr;
    }
    public static  void printArray(int[] arr){
        for(int i=0; i<arr.length; i++) {
            System.out.print(" "+arr[i]+" ");
        }
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        printArray(transform(arr));
    }
}
