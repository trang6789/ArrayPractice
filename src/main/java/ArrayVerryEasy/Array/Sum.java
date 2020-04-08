package ArrayVerryEasy.Array;

public class Sum {
    public static  int sum(int n) {
        int sum = 0;
        for(int i =0; i<=n; i++){
            sum +=i;
        }
        return  sum;

    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(sum(n));
    }
}
