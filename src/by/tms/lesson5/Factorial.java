/*
 * Написать программу высчитывающую факториал введённого целого числа.
 * Нужно 2 варианта: с циклом и с рекурсией
 * 5!=1х2х3х4х5=120
 * !0 = 1
 */

package by.tms.lesson5;

public final class Factorial {

    private Factorial() {
    }

    public static int getFactorianByLoop(int number) {
        if (number > 12) {
            System.out.println("Entered number is too BIG. Return 0.");
            return 0;
        } else if (number <= 0) {
            return 1;
        } else {
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static int getFactorianByRecursion(int number) {
        if (number > 12) {
            System.out.println("Entered number is too BIG. Return 0.");
            return 0;
        }
        if (number <= 0) {
            return 1;
        } else {
            return number * getFactorianByRecursion(number - 1);
        }
    }
}
