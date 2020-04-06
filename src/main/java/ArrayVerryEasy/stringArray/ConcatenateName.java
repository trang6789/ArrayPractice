package ArrayVerryEasy.stringArray;

public class ConcatenateName {
    public static String concatName(String firstName, String lastName) {
        String fullname = lastName + ", " + firstName;
        return  fullname;
    }
    public static void main(String[] args){
        String firstName = "First";
        String lastName = "Last";
        System.out.println(concatName(firstName,lastName));
    }
}
