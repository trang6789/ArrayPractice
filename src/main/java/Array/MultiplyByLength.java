package Array;

public class MultiplyByLength {
    public static int[] MultiplyByLength(int[] arr){
        int temp = arr.length;
        for(int i=0; i<arr.length;i++){
            arr[i] = arr[i] * temp;
        }
        return arr;
    }
    public static  void printArray(int[] arr){
        for(int i=0; i<arr.length; i++) {
            System.out.print(" "+arr[i]+" ");
        }
    }

    public static void main(String[] args){
        int[] array = {2,4,3,1};
        int[] array_new = MultiplyByLength(array);
        System.out.println(array_new);

    }
}
