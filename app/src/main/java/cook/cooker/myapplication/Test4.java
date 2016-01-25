package cook.cooker.myapplication;

/**
 * Created by Stas on 25.01.2016.
 *
 */
public class Test4 {

    public static int sInt = 0;
    private int mInt = 0;

    public Test4() {
        sInt++;
        mInt++;
    }

    /**
     * Написать значения которые будут выведены на экран
     */
    public static void main(String[] args) {
        Test4 mTestOne = new Test4();
        Test4 mTestTwo = new Test4();
        System.out.println(mTestOne.sInt);//-->
        System.out.println(mTestTwo.mInt);//-->
    }

}
