package Array;

public class CointainGivenNumber {
    public static boolean check(int[] arr, int el){
        boolean temp = false;
        for (int i =0; i<arr.length; i++){
            if(arr[i]==el){
                temp = true;
            }
        }
        return temp;
    }
    public static void main(String[] args){
        int[] array= {1,3,5,8,9};
        int el = 5;
        System.out.println(check(array,el));
    }
}


