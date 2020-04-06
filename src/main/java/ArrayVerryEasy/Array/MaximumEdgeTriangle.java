package ArrayVerryEasy.Array;

public class MaximumEdgeTriangle {
    public static int nextEdge(int side1, int side2) {
        int max = (side1+side2)-1;
        return max;
    }
    public static void main(String[] args){
        int side1 = 8;
        int side2 =10;
        System.out.println(nextEdge(8,10));
    }
}
