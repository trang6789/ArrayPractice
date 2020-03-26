package Array;

public class WordEndings {
    public static String[] newString(String[] arr, String end) {
       for(int i=0; i<arr.length; i++){
            arr[i] += end;
           System.out.println(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args)
    {
        String end ="er";
        String[] arr_string = {"Big","Thin","Tall"};
        newString(arr_string,end);

        //for(int i=0; i<arr_string.length; i++) {
            // arr_string[i] += end;
            //System.out.println("New String is: " + arr_string[i]);
            //System.out.println(newString(arr_string, end));

        //}

    }
}
