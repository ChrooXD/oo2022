package isikukood;

// 06_liides -> parem klõps new package
// game
// isikukood
// isikukood -> parem klõps
public class IsikukoodMain {
    public static void main(String[] args) {
        IsikukoodEE ee = new IsikukoodEE("39412431256");
        System.out.println(ee.isMale());
        System.out.println(ee.getBirthYear());
        System.out.println(ee.getBirthMonth());

        IsikukoodEE ee2 = new IsikukoodEE("60234253523");
        System.out.println(ee2.isMale());
        System.out.println(ee2.getBirthYear());
        System.out.println(ee2.getBirthMonth());

        IsikukoodLV lv = new IsikukoodLV("120388-51237");
        System.out.println(lv.isMale());
        System.out.println(lv.getBirthYear());
        System.out.println(lv.getBirthMonth());


    }
}