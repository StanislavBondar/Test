package cook.cooker.myapplication;

/**
 * Created by Stas on 25.01.2016.
 */
public class Test1 {

    static String mString = "abc";

    /**
     * Написать значения которые будут выведены на экран
     */
    public static void main(String[] args) {

        switch (mString) {
            case "ab":
                System.out.println("ab");
            case "abc":
                System.out.println("abc");
            case "abcd":
                System.out.println("abcd");
            default:
                System.out.println("break;");
        }
    }//-->
}
