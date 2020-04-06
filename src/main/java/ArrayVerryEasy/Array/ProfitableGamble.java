package ArrayVerryEasy.Array;

public class ProfitableGamble {
    public static boolean profitableGamble(double prob, double prize, double pay) {
            if(prob*prize > pay){
                return  true;
            }
            else
                return false;
    }
    public static void main(String[] args){
        double prob = 0.2;
        double prize = 50;
        double pay = 9;
        System.out.println(profitableGamble(prob, prize, pay));
    }
}
