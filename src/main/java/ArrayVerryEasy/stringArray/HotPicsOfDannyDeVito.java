package ArrayVerryEasy.stringArray;

public class HotPicsOfDannyDeVito {
    public static String preventDistractions(String args) {
            if(args.contains("anime")||args.contains("meme")||args.contains("vine")||args.contains("roasts")||args.contains("Danny DeVito")){
                return "NO!";
            }
            else
                return "Safe watching!";
    }
    public static void main(String[] args){
        String str = "vines that butter my eggroll";
        System.out.println(preventDistractions(str));
    }
}
