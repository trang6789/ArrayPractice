package ArrayVerryEasy.stringArray;

public class ReturnHelloAndWorld {
    public static String helloWorld(int num) {
        String result = "";
        if(num % 3 == 0){
            result = "Hello";
        }
        if(num % 5 == 0){
            result = "World";
        }
        if(num % 5 == 0 && num % 3 == 0){
            result = "Hello World";
        }
        return result;

    }
    public static void main(String[] args){
        int num = 3;
        System.out.println(helloWorld(num));
    }
}
