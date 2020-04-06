package ArrayVerryEasy.Array;

public class SumOfCubes {
    public static int sumOfCubes(int[] nums) {

        int total = 1;
        int sum = 0;
        for(int i=0; i<nums.length; i++){

            total = (nums[i]*nums[i]*nums[i]);
            sum += total;
        }
        return sum;
    }

    public static void main(String[] args){
        int[] array = {1,2,1};
        System.out.println(sumOfCubes(array));
    }
}
