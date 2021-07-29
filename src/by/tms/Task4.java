/*
 * Задание 2_4
 *
 * Задать две целочисленных переменных и поменять их значения местами
 *
 * Куневич Александр
 */

package by.tms;

public class Task4 {

    public static void main(String[] args) {

        int numberA = 11_223_341;
        int numberB = 20;
        System.out.println("Befor: numberA = " + numberA + " and b = " + numberB);
        int c = numberA;
        numberA = numberB;
        numberB = c;
        System.out.println("After: numberA = " + numberA + " and b = " + numberB);
    }
}
