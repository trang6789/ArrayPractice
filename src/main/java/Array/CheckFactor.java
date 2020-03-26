package Array;

public class CheckFactor {
    public static boolean checkFactor(int[] arr, int num){
        boolean test = true;
        for(int i= 0; i<arr.length; i++){
            int element = arr[i];
            if(num % element !=0) {
                test =  false;
            }

        }

        return test;
    }

    public static void main(String[] args){
        int[] array= {1,2,3,8};
        int num = 12;
        System.out.println(checkFactor(array,num));
    }
}
