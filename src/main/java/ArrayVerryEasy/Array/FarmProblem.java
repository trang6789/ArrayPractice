package ArrayVerryEasy.Array;

public class FarmProblem {
    public static int animals(int chickens, int cows, int pigs){
        int total = chickens * 2 + (cows+ pigs)*4;
        return  total;
    }

    public static void main(String[] args){
        int chickens =2;
        int cows = 3;
        int pigs = 5;
        System.out.println(animals(chickens,cows,pigs));
    }
}
