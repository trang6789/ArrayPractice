package ArrayVerryEasy.stringArray;

public class FindIndex {
    public static int findIndex(String[] arr,String str) {
            for(int i=0; i<arr.length; i++){
                if(arr[i] == str){
                    return i;
                }
            }
            return -1;
    }
    public static void main(String[] args){
        String[] arr = {"hi", "edabit", "fgh", "abc"};
        String str = "fgh";
        System.out.println(findIndex(arr,str));
    }

}
