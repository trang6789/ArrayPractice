package ArrayVerryEasy.Array;

public class PerimeterOfRectangle {
    public static int findPerimeter(int height, int width){
        int perimeter = (height+width)* 2;
        return perimeter;
    }
    public static void main(String[] args){
        int height = 6;
        int width = 7;
        System.out.println(findPerimeter(height,width));
    }
}
