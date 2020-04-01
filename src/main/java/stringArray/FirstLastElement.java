package stringArray;

public class FirstLastElement {
    public static String[] firstLast(String[] arr){
        String[] newString = new String[2];
        newString[0]= arr[0];
        newString[1]= arr[arr.length - 1];
        return newString;
    }
    public static  void printArray(String[] arr){
        for(int i=0; i<arr.length; i++) {
            System.out.print(" "+arr[i]+" ");
        }
    }
    public static void main(String[] args){
        String[] arr = {"one", "3","cool", "4"};
        String[] newString = firstLast(arr);
        printArray(newString);


    }
}
