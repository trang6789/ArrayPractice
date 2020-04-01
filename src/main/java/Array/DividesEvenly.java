package Array;

public class DividesEvenly {
    public static boolean dividesEvenly(int a, int b){
        boolean temp = false;
        if(a % b == 0){
            temp = true;
        }
        return  temp;
    }

    public static void main(String[] args){
        int a = 98;
        int b = 7;
        System.out.println(dividesEvenly(a,b));
    }
}
