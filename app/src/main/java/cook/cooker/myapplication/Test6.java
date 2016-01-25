package cook.cooker.myapplication;

/**
 * Created by Stas on 25.01.2016.
 */
public class Test6 {
    /**
     * Написать значения которые будут выведены на экран
     */
    public static void main(String[] args) {

        try {

            System.out.println('a');
            throw new NullPointerException();

        } catch (NullPointerException e) {

            System.out.println('b');
//            throw new Exception();

        } catch (Exception e) {

            System.out.println('c');

        }

    }//-->

}
