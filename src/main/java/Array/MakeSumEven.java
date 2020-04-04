package Array;

public class MakeSumEven {
    public static int minimumRemovals(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++){
             if(sum % 2 == 1){
                 sum++;
                return 0;
            }
            if(sum %2 == 0){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args){
        int[] arr = {5, 7, 9, 11};
        System.out.println(minimumRemovals(arr));
    }
}
