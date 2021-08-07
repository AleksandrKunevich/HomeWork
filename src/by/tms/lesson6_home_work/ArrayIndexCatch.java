/*
 * Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.
 */

package by.tms.lesson6_home_work;

public final class ArrayIndexCatch {

    private static int i = 0;

    private ArrayIndexCatch() {
    }

    public static void catchArrayIndexOutOfBoundsException() {
        int[] arrayInt = {1, 2, 3, 4, 5};
        System.out.println("Try catch ArrayIndexOutOfBoundsException: ");
        try {
            for (; i < 6; i++) {
                System.out.print(arrayInt[i] + "\t");
            }
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("\nIndex arrayInt[" + i + "] does not exist.");
            System.out.println("ArrayIndexOutOfBoundsException catched!");
        }
    }
}
