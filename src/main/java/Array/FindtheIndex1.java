package Array;

public class FindtheIndex1 {
    public static int search(int[] arr, int item){

        for (int i=0; i<arr.length; i++){
            if(arr[i] == item){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] array = {5,10,2,6};
        int item = 6;
        System.out.println(search(array,item));

    }
}


