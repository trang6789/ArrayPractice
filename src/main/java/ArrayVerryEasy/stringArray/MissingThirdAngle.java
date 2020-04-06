package ArrayVerryEasy.stringArray;

public class MissingThirdAngle {
    public static String missingAngle(int angle1, int angle2) {
        int angle3 = 180-(angle1+angle2);
        if(angle3 <90){
            return "acute";
        }

        if(angle3 > 90 && angle1<180){
            return "obtuse";
        }
        else
            return "right";

    }
    public static void main(String[] args)
    {
        int angle1 = 27;
        int angle2 = 59;
        System.out.println(missingAngle(angle1, angle2));
    }
}
