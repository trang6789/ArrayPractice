package Array;

public class LessThan100 {
    public static boolean lessThan100(int a, int b){
        boolean temp = false;
        if(a+b<100){
            temp = true;
        }
        return temp;
    }
    public static void main(String[] args ){
        int a =22;
        int b= 37;
        System.out.println(lessThan100(a,b));
    }

}
