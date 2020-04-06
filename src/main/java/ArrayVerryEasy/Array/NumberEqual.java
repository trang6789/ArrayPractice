package ArrayVerryEasy.Array;

public class NumberEqual {
    public static boolean numberEqual(int a, int b){
        boolean temp = false;
        if(a==b){
            temp = true;
        }
        return temp;
    }
    public static void main(String[] args){
        int a= 1 ;
        int b = 1;
        System.out.println(numberEqual(a,b));
    }
}
