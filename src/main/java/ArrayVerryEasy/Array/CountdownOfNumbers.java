package ArrayVerryEasy.Array;

public class CountdownOfNumbers {
    public static int[] countdown(int start) {
        int[] count = new int[start+1];
        for(int i= start; i>=0; i--){
            count[i] =i;
        }
        return count;
    }
    public static  void printArray(int[] arr){
        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(" "+arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int start = 20;
        int[] count = countdown(start);
        printArray(count);
    }

}
