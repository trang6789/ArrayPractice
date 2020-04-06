package ArrayVerryEasy.Array;

import java.util.Arrays;

public class HurdelJump {
    public static boolean hurdleJump(int[] hurdles, int h) {
        boolean temp = false;
        for(int i=0; i<hurdles.length; i++){
            if(hurdles[i]>h) {
                temp = false;
            }
            if(hurdles[i]<=h){
                temp = true;
            }
        }
        if(hurdles.length == 0){
            temp = true;
        }
        return temp;
    }

    public static void main(String[] args){
        int[] hurdles = {};
        int height = 6;
        Arrays.sort(hurdles);
        System.out.println(hurdleJump(hurdles,height));
    }
}
