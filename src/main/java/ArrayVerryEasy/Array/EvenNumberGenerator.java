package ArrayVerryEasy.Array;

import java.lang.reflect.Array;

public class EvenNumberGenerator {
    public static int[] findEvenNums(int num) {
        int lenght =0;
        for(int i=1; i<= num; i++){
            if(i%2==0){
                lenght++;

            }
        }
        int[] number = new int[lenght];
        int j =0;
        for(int i=1; i<= num; i++){
            if(i%2==0){
                number[j] =i;
                j++;
            }
        }

        return number;
    }
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++) {
            System.out.print(" "+arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int num = 8;
        int[] result = findEvenNums(num);
        printArray(result);
    }
}
