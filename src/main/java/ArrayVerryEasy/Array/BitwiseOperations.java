package ArrayVerryEasy.Array;

public class BitwiseOperations {
    public static int bitwiseAND(int n1, int n2) {
        return n1 & n2;

    }

    public static int bitwiseOR(int n1, int n2) {
        return n1 | n2;
    }

    public static int bitwiseXOR(int n1, int n2) {
        return n1 ^ n2;

    }

    public static void main(String[] args){
        int n1 = 7;
        int n2 = 12;
        System.out.println(bitwiseAND(n1,n2));
        System.out.println(bitwiseOR(n1,n2));
        System.out.println(bitwiseXOR(n1,n2));
    }
}
