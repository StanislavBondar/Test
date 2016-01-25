package cook.cooker.myapplication;

/**
 * Created by Stas on 25.01.2016.
 */
public class Test5 {

    public static int divide(int a, int b) {

        try {

            return a / b;

        } catch (Exception e) {

            return 0;

        } finally {

            return 10;

        }

    }
    /**
     * Написать значения которые будут выведены на экран
     */
    public static void main(String[] args) {

        int mInt = divide(11, 1);
        System.out.println(mInt);//-->


    }

}
