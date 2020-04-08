package ArrayVerryEasy.Array;

public class EvenNumbers {
    public static int sumEvenNumsInRange(int start, int stop) {
        int sum =0;
        for(int i = start; i<= stop; i++){
            if(i%2 ==0){
                sum +=i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int start =10;
        int stop =20;
        System.out.println(sumEvenNumsInRange(start,stop));
    }
}
