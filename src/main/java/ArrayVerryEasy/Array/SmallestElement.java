package ArrayVerryEasy.Array;

public class SmallestElement {
    public static int nthSmallest(int[] arr, int n) {
        //find the min of array
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //find nth smallest element
        for(int m=0; m<arr.length; m++){
            if(n==1){
                return arr[0];
            }
            if(n==m){
                return arr[m-1];
            }
            if(m==arr.length -1){
                return arr[arr.length -1];
            }
            if(n>arr.length) {
                return -1;
            }
        }
        return -1;
    }


    public static void main(String[] args){
        int[] arr = {1, 3, 5, 7};
        int n = 4;
        System.out.println(nthSmallest(arr,n));
    }

}
