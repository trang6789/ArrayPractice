package ArrayVerryEasy.Array;

public class CalculateDeterminantMatrix {
    public static int calcDeterminant(int[][] matrix) {
        int result = 0;
        if (matrix.length == 2) {
            result = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        }
        return result;
    }


    public static void main(String[] args) {
        int array[][] = { { 1, 2 }, { 3, 4 } };
        System.out.println(calcDeterminant(array));
    }
}
