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

        int a = 11_223_341;
        int b = 20;
        System.out.println("Befor: a = " + a + " and b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("After: a = " + a + " and b = " + b);
    }
}
