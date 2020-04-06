package Array;

public class AbsoluteSum {
    public static int getAbsSum(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                nums[i]= 0-nums[i];
            }
            sum+= nums[i];
        }
        return sum;

    }
    public static void main(String[] args){
        int[] num={2, -1, 4, 8, 10};
        System.out.println(getAbsSum(num));
    }
}
