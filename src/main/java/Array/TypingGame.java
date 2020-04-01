package Array;

public class TypingGame {
    public static int[] correctStream(String[] user, String[] correct) {
        int[] temp = new int[correct.length];

        for(int i=0; i<temp.length; i++){
            if(!user[i].equals(correct[i])){
                 temp[i] = -1 ;
            }
            else {
                temp[i] = 1;
            }
        }
        return temp;
    }
    public static  void printArray(int[] arr){
        for(int i=0; i<arr.length; i++) {
            System.out.print(" "+arr[i]+" ");
        }
    }
    public static void main(String[] args){
        String[] user= {"cat", "blue", "skt", "umbrells", "paddy"};
        String[] correct = {"cat", "blue", "sky", "umbrella", "paddy"};
        int[] temp = correctStream(user,correct);
        printArray(temp);

    }
}
