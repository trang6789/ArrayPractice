package Array;

public class AreaOfTriangle {
    public static int countAreaTriangle(int height, int base){
        int area = 0;
        area = (height * base)/2;
        return area;
    }

    public static void main(String[] args){
        int height = 3;
        int base = 2;
        System.out.println(countAreaTriangle(height,base));
    }
}
