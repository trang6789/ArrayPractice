package Array;

public class NameGreeting {
    public static String helloName(String name) {
        String helloString = "Hello " +name +"!";
        return helloString;
    }

    public static void main(String[] args){
        String name = "Ed";
        System.out.println(helloName(name));
    }
}
