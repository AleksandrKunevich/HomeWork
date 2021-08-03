/*
 * Написать программу, определяющую, является ли введённое целое число простым,
 * т.е. делится без остатка только на 1 и само на себя.
 */

package by.tms.lesson5;

public final class SimpleNumber {

    private SimpleNumber() {
    }

    public static boolean isSimpleNumber(int number) {
        number = Math.abs(number);
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
