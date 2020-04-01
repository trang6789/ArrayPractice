package Array;

public class MultipleByLength {
    public static int[] MultipleByLength(int[] array){
        int temp = array.length;
        for(int i =0; i<temp; i++){
            array[i] = array[i]* temp;
        }
        return array;
    }
    public static  void printArray(int[] arr){
        for(int i=0; i<arr.length; i++) {
            System.out.print(" "+arr[i]+" ");
        }
    }

    public static void main(String[] args){
        int[] array = {1,2,4,5};
        int[] arrayNew = MultipleByLength(array);
        printArray(arrayNew);
    }
}
