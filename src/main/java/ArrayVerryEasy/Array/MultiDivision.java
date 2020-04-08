package ArrayVerryEasy.Array;

public class MultiDivision {
    public static boolean abcmath(int a, int b, int c) {
        int result = 0;
        for(int i =0; i<=b; i++){
            result +=a;
            if(result % c == 0){
                return  true;
            }
            else
                return  false;
        }
        return false;
    }

    public static void main(String[] args){
        int a = 5;
        int b = 2;
        int c = 1;
        System.out.println(abcmath(a,b,c));
    }
}
