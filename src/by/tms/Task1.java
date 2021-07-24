/*
 * Задание 2_1
 *
 * Написать программу, в которой задан один целочисленный параметр и программа рассчитывает значение,
 * равное этому параметру, возведенному в куб.
 *
 * Куневич Александр
 */

package by.tms;

public class Task1 {

    public static void main(String[] args) {

        int number = 2140000000;
        double result1 = (double)number*number*number;
        System.out.println("Double Res = " + result1);

        var result2 = Math.pow(number, 3);
        System.out.println("Math Res = " + result2);

        var result4 = (double)number*number*number;
        System.out.println("Var Res = " + result4);
    }
}
