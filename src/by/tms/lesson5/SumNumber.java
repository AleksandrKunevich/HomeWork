/*
 * 1. Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
 */

package by.tms.lesson5;

public final class SumNumber {

    public static final int INT_ZERO = 0;
    public static final int INT_TEN = 10;

    private SumNumber() {
    }

    public static int getSumOfNumberByString(int enterNumber) {
        String number = String.valueOf(enterNumber);
        int resSum = INT_ZERO;
        for (int i = INT_ZERO; i < number.length(); i++) {
            resSum += Integer.parseInt(number.substring(i, i + 1));
        }
        return resSum;
    }

    public static int getSumOfNumberByInteger(int enterNumber) {
        int resSum = INT_ZERO;
        while (enterNumber > INT_ZERO) {
            resSum += (enterNumber - enterNumber / INT_TEN * INT_TEN);
            enterNumber /= INT_TEN;
        }
        return resSum;
    }
}
