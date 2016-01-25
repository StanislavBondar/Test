package cook.cooker.myapplication;

/**
 * Created by Stas on 25.01.2016.
 */
public class Test3 {

    boolean mBoolean;
    int mInt[] = new int[1];
    short mShort;
    char mChar;
    float mFloat;
    double mDouble;
    String mString;
    Object mObject;

    public String toString() {
        return mShort + mChar + mFloat + mString + mBoolean +
                mInt[0] + mDouble + mObject;
    }

    /**
     * Написать значения которые будут выведены на экран
     */
    public static void main(String[] args) {

        System.out.println( new Test3());//-->

    }

}
